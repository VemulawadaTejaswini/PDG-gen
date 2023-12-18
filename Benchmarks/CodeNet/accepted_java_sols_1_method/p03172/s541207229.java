import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MOD = (int) 1e9 + 7;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int[][] dp = new int[n + 1][k + 1];

        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            int[] prefixSum = new int[k + 1];
            prefixSum[0] = dp[i - 1][0];
            for (int j = 1; j <= k; j++) {
                prefixSum[j] = (prefixSum[j - 1] + dp[i - 1][j]) % MOD;
            }

            for (int j = 0; j <= k; j++) {
                if (j <= arr[i]) {
                    dp[i][j] = prefixSum[j];
                } else {
                    dp[i][j] = (prefixSum[j] - prefixSum[j - arr[i] - 1] + MOD) % MOD;
                }
            }
        }
        // System.out.println(Arrays.deepToString(dp));
        System.out.println(dp[n][k]);
    }
}
