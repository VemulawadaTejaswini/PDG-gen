import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
//dp[i][j] := dp[s[0]...s[i-1]?????§][t[0]....t[j-1]?????§]???LCS
//(1<=i<=ls, 1<=j<=lt)
 
public class Main {
  public static void main(String[] args) {
    int n = 1000;
    int i, j, k;
    int dp[][] = new int[n+1][n+1];
    String s, t;
    Scanner sc = new Scanner(System.in);
    int q = Integer.parseInt(sc.next());
    for (k=0; k<q; k++) {
      s = sc.next();
      t = sc.next();

      for (i=0; i<=n; i++)
        Arrays.fill(dp[i], 0);
      for (i=1; i<=s.length(); i++)
        for (j=1; j<=t.length(); j++) {
          if (s.charAt(i-1)==t.charAt(j-1)) 
            dp[i][j] = dp[i-1][j-1] + 1;
          else
            dp[i][j] = max(dp[i-1][j], dp[i][j-1]);
        }
      System.out.println(dp[s.length()][t.length()]);  
    }
  }
}