import java.util.*;

public class Main {
  public static void main(String[] args) {
    long MOD = (long)Math.pow(10, 9) + 7;
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int len = s.length();
    long[][] dp = new long[len][13];
    if(s.charAt(0) == '?') {
      for(int j = 0; j < 10; j++) {
        dp[0][j] = 1;
      }
    } else {
      int d = Integer.parseInt(String.valueOf(s.charAt(0)));
      dp[0][d] = 1;
    }
    for(int i = 1; i < len; i++) {
      if(s.charAt(i) == '?') {
        for(int j = 0; j < 13; j++) {
          for(int k = 0; k < 10; k++) {
            dp[i][(10 * j + k) % 13] = (dp[i][(10 * j + k) % 13] + dp[i - 1][j]) % MOD;
          }
        }        
      } else {
        for(int j = 0; j < 13; j++) {
          int d = Integer.parseInt(String.valueOf(s.charAt(i)));
          dp[i][(10 * j + d) % 13] = (dp[i][(10 * j + d) % 13] + dp[i - 1][j]) % MOD;
        }        
      }
    }
    System.out.println(dp[len - 1][5]);
  }
}
