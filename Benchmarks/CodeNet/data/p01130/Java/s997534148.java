import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int M = sc.nextInt();
			int S = sc.nextInt() - 1;
			int G1 = sc.nextInt() - 1;
			int G2 = sc.nextInt() - 1;
			int[][] dist = new int[N][N];
			for (int i = 0; i < N; ++i) {
				Arrays.fill(dist[i], 1 << 25);
				dist[i][i] = 0;
			}
			for (int i = 0; i < M; ++i) {
				int A = sc.nextInt() - 1;
				int B = sc.nextInt() - 1;
				int C = sc.nextInt();
				dist[A][B] = C;
			}
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					for (int k = 0; k < N; ++k) {
						dist[j][k] = Math.min(dist[j][k], dist[j][i] + dist[i][k]);
					}
				}
			}
			int ans = 1 << 30;
			for (int i = 0; i < N; ++i) {
				ans = Math.min(ans, dist[S][i] + dist[i][G1] + dist[i][G2]);
			}
			System.out.println(ans);
		}
	}

}