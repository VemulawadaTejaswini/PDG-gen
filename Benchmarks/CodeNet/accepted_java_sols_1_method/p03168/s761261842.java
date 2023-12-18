import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        double[][] dp = new double[n + 1][n + 1];
        double[] ps = new double[n];
        for (int i = 0; i < n; i++) {
            ps[i] = std.nextDouble();
        }

        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] == 0) {
                    continue;
                }
                dp[i + 1][j] += dp[i][j] * (1 - ps[i]);
                dp[i + 1][j + 1] += dp[i][j] * ps[i];
            }
        }

        int count = n / 2 + 1;
        double ans = 0;
        for (int i = count; i <= n; i++) {
            ans += dp[n][i];
        }

        System.out.println(ans);
    }
}
