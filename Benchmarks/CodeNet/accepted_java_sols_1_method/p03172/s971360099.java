import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
    private static final long MOD = (int)1e9 + 7;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = in.nextInt();

        long[][] dp = new long[n + 1][k + 1];
        long[][] pre = new long[n + 1][k + 1];

        for (int i = 0; i <= a[0]; ++i) dp[0][i] = 1;

        pre[0][0] = dp[0][0];
        for (int i = 1; i <= k; ++i) pre[0][i] = (pre[0][i - 1] + dp[0][i]) % MOD;

        for (int i = 1; i < n; ++i) {
            for (int j = 0; j <= k; ++j) {
                if (j > a[i]) {
                    dp[i][j] = (pre[i - 1][j] + MOD - pre[i - 1][j - a[i] - 1]) % MOD;
                } else {
                    dp[i][j] = pre[i - 1][j];
                }
            }

            pre[i][0] = dp[i][0] % MOD;
            for (int x = 1; x <= k; ++x) {
                pre[i][x] = (pre[i][x - 1] + dp[i][x]) % MOD;
            }
        }

        System.out.println(dp[n - 1][k] % MOD);
    }
}