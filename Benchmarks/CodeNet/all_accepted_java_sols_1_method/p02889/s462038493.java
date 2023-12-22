import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long l = sc.nextLong();

		long[][] d1 = new long[n][n];
		long[][] d2 = new long[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(d1[i], Long.MAX_VALUE);
			Arrays.fill(d2[i], Long.MAX_VALUE);
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			long c = sc.nextLong();
			d1[a][b] = c;
			d1[b][a] = c;
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (d1[i][k] == Long.MAX_VALUE || d1[k][j] == Long.MAX_VALUE) continue;

					d1[i][j] = Math.min(d1[i][j], d1[i][k] + d1[k][j]);
					if (d1[i][j] <= l) d2[i][j] = 1;
				}
			}
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (d2[i][k] == Long.MAX_VALUE || d2[k][j] == Long.MAX_VALUE) continue;
					d2[i][j] = Math.min(d2[i][j], d2[i][k] + d2[k][j]);
				}
			}
		}

		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {
			int s = sc.nextInt() - 1;
			int t = sc.nextInt() - 1;
			if (d2[s][t] == Long.MAX_VALUE) System.out.println(-1);
			else System.out.println(d2[s][t] - 1);
		}
	}
}
