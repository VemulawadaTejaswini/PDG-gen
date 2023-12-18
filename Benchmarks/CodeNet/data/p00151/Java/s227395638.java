import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {

		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			boolean[][] map = new boolean[n][n];

			int[][] rl = new int[n][n];
			int[][] td = new int[n][n];
			int[][] url = new int[n][n];
			int[][] ulr = new int[n][n];

			for (int i = 0; i < n; i++) {
				String buffer = sc.next();

				for (int j = 0; j < n; j++) {
					map[i][j] = (buffer.charAt(j) == '1');
				}
			}

			int max = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (map[i][j]) {
						int ni;
						int nj;

						ni = i - 1;
						nj = j;
						rl[i][j] = 1;
						if (ni >= 0 && ni < n)
							if (nj >= 0 && nj < n)
								rl[i][j] = rl[ni][nj] + 1;

						max = Math.max(max, rl[i][j]);

						ni = i;
						nj = j - 1;
						td[i][j] = 1;
						if (ni >= 0 && ni < n)
							if (nj >= 0 && nj < n)
								td[i][j] = td[ni][nj] + 1;

						max = Math.max(max, td[i][j]);

						ni = i - 1;
						nj = j - 1;
						url[i][j] = 1;
						if (ni >= 0 && ni < n)
							if (nj >= 0 && nj < n)
								url[i][j] = url[ni][nj] + 1;

						max = Math.max(max, url[i][j]);

						ni = i - 1;
						nj = j + 1;
						ulr[i][j] = 1;
						if (ni >= 0 && ni < n)
							if (nj >= 0 && nj < n)
								ulr[i][j] = ulr[ni][nj] + 1;

						max = Math.max(max, ulr[i][j]);

					}
				}
			}
			System.out.println(max);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}