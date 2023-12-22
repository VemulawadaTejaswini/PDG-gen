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

    long[][] dp = new long[N+1][100000+1];

    long INF = 1000000001;
    
    for (int j = 0; j <= 100000; j++) {
      dp[0][j] = INF;
    }

    dp[0][0] = 0;

    for (int i = 0; i < N; i++) {
      for (int j = 0; j <= 100000; j++) {
        if (j < v[i]) {
          dp[i + 1][j] = dp[i][j];
        } else {
          dp[i + 1][j] = Math.min(dp[i][j], dp[i][j - v[i]] + w[i]);
        }
      }
    }

    long result = INF;

    for (int i = 0; i <= 100000; i++) {
      if (dp[N][i] <= W) {
        result = i;
      }
    }

    System.out.println(result);

  }

}