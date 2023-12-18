
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] probs = new double[n];
        for (int i = 0; i < n; i++) {
            probs[i] = sc.nextDouble();
        }

        double[][] dp = new double[n + 1][n + 1];
        dp[0][0] = 1.0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {

                double p1 = dp[i-1][j];
                double p2 = (j > 0) ? dp[i-1][j-1] : 0;
                double p = probs[i - 1];
                dp[i][j] = p1 * (1.0 - p) + p2 * p;
            }
        }

        double result = 0.0;
        for (int i = n/2 + 1; i <= n; i++) {
            result += dp[n][i];
        }

        System.out.println(result);

    }
}