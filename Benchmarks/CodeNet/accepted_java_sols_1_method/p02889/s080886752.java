import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int m = std.nextInt();
        int l = std.nextInt();
        int[] c = new int[m];
        long[][] dp = new long[n][n];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = 0;
        }

        for (int i = 0; i < m; i++) {
            int a = std.nextInt() - 1;
            int b = std.nextInt() - 1;
            c[i] = std.nextInt();
            dp[a][b] = c[i];
            dp[b][a] = c[i];
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
                }
            }
        }

        long[][] dp2 = new long[n][n];
        for (int i = 0; i < dp2.length; i++) {
            Arrays.fill(dp2[i], Integer.MAX_VALUE);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] <= l) {
                    dp2[i][j] = 1;
                }
            }
        }


        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dp2[i][j] = Math.min(dp2[i][j], dp2[i][k] + dp2[k][j]);
                }
            }
        }

        // q
        int q = std.nextInt();

        List<Long> results = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int s = std.nextInt() - 1;
            int t = std.nextInt() - 1;
            if (dp2[s][t] == Integer.MAX_VALUE) {
                results.add(-1L);
                continue;
            }
            long ans = dp2[s][t] - 1;
            results.add(ans);
        }

        results.forEach(System.out::println);
    }
}
