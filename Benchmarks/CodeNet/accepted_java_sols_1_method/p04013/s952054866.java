import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int A = scanner.nextInt();

    int[] x = new int[N + 1];
    for (int i = 1; i <= N; i++) x[i] = scanner.nextInt();

    long[][][] dp = new long[N + 1][N + 1][2501];
    for (int i = 0; i <= N; i++) dp[i][0][0] = 1;
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= i; j++) {
        for (int k = 1; k <= 2500; k++) {
          dp[i][j][k] = dp[i - 1][j][k];
          if (k >= x[i]) dp[i][j][k] += dp[i - 1][j - 1][k - x[i]];
        }
      }
    }

    long count = 0;
    for (int j = 1; j <= N; j++) count += dp[N][j][A * j];
    System.out.println(count);
  }
}
