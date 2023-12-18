import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int l = sc.nextInt();
			int K = sc.nextInt();
			int a = sc.nextInt();
			int h = sc.nextInt();
			if(n == 0)break;
			int[] list = new int[l];
			
			for(int i = 0; i < l; i++) {
				list[i] = sc.nextInt();
				if(list[i] == 0) {
					list[i] = a;
				}
				if(list[i] == n-1) {
					list[i] = h;
				}
			}
			Arrays.sort(list);
			int[][] d = new int[n][n];
			for(int i = 0; i < n; i++) {
				Arrays.fill(d[i], 2 << 27);
			}
			for(int i = 0; i < K; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int t = sc.nextInt();
				boolean xC = false;
				boolean yC = false;
				if(x == a) {
					x = 0;
					xC = true;
				}
				if(y == a) {
					y = 0;
					yC = true;
				}
				if(x == h) {
					x = n-1;
					xC = true;
				}
				if(y == h) {
					y = n-1;
					yC = true;
				}
				if(x == 0 && !xC) {
					x = a;
				}
				if(y == 0 && !yC) {
					y = a;
				}
				if(x == n-1 && !xC) {
					x = h;
				}
				if(y == n-1 && !yC) {
					y = h;
				}
				d[x][y] = t;
				d[y][x] = t;
			}
			
			for(int k = 0; k < n; k++) {
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n; j++) {
						d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
					}
				}
			}
			
			
			int[][] dp = new int[n][m+1];
			
			for(int i = 0; i < n; i++) {
				Arrays.fill(dp[i], 2 << 27);
			}
			
			dp[0][m] = 0;
			for(int p = 0; p < 4; p++)
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m+1; j++) {
					if(dp[i][j] == 2 << 27) continue;
					for(int k = 0; k < n; k++) {
					
						int mint = j - d[i][k];
						if(mint < 0) {
							continue;
						}
						if(Arrays.binarySearch(list, k) >= 0) {
							for(int x = mint; x <= m; x++) {
								dp[k][x] = Math.min(dp[k][x], dp[i][j] + d[i][k]+ (x-mint));
							}
						}
						else {
							dp[k][mint] = Math.min(dp[k][mint], dp[i][j] + d[i][k]);
						}
					}
				}
			}
			int min = 2 << 27;

			for(int i = 0; i < m+1; i++) {
				min = Math.min(min, dp[n-1][i]);
			}
			
			if(min == 2 << 27) {
				System.out.println("Help!");
			}
			else {
				System.out.println(min);
			}			
		}
		
		
		
		
		
	}
}                  