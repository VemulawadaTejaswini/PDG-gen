import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		long INF = 1 << 61;
		while (true) {
			boolean flag = false;
			int n = sc.nextInt();
			int k = sc.nextInt();
			if ((n | k) == 0)
				break;
			long fare[][] = new long[n][n];
			for (int i = 0; i < n; i++) {
				Arrays.fill(fare[i], INF);
				fare[i][i] = 0;
			}
			for (int i = 0; i < k; i++) {
				int init = sc.nextInt();
				if (init == 1) {
					int c = sc.nextInt() - 1;
					int d = sc.nextInt() - 1;
					int e = sc.nextInt();
					if (e < fare[c][d]) {
						fare[c][d] = fare[d][c] = e;
						flag = true;
					}
				} else {
					int a = sc.nextInt() - 1;
					int b = sc.nextInt() - 1;
					if (flag) {
						for (int r = 0; r < n; r++) {
							for (int p = 0; p < n; p++) {
								for (int q = 0; q < n; q++) {
									fare[p][q] = Math.min(fare[p][q],
											fare[p][r] + fare[r][q]);
								}
							}
						}
						flag = false;
					}
					System.out.println(fare[a][b] != INF ? fare[a][b] : -1);
				}
			}
		}
	}
}