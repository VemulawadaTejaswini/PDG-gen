//package src.com.jetman.atcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @author: Jetman
 * @create: 2020-08-29 14:39
 **/
public class Main {

    Scanner sc = new Scanner(System.in);

    long MOD = 1000000000 + 7;


    private void slove() {

        int n = sc.nextInt();

        long dp[] = new long[n+1];
        long dpx[] = new long[n+1];
        dp[1] = 0;
        dpx[1] = 1;
        long pow = 8;
        for (int i = 2; i <= n ; i++) {
            dp[i] = ((dp[i-1]*10)%MOD + dpx[i-1]*2)%MOD;
            dpx[i] = (dpx[i-1]*9 + pow)%MOD;
            pow = (pow*8)%MOD;
        }



        System.out.println(dp[n]);





    }

    public static void main(String[] args) {
        new Main().slove();
    }
}
