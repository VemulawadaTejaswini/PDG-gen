import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int N = scanner.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = scanner.nextInt();
      B[i] = scanner.nextInt();
    }

    int[] dp = new int[H + 1];
    final int INF = 1_000_000_000;
    for (int i = 1; i <= H; i++) dp[i] = INF;

    for (int i = 1; i <= H; i++) {
      for (int j = 0; j < N; j++) {
        int p = i - A[j];
        if (p < 0) p = 0;
        dp[i] = Math.min(dp[i], dp[p] + B[j]);
      }
    }
    System.out.println(dp[H]);
  }
}
