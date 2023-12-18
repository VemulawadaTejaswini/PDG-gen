import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static int[][] dp;
	static int n;
	static int m;
	static int[] c;
	static int[] x;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			n = stdIn.nextInt();
			m = stdIn.nextInt();
			if(n == 0 && m == 0) break;
			c = new int[m];
			for(int i = 0; i < m; i++) {
				c[i] = stdIn.nextInt();
			}
			x = new int[n];
			for(int i = 0; i < n; i++) {
				x[i] = stdIn.nextInt();
			}
			
			System.out.println(dp());
		}
	}
	static int INF = 2 << 28;
	public static int dp() {
		dp = new int[n+1][256];
		
		for(int i = 0; i < n+1; i++) {
			Arrays.fill(dp[i], INF);
		}
		dp[0][128] = 0;
		int ans = INF;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 256; j++) {
				if(dp[i][j] == INF) continue;
				for(int k = 0; k < m; k++) {
					int tmp = Math.max(0, Math.min(255, j + c[k]));
					dp[i+1][tmp] = Math.min(dp[i+1][tmp], dp[i][j] + (tmp-x[i])*(tmp-x[i]) );
				}
			}
		}
		for(int i = 0; i < 256; i++) {
			ans = Math.min(ans, dp[n][i]);
		}
		return ans;
		
		
	}
}
	