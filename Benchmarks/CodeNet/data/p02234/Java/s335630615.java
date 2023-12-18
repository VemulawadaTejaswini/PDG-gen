import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
 
public class Main {
  public static void main(String[] args) {
    int INF = 1000000000;
    int N = 100;
    int i, j, k, l;

    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int s[] = new int[n+1];
    int dp[][] = new int[n+1][n+1];
    for (i=0; i<n; i++) {
      s[i] = Integer.parseInt(sc.next()); 
      s[i+1] = Integer.parseInt(sc.next()); 
    }

    for (i=0; i<=n; i++)
      Arrays.fill(dp[i], 0);

    for (l=2; l<=n; l++)
      for (i=1; i<=n-l+1; i++) {
        j = i + l - 1;
        dp[i][j] = INF;
        for (k=i; k<j; k++)
          dp[i][j] = min(dp[i][j], dp[i][k] + dp[k+1][j] + s[i-1]*s[k]*s[j]);
      }

    System.out.println(dp[1][n]);
  }
}