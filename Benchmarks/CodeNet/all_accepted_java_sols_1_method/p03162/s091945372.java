import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    int[] b = new int[N];
    int[] c = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
      b[i] = scanner.nextInt();
      c[i] = scanner.nextInt();
    }

    int dp[][] = new int[N][3];
    dp[0][0] = a[0];
    dp[0][1] = b[0];
    dp[0][2] = c[0];
    for (int i = 1; i < N; i++) {
      dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][2]) + a[i];
      dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + b[i];
      dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1]) + c[i];
    }

    int max = dp[N - 1][0];
    max = Math.max(max, dp[N - 1][1]);
    max = Math.max(max, dp[N - 1][2]);
    System.out.println(max);
  }
}
