//package src.com.jetman.atcoder;

import java.util.Arrays;
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
        long[] a = new long[n];
        for (int i = 0; i < n ; i++) {
            a[i] = sc.nextLong();
        }

        long ans = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                ans = (ans + a[i]*a[j])%MOD;
            }
        }

        System.out.println(ans);

    }

    public static void main(String[] args) {
        new Main().slove();
    }
}
