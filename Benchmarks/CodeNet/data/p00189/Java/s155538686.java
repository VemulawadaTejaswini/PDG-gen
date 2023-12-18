
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			int[][] wf = new int[11][11];

			boolean[] used = new boolean[11];
			for (int i = 0; i < wf.length; i++) {
				Arrays.fill(wf[i], Integer.MAX_VALUE >> 4);
			}
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int c = sc.nextInt();
				wf[x][y] = c;
				wf[y][x] = c;
				wf[x][x] = 0;
				wf[y][y] = 0;
				used[x] = true;
				used[y] = true;
			}

			for (int k = 0; k < 11; k++) {
				for (int i = 0; i < 11; i++) {
					for (int j = 0; j < 11; j++) {
						wf[i][j] = Math.min(wf[i][j], wf[i][k] + wf[k][j]);
					}
				}
			}

			int ans = -1;
			int min = Integer.MAX_VALUE >> 2;
			for (int i = 0; i < 11; i++) {
				int sum = 0;
				for (int j = 0; j < 11; j++) {
					if (used[j]) {
						sum += wf[i][j];
					}
				}
				if (min > sum) {
					min = sum;
					ans = 1;
				}
			}
			System.out.println(ans + " " + min);

		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}