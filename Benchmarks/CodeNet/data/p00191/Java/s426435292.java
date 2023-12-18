import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if ((n | m) == 0)
                break;
            double f[][] = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    f[i][j] = sc.nextDouble();
                }
            }
            double dp[][] = new double[m + 1][n]; // dp[i][j] :
            // i回目にj番目の肥料を与えた時に得られる最大の成長度
            // dp[i][j] =
            // Max(dp[i-1][k]*f[k][j](0<=k<=n-1))
            Arrays.fill(dp[1], 1.0);
            for (int i = 1; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    double max = 0;
                    for (int k = 0; k < n; k++) {
                        max = Math.max(max, dp[i][k] * f[k][j]);
                    }
                    dp[i + 1][j] = max;
                }
            }
            double ans = 0;
            for (int i = 0; i < n; i++) {
                ans = Math.max(ans, dp[m][i]);
            }
            System.out.printf("%.2f\n", ans);

        }
    }
}