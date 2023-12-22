import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] p = new double[N + 1];
        for (int i = 1; i <= N; i++) {
            p[i] = sc.nextDouble();
        }

        double[][] dp = new double[N + 1][N + 1];
        dp[0][0] = 1.0;
        for (int i = 1; i <= N; i++) {
            dp[i][0] = dp[i - 1][0] * (1 - p[i]);
            for (int j = 1; j <= i; j++) {
                dp[i][j] = dp[i - 1][j] * (1 - p[i]) + dp[i - 1][j - 1] * p[i];
            }
        }

        double res = 0.0;

        for (int i = N; i > N - i; i--) {
            res += dp[N][i];
        }



        System.out.println(res);
    }
}
