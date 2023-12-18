import java.util.*;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
	static int[][] dp;
	static int[] p;

	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] c = new int[m+1];
    int[][] dp = new int[m+1][n+1];

    for (int i = 1; i <= m; i++) {
      c[i] = sc.nextInt();
    }
    sc.close();

    for (int i = 0; i <= m; i++) {
      dp[i][0] = 0;
    }
    for (int j = 1; j <= n; j++) {
      dp[0][j] = 1000000;
    }

    for (int i = 1; i <= m; i++) {
      dp[i][0] = 0;
      for (int j = 0; j <= n; j++) {
        if(j-c[i] >= 0) dp[i][j] = min(dp[i-1][j], dp[i][j-c[i]]+1);
        else dp[i][j] = dp[i-1][j];
      }
    }

    out.println(dp[m][n]);
	}

}
