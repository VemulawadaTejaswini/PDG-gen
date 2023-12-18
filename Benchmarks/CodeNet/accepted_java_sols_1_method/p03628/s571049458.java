//   xx  x6
//   yy
//
//   z   x3
//   z
//
// xxz   x1
// yyz
//
// xxaa  x3
// yybb
//
//  xz   x2
//  xz
//
//  xaa  x2
//  xbb

import java.util.*;

public class Main {
  private static final int MOD = 1_000_000_007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    char[][] d = new char[2][N];
    for (int i = 0; i < 2; i++) {
      String s = sc.next();
      for (int j = 0; j < N; j++) {
        d[i][j] = s.charAt(j);
      }
    }
    // 0: x  1: xx
    //    x     yy
    int prev;
    int j = d[0][0] == d[1][0] ? 1 : 2;
    long ans = d[0][0] == d[1][0] ? 3 : 6;
    while (j < N) {
      if (d[0][j] == d[1][j]) {
        ans *= d[0][j-1] == d[1][j-1] ? 2 : 1;
        j++;
      } else {
        ans *= d[0][j-1] == d[1][j-1] ? 2 : 3;
        j += 2;
      }
      ans %= MOD;
    }
    System.out.println(ans);
  }
}