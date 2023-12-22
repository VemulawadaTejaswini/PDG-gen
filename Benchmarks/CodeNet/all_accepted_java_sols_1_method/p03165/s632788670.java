import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    sc.close();

    int[][] dp = new int[s.length() + 1][t.length() + 1];
    for (int si = 1; si < s.length() + 1; si++)
      for (int ti = 1; ti < t.length() + 1; ti++)
        dp[si][ti] = s.charAt(si - 1) == t.charAt(ti - 1)
            ? dp[si - 1][ti - 1] + 1
            : Math.max(dp[si - 1][ti], dp[si][ti - 1]);

    char[] buf = new char[dp[s.length()][t.length()]];
    int bi = buf.length - 1;
    int tail = t.length();
    for (int si = s.length(); 0 < si; si--)
      for (int ti = tail; 0 < ti; ti--)
        if (dp[si][ti - 1] < dp[si][ti]) {
          if (s.charAt(si - 1) == t.charAt(ti - 1)) {
            buf[bi] = t.charAt(ti - 1);
            bi--;
            tail = ti - 1;
          }
          break;
        }

    System.out.println(new String(buf));
  }
}