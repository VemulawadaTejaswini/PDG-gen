import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        double[] p = new double[n];

        for (int i = 0; i < n; i++) {
            p[i] = Double.parseDouble(sc.next());
        }

        double[][] dp = new double[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = 0;
            }
        }

        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                dp[i + 1][j] += dp[i][j] * (1 - p[i]);
                dp[i + 1][j + 1] += dp[i][j] * p[i];
            }
        }

        double result = 0;
        for (int i = (n / 2) + 1; i <= n; i++) {
            result += dp[n][i];
        }

        System.out.println(result);
    }
}
