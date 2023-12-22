

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner in;

    private static int n, k;
    private static int[] a;
    private static long[][] dp;
    private static int MOD = (int)1e9+7;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        a = new int[n];
        for(int i=0; i<n; i++) a[i] = in.nextInt();

        dp = new long[n+1][k+1];

        dp[n][0] = 1; //dp[n][kLeft] = 0 for all other kLeft

        long[] pre = new long[k+1];
        Arrays.fill(pre, 1);

        for(int i=n-1; i>=0; i--) {
            for(int kLeft=0; kLeft<=k; kLeft++) {
                dp[i][kLeft] += (pre[kLeft]-(kLeft-a[i]-1>=0?pre[kLeft-a[i]-1]:0)+MOD)%MOD;
            }

            pre[0] = dp[i][0];

            for(int j=1; j<pre.length; j++) {
                pre[j] = (pre[j-1]+dp[i][j])%MOD;
            }
        }

        System.out.println(dp[0][k]);


    }
    
    
}
