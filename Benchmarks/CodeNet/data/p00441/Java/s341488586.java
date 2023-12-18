import java.util.*;

public class Main {
	private int[][] pos;
	private int[][][] dis;

	public static void main(String[] args) {
		new Main().run();
		
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int n = scan.nextInt();
			if(n == 0) break;
			
			pos = new int[n][2];
			for (int i = 0; i < n; i++) {
				pos[i][0] = scan.nextInt();
				pos[i][1] = scan.nextInt();
			}
			
			dis = new int[n][n][2];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					dis[i][j][0] = pos[j][0] - pos[i][0];
					dis[i][j][1] = pos[j][1] - pos[i][1];
				}
			}
			
			int max = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					int x = dis[i][j][0];
					int y = dis[i][j][1];
					for (int k = 0; k < n; k++) {
						if (x == dis[j][k][1] && y == -dis[j][k][0]) {
							for (int l = 0; l < n; l++) {
								if (x == -dis[k][l][0] && y == -dis[k][l][1]) {
									if (x == -dis[l][i][1] && y == dis[l][i][0]) {
										max = Math.max(max, x * x + y * y);
									}
								}
							}
						}
					}
				}
			}
			System.out.println(max);
		}
	}
}