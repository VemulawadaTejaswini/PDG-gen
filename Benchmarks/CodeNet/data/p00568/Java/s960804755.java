import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int[][] a = new int[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int[][][] dp = new int[h][w][h * w];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				for(int k = 0; k < h * w; k++) {
					dp[i][j][k] = 100000000;
				}
			}
		}
		dp[0][0][0] = 0;
		
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		for(int k = 0; k < h * w - 1; k++) {
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					for(int v = 0; v < 4; v++) {
						int x = i + dx[v];
						int y = j + dy[v];
						if(x >= 0 && x < h && y >= 0 && y < w) {
							dp[x][y][k + 1] = Math.min(dp[x][y][k + 1], dp[i][j][k] + (2 * k + 1) * a[x][y]);
						}
					}
				}
			}
		}
		
		int ans = Integer.MAX_VALUE;
		for(int k = 0; k < h * w; k++) {
			ans = Math.min(ans, dp[h - 1][w - 1][k]);
		}
		System.out.println(ans);
	}
}
