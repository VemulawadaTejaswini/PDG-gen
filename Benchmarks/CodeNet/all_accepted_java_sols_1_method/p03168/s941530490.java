import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double[] p = new double[N];
    for (int i = 0; i < N; i++)
      p[i] = sc.nextDouble();
    sc.close();

    double[][] dp = new double[N][N + 1];
    dp[0][0] = 1d - p[0];
    dp[0][1] = p[0];
    for (int i = 0; i < N - 1; i++) {
      for (int j = 0; j < i + 2; j++) {
        dp[i + 1][j] += dp[i][j] * (1d - p[i + 1]);
        dp[i + 1][j + 1] += dp[i][j] * p[i + 1];
      }
    }

    double ans = 0;
    for (int i = (N + 1) / 2; i < N + 1; i++) ans += dp[N - 1][i];
    System.out.println(ans);
  }
}