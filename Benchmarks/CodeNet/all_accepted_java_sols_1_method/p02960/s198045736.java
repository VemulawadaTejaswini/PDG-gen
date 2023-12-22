import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int[][] dp = new int[S.length()+1][13];
    for (int i = 1; i <= S.length(); i++) {
      char c  = S.charAt(i-1);
      for (int j = 0; j < 13; j++) {
        if (i > 1 && dp[i-1][j] == 0) {
          // skip
          continue;
        }
        
        if (c == '?') {
          for (int k = 0; k <= 9; k++) {
            int val = k;
            if (dp[i-1][j] > 0) {
              val += 10*j;
              dp[i][val%13] += dp[i-1][j];
            } else {
              dp[i][val%13] = 1;
            }
            dp[i][val%13] %= 1_000_000_007;
          }
        } else {
          int val = c - '0';
          if (dp[i-1][j] > 0) {
            val += 10*j;
            dp[i][val%13] += dp[i-1][j];
          } else {
            dp[i][val%13] = 1;
          }
          dp[i][val%13] %= 1_000_000_007;
        }
      }
    }
    //System.out.println(Arrays.deepToString(dp));
    System.out.println(dp[S.length()][5]);
  }
}