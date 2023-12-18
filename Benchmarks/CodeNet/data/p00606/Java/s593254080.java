import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {
			while(true) {
				int n = sc.nextInt();
				if(n == 0)	break;
				int[][] cor = {{0, 2}, {1, 2}, {2, 2}, {0, 1}, {1, 1}, {2, 1}, {0, 0}, {1, 0}, {2, 0}};
				double[][][] dp = new double[3][3][n+1];
				int[][] dis = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
				double e = 1.0 / 4.0;
				//dp[x][y][バッテリー] バッテリーの時のx.yにいる確率
				//dp[x][y][ba] = dp[x-1][y][ba+1]*1/4+...
				String dummy = sc.nextLine();
				String str = sc.nextLine();
				String[] s = str.split(" ");
				int sx = cor[s[0].charAt(0) - 'A'][0];
				int sy = cor[s[0].charAt(0) - 'A'][1];
				int tx = cor[s[1].charAt(0) - 'A'][0];
				int ty = cor[s[1].charAt(0) - 'A'][1];
				int bx = cor[s[2].charAt(0) - 'A'][0];
				int by = cor[s[2].charAt(0) - 'A'][1];
				
				for(int x=0; x<3; x++) {
					for(int y=0; y<3; y++) {
						for(int i=0; i<n+1; i++) {
							dp[x][y][i] = 0.0;
						}
					}
				}
				dp[sx][sy][n] = 1.0;
				
				for(int i=n; i>0; i--) {
					for(int x=0; x<3; x++) {
						for(int y=0; y<3; y++) {
							for(int next=0; next<4; next++) {
								int nx = x + dis[next][0];
								int ny = y + dis[next][1];
								if(nx == x && ny == y) {
									continue;
								}
								else if(nx==bx && ny==by) {
									dp[x][y][i-1] += dp[x][y][i]*e;
								}
								else if((nx<0 || nx>2) || (ny<0 || ny>2)) {
									dp[x][y][i-1] += dp[x][y][i]*e;
								}
								else {
									dp[nx][ny][i-1] += dp[x][y][i]*e;
								}
							}
						}
					}
				}
				System.out.printf("%.8f\n", dp[tx][ty][0]);
			}
		}
	}

}


