import java.util.*;
import java.util.stream.*;

public class Main {
  public static final long MOD = (long)1e9 + 7;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[] S = in.nextLine().toCharArray();
    long[][] dp = new long[S.length + 1][13];
    dp[0][0] = 1;

    for (int i = 0; i < S.length; i++) {
      int c = S[i] == '?' ? -1 : S[i] - '0';
      for (int j = 0; j < 10; j++) {
        if (c != -1 && c != j) {
          continue;
        }
        for (int k = 0; k < 13; k++) {
          dp[i + 1][(k * 10 + j) % 13] += dp[i][k];
        }
      }
      for (int k = 0; k < 13; k++) {
        dp[i + 1][k] %= MOD;
      }
    }
    System.out.println(dp[S.length][5]);
  }
}