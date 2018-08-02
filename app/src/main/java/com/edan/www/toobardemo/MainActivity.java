package com.edan.www.toobardemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import com.github.badoualy.morphytoolbar.MorphyToolbar;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/8/2 9:53
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener, Toolbar.OnMenuItemClickListener {

    private static final String TAG = "MainActivity";
    private MorphyToolbar mMorphyToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(this);
        toolbar.inflateMenu(R.menu.menu);
        toolbar.setOnMenuItemClickListener(this);

    }


    @Override
    public void onClick(View v) {
        finish();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_notifications:
                Log.e(TAG, "action_notifications ");
                break;
            case R.id.action_search:
                Log.e(TAG, "action_search ");
                break;
            case R.id.action_settings:
                Log.e(TAG, "action_settings ");
                break;
            default:
                break;
        }
        return false;
    }
}
