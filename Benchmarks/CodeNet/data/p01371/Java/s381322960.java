import java.util.Arrays;
import java.util.Scanner;


public class Main {
	Scanner in = new Scanner(System.in);
	int N;
	int[][] map;
	int[] dp;
	
	public void run() {
		while (true) {
			N = in.nextInt();
			if (N == 0) break;
			map = new int[N][N+1];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= N; j++) {
					map[i][j] = in.nextInt();
				}
			}
			dp = new int[1 << N];
			Arrays.fill(dp, Integer.MAX_VALUE);
			dp[0] = 0;
			
			for (int i = 0; i < dp.length; i++) {			
				for (int k = 0; k < N; k++) {
					int before = i & ~(1 << k);
					if (dp[before] != Integer.MAX_VALUE) {
						int min = map[k][0];
						for (int j = 0; j < N; j++) {
							if ((before >> j) % 2 == 1) {
								min = Math.min(map[k][j+1], min);
							}
						}
						dp[i] = Math.min(min + dp[before], dp[i]);
					}
				}
			}
			
			System.out.println(dp[(1 << N) - 1]);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}