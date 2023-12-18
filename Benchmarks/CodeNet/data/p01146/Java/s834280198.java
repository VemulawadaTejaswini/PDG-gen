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
			
			dp[a][m] = 0;
			for(int p = 0; p < 2; p++)
			for(int i = 0; i < n; i++) {
				for(int j = m; j >= 0; j--) {
					for(int k = 0; k < n; k++) {
					
						int mint = j - d[i][k];
						if(mint < 0) {
							continue;
						}
						if(Arrays.binarySearch(list, k) >= 0 || k == a || k == h) {
							for(int x = mint; x <= m; x++) {
								dp[k][x] = Math.min(dp[k][x], dp[i][j] + d[i][k]+ (x-mint));
							}
						}
						else {
							dp[k][j - d[i][k]] = Math.min(dp[k][j - d[i][k]], dp[i][j] + d[i][k]);
						}
					}
				}
			}
			int min = 2 << 27;

			for(int i = 0; i < m+1; i++) {
				min = Math.min(min, dp[h][i]);
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