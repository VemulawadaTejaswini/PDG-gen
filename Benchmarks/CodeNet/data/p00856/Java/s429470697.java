import java.util.Scanner;


public class Main {
	Scanner in = new Scanner(System.in);
	int N, T, L, B;
	double[][] dp;
	boolean[] lose, back;
	
	public void run() {
		while (true) {
			N = in.nextInt();
			T = in.nextInt();
			L = in.nextInt();
			B = in.nextInt();
			if (B == 0 && N == 0 && T == 0 && L == 0) break;
			dp = new double[T+2][N+1];
			lose = new boolean[N+1];
			back = new boolean[N+1];
			dp[0][0] = 1;
			for (int i = 0; i < L; i++) {
				lose[in.nextInt()] = true;
			}
			for (int i = 0; i < B; i++) {
				back[in.nextInt()] = true;
			}
			
			for (int i = 0; i < T; i++) {
				for (int j = 0; j < N; j++) {
					if (dp[i][j] != 0) {
						for (int k = 1; k <= 6; k++) {
							int next = j + k;
							if (next > N) {
								next = 2*N - next;
							}
							if (lose[next]) {
								dp[i+2][next] += dp[i][j] / 6;
							} else if (back[next]) {
								dp[i+1][0] += dp[i][j] / 6;
							} else {
								dp[i+1][next] += dp[i][j] / 6;
							}
						}
					}
				}
			}
			double ans = 0;
			for (int i = 1; i <= T; i++) {
				ans += dp[i][N];
			}
			
			System.out.println(ans);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

}