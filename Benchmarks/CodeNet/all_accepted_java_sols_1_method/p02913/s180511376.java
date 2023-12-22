import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int[][] dp = new int[N+1][N+1];
    int max = 0;
    for (int i = 1; i <= N-1; i++) {
      for (int j = i+1; j <= N; j++) {
        if (S.charAt(i-1) == S.charAt(j-1)) {
          dp[i][j] = dp[i-1][j-1] + 1;
          if (dp[i][j] <= j-i) {
            max = Math.max(max, dp[i][j]);
          }
        }
      }
    }
    System.out.println(max);
  }
}