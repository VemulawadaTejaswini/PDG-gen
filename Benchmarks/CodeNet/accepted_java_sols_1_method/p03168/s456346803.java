import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    double[] p = new double[n];
    double[][] dp = new double[n + 1][n + 1];
    for (int i = 0; i < n; i++) {
      p[i] = Double.parseDouble(scanner.next());
    }
    dp[0][0] = 1;
    for (int i = 1; i < n; i++) {
      dp[i][0] = dp[i - 1][0] * (1 - p[i - 1]);
      dp[0][i] = 0;
    }

    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < i + 1; j++) {
        dp[i][j] = dp[i - 1][j - 1] * p[i - 1] + dp[i - 1][j] * (1 - p[i - 1]);
      }
    }
    System.out.println(Arrays.stream(Arrays.copyOfRange(dp[n], (n + 1) / 2, n + 1)).sum());
  }
}
