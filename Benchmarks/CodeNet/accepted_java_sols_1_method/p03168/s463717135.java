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
            double p_head = probs[i - 1];
            for (int j = 0; j <= n; j++) {
                double p_enough_heads = dp[i - 1][j];
                double p_need_head = (j > 0) ? dp[i - 1][j - 1] : 0;
                dp[i][j] = p_enough_heads * (1.0 - p_head) + p_need_head * p_head;
            }
        }

        double result = 0.0;
        for (int i = n / 2 + 1; i <= n; i++) {
            result += dp[n][i];
        }

        System.out.println(result);

    }
}