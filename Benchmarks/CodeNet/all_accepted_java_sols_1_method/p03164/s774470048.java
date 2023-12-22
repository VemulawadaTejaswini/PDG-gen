import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long W = sc.nextInt();
    long[] w = new long[N];
    int[] v = new int[N];
    int vsum = 0;
    for (int i = 0; i < N; i++) {
      w[i] = sc.nextInt();
      v[i] = sc.nextInt();
      vsum += v[i];
    }
    long[][] dp = new long[N + 1][vsum + 1];
    for (int i = 0; i <= N; i++) {
      for (int j = 0; j <= vsum; j++) {
        dp[i][j] = 11000000000000000L;
      }
    }

    dp[0][0] = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j <= vsum; j++) {
        dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j]);
        if (j + v[i] <= vsum) 
          dp[i + 1][j + v[i]] = Math.min(dp[i + 1][j + v[i]], dp[i][j] + w[i]);
      }
    }

    long ans = 0;
    for (int i = vsum; i >= 0; i--) {
      if (dp[N][i] <= W) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}

