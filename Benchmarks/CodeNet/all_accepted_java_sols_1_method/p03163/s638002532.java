import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int W = in.nextInt();
      int[][] a = new int[N+1][2];
      for (int i = 1; i <= N; i++) {
        a[i][0] = in.nextInt();
        a[i][1] = in.nextInt();
      }
      long[][] dp = new long[N+1][W+1];
      for(int i = 1; i <= N ; i++){
        for(int j = 1; j <= W ; j++){
          if(j - a[i][0] < 0)
            dp[i][j] = dp[i-1][j];
          else
            dp[i][j] = Math.max(dp[i-1][j - a[i][0]] + a[i][1], dp[i-1][j]);
        }
      }
      System.out.println(dp[N][W]);
	}
}
