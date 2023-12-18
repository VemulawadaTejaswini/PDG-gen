import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;



public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {	
		//FastScanner sc = new FastScanner();
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int[] p = new int[n];
			int[] t = new int[n];
			for(int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
				t[i] = sc.nextInt();
				if(i != 0) {
				}
			}
			int[][] dp = new int[n+1][4];
			for(int i = 0; i < dp.length; i++) {
				Arrays.fill(dp[i],INF);
			}
			dp[0][0] = 0;
			int BAD = -1;
			for(int i = 0; i < n; i++) {
				boolean ok = false;
				for(int k = 0; k < 4; k++) {
					if(dp[i][k] == INF) continue;
					int len = p[i];
					int time = t[i];
					if(i != 0) {
						len = Math.abs(p[i-1] - p[i]);
						time = t[i] - t[i-1];
					}
					
					if(k + 1 <= 3 && len*(k+1) <= time) {
						if(i != n-1) dp[i+1][k+1] = Math.min(dp[i+1][k+1], dp[i][k] + len);
						else dp[i+1][0] = Math.min(dp[i+1][0], dp[i][k] + len + p[i]);
						ok = true;
					}
					
					if(i != 0 && p[i-1]*(k+1) + p[i] <= time) {
						if(i != n-1) dp[i+1][1] = Math.min(dp[i+1][1], dp[i][k] + p[i-1] + p[i]);
						else dp[i+1][0] =         Math.min(dp[i+1][0], dp[i][k] + p[i-1] + p[i] + p[i]);
						ok = true;
					}
				}
				if(!ok && BAD == -1) {
					BAD = (i+1);
				}
			}
			int LOW = INF;
			for(int i = 0; i < 4; i++) {
				LOW = Math.min(dp[n][0],LOW);
			}
			if(BAD != -1) System.out.println("NG " + BAD);
			else System.out.println("OK " + LOW);
			
			
			
			
			
			
		}
	}
}