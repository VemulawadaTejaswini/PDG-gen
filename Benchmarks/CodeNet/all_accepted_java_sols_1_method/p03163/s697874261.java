import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int W = sc.nextInt();
    int[] w = new int[N];
    int[] v = new int[N];

    for (int i = 0; i < N; i++) {
      w[i] = sc.nextInt();
      v[i] = sc.nextInt();
    }

    sc.close();

    long[][] dp = new long[N+1][W+1];

    for (int i = N - 1; 0 <= i; i--) {
      for (int j = 0; j <= W; j++) {
        if (j < w[i]) {
          dp[i][j] = dp[i + 1][j];
        } else {
          dp[i][j] = Math.max(dp[i + 1][j], dp[i + 1][j - w[i]] + v[i]);
        }
      }
    }

    System.out.println(dp[0][W]);

  }

}
