
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final double[] ps = new double[n + 1];
        for (int i = 1; i <= n; i++) {
            ps[i] = in.nextDouble();
        }
        // [win count][current]
        double[][] dp = new double[n + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[0][i] = dp[0][i - 1] * (1 - ps[i]);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                double f1 = dp[i - 1][j - 1] * ps[j];
                double f2 = dp[i][j - 1] * (1 - ps[j]);
                dp[i][j] = f1 + f2;
            }
        }
        double result = 0;
        for (int i = n / 2 + 1; i <= n; i++) {
            result += dp[i][n];
        }
        System.out.println(result);
    }
}
