import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	int n, m;
	int[][][] dp;
	int[][] map;
	int[] cost;
	int[] vx = {1, 0, -1, 0};
	int[] vy = {0, 1, 0, -1};
	
	void dijkstra(int dir, int x, int y) {
		if (dp[dir][y][x] == -1) return;
		//debug(dir);
		int order = map[y-1][x-1];
		int go = (order == 4) ? -1 : (order + dir) % 4;
		for (int i = 0; i < vx.length; i++) {
			int nx = x + vx[i], ny = y + vy[i];
			int c = (go == i) ? 0 : cost[(i - dir + 4) % 4];
			if (dp[dir][y][x] != Integer.MAX_VALUE && dp[i][ny][nx] > dp[dir][y][x] + c) {
				dp[i][ny][nx] = dp[dir][y][x] + c;
				dijkstra(i, nx, ny);
			}
		}
	}
	
	public void run() {
		while (true) {
			n = in.nextInt();
			m = in.nextInt();
			if ((n|m) == 0) break;

			map = new int[m][n];
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					map[i][j] = in.nextInt();
				}
			}
			
			cost = new int[4];
			for (int i = 0; i < cost.length; i++) {
				cost[i] = in.nextInt();
			}
			
			dp = new int[4][m+2][n+2];			
			for (int i = 0; i < dp.length; i++) {
				for (int j = 0; j < dp[i].length; j++) {
					for (int k = 0; k < dp[i][j].length; k++) {
						if (j == 0 || j == m + 1 || k == 0 || k == n + 1) 
							dp[i][j][k] = -1;
						else
							dp[i][j][k] = Integer.MAX_VALUE;
					}
				}
			}
			
			
			dp[0][1][1] = 0;
			dijkstra(0, 1, 1);
			
			for (int i = 0; i < 4; i++) {
				//debug(i);
			}
			int res = Integer.MAX_VALUE;
			for (int i = 0; i < dp.length; i++) {
				res = Math.min(res, dp[i][m][n]);
			}
			
			System.out.println(res);
		}
	}
	
	void debug(int i) {
		System.out.println("dir = " + i);
		for (int j = 1; j < dp[i].length - 1; j++) {
			for (int k = 1; k < dp[i][j].length - 1; k++) {
				System.out.print((dp[i][j][k] == Integer.MAX_VALUE ? "F" : dp[i][j][k]) + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}