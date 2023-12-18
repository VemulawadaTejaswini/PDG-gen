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

    int[] fa;
    int fa(int p) {
        return fa[p] == p ? p : (fa[p] = fa(fa[p]));
    }

    private void slove() {

        int n = sc.nextInt();
        int m = sc.nextInt();

        fa = new int[n+1];
        for (int i = 0; i < n; i++) {
            fa[i] = i;
        }
        for (int i = 0; i < m ; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int lfa = fa(l);
            int rfa = fa(r);
            if (lfa != rfa) {
                fa[rfa] = lfa;
            }
        }

        int[] nums = new int[n+1];
        for (int i = 1; i <= n; i++) {
            int ifa = fa(i);
            nums[ifa]++;
        }

        long ans = 0;

        System.out.println(Arrays.stream(nums).max().getAsInt());

    }

    public static void main(String[] args) {
        new Main().slove();
    }
}
