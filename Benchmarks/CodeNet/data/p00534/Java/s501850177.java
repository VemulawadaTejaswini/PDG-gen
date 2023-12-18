import java.util.*;

public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dists = new int[n];
        for (int i = 0; i < n; i++) {
            dists[i] = sc.nextInt();
        }
        int[] costs = new int[m];
        for (int i = 0; i < m; i++) {
            costs[i] = sc.nextInt();
        }
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
            for (int j = i; j <= m; j++) {
                dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + dists[i - 1] * costs[j - 1]);
                for (int k = j + 1; k <= m; k++) {
                    dp[i][k] = dp[i][j];
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= m; i++) {
            min = Math.min(min, dp[n][i]);
        }
        System.out.println(min);
    }
}
