import java.util.Scanner;
import java.lang.Integer;
import java.lang.Math;

class Main {
  private static int[][] dp;

  private static int calc(int N, int M, int[] c) {
    if (N <= 0) {
      return 1;
    }

    for (int i = 1; i < M + 1; i++) {
      for (int j = 0; j < N + 1; j++)  {
        int candidate1 = dp[i - 1][j];
        int candidate2 = ((j - c[i] >= 0) && (c[i] <= N)) ? dp[i][j - c[i]] + 1 : Integer.MAX_VALUE;

        dp[i][j] = Math.min(candidate1, candidate2);
        //System.out.println(((j - c[i] >= 0) && (c[i] <= N)) + " candidate2 " + candidate2);
        //System.out.println("dp[" + i + "]" + "[" + j + "], " + dp[i][j]);
      }
    }

    return dp[M][N];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] c = new int[M+1];
    c[0] = 0;
    for (int i = 1; i < M + 1; i++) {
      c[i] = sc.nextInt();
    }
    dp = new int[M + 1][N + 1];

    // init kind of coin(i) == 0;
    int i = 0;
    for (int j = 0; j < N + 1; j++) {
      if (j == 0) {
        dp[i][j] = 0;
      } else {
        dp[i][j] = Integer.MAX_VALUE;
      }
    }

    int result = calc(N, M, c);

    System.out.println(result);
  }
}