import java.util.*;
public class Main { 
	static int[][] map;
	static int[] dp;
	static int INF = 1 << 24;
	static int n;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			n = stdIn.nextInt();
			if(n == 0) break;
			map = new int[n][n+1];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n+1; j++) {
					map[i][j] = stdIn.nextInt();
				}
			}
			dp = new int[1 << n];
			Arrays.fill(dp, INF);
			dp[0] = 0;
			dp();
			System.out.println(dp[(1 << n)-1]);
			
		}
	}
	public static void dp() {
		
		for(int j = 0; j < (1 << n); j++) {
			if(dp[j] < INF) {
				for(int k = 0; k < n; k++) { //つぎはどこ
					if((j & (1 << (k))) == 0) {
						for(int l = 0; l < n; l++) {
							if(l == 0) {
								dp[(j | 1 << k)] = Math.min(dp[j | 1 << k], dp[j] + map[k][l]);
							}
							if((j & (1 << l)) != 0) {
								dp[(j | 1 << k)] = Math.min(dp[(j | 1 << k)], dp[j] + map[k][l+1]);
							}
						}
					}
				}
			}
		}
	}
}