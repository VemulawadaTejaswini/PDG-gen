//package src.com.jetman.atcoder;

import java.util.*;

/**
 * @description:
 * @author: Jetman
 * @create: 2020-08-29 14:39
 **/
public class Main {

    Scanner sc = new Scanner(System.in);

    long MOD = 998244353L;

    long dp[];

    private void slove() {

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] a = new int[k][2];
        for (int i = 0; i < k; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }

        dp = new long[n+1];
        dp[1] = 1;
        long[] sum = new long[n+1];
        sum[1] = 1;
        for (int i = 2; i <= n ; i++) {
            long tmp = 0;
            for (int j = 0; j < k; j++) {
                int l = i - a[j][1] > 0 ? i - a[j][1]-1 : 0;
                int r = i - a[j][0] > 0 ? i - a[j][0] : 0;
                dp[i] = (dp[i] + sum[r] - sum[l] + MOD)%MOD;
            }
            sum[i] = (sum[i-1] + dp[i])%MOD;
        }


        System.out.println(dp[n]);



    }

    private void build(Map<Integer, List<Integer>> edge, int l, int r) {
        List<Integer> list = edge.getOrDefault(l, new ArrayList<>());
        list.add(r);
        edge.put(l,list);
    }


    public static void main(String[] args) {
        new Main().slove();
    }
}
