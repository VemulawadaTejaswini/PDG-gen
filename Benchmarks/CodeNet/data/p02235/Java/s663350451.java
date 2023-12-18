import java.util.*;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
  static int[][] dp;
	static String x;
	static String y;

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < n; i++) {
      x = sc.nextLine();
      y = sc.nextLine();

      dp = new int[x.length()+1][y.length()+1];
      int ans = lcs(x.length(),y.length());
      out.println(ans);
    }
  }

  static int lcs(int i, int j){
    if (dp[i][j] != 0) return dp[i][j];
    if (i==0 || j==0) return 0;

		if (x.charAt(i-1) == y.charAt(j-1)) return dp[i][j] = lcs(i-1,j-1)+1;
		else return dp[i][j] = Math.max(lcs(i-1,j), lcs(i,j-1));
  }
}
