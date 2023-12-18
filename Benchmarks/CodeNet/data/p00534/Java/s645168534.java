import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
   
   
public class Main {
	static int INF = 2 << 29;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] d = new int[n];
		for(int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		int[] c = new int[m];
		for(int i = 0; i < m; i++) {
			c[i] = sc.nextInt();
		}
		int[][] dp = new int[m+1][n+1];
		for(int i = 0; i < m+1; i++) {
			Arrays.fill(dp[i], INF);
			dp[i][0] = 0;
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n+1; j++) {
				dp[i+1][j]   = Math.min(dp[i+1][j], dp[i][j]);
				if(j != n)
				dp[i+1][j+1] = Math.min(dp[i+1][j+1], dp[i][j] + d[j]*c[i]);
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < m+1; i++) {
			min = Math.min(min, dp[i][n]);
		}
		System.out.println(min);
		
		
		
		
		
		
		
		
	}
}