import java.util.Scanner;
public class Main {
	static int n;
	static int m;
	static String s;
	static String t;
	static int[][] dp;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int K = stdIn.nextInt();
		for(int ii = 0; ii < K; ii++) {
			String sS = stdIn.next();
			String tS = stdIn.next();
		
			n = sS.length();
			m = tS.length();
			s = sS;
			t = tS;
			dp = new int[n+1][m+1];
		
			for(int i = 0; i < n+1; i++) {
				for(int j = 0; j < m+1; j++) {
					dp[i][j] = -1;
				}
			}
		
			int ans = sorv(0,0);
			System.out.println(ans);
		}
	}
	
	static int sorv(int i, int p) {
		if(dp[i][p] != -1) return dp[i][p];
		if(i == n || p == m) {
			return 0;
		}
		int tmp = t.indexOf(Character.toString(s.charAt(i)), p);
		int c0 = 0;
		int c1 = 0;
		if(tmp >= 0) {
			c0 = sorv(i+1,tmp+1)+1;
			c1 = sorv(i+1,p);
		}
		int c2 = sorv(i+1,p);
		
		int max = c0;
		if(max < c1) max = c1;
		if(max < c2) max = c2;
		
		dp[i][p] = max;
		return max;
		
	}

}