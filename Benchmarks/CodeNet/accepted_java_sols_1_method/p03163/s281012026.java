import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    while (input.hasNext()) {
      int N = input.nextInt();
      int W = input.nextInt();
      int[] w = new int[N + 1];
      int[] v = new int[N + 1];
      
      for (int i = 1; i < w.length; ++i) {
        w[i] = input.nextInt();
        v[i] = input.nextInt();
      }
      
      long[][] dp = new long[N + 1][W + 1];
      for(int i = 1; i < dp.length; ++i) {
        for (int j = 1; j < dp[i].length; ++j) {
          dp[i][j] = dp[i - 1][j];
          if (j - w[i] >= 0) {
            dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - w[i]] + v[i]);
          }
        }
      }
      
      System.out.println(dp[N][W]);
    }
  }
}