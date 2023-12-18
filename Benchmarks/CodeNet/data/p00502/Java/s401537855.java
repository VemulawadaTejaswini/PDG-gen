
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		t = new int[n];
		for (int i = 0; i < n; i++)
			t[i] = scanner.nextInt();
		d = new int[m][3];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < 3; j++) {
				int a = scanner.nextInt();
				d[i][j] = a;
			}
		Arrays.sort(d, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
		});
		int ans = 0;
		for (int i = 0; i < m; i++) {
			if (d[i][0] <= t[0] && t[0] <= d[i][1]) {
				ans = slove(1, i, true);
				break;
			}
		}
		for (int i = m - 1; i >= 0; i--) {
			if (d[i][0] <= t[0] && t[0] <= d[i][1]) {
				ans = Math.max(ans, slove(1, i, false));
				break;
			}
		}
		System.out.println(ans);

	}

	private int slove(int day, int x, boolean b) {
		if (day == n)
			return 0;
		int ret = 0;
		if (b) {
			for (int i = m - 1; i >= 0; i--) {
				if (d[i][0] <= t[day] && t[day] <= d[i][1]) {
					ret += slove(day + 1, i, false)
							+ Math.abs(d[i][2] - d[x][2]);
					break;
				}
			}
		} else {
			for (int i = 0; i < m; i++) {
				if (d[i][0] <= t[day] && t[day] <= d[i][1]) {
					ret += slove(day + 1, i, true)
							+ Math.abs(d[i][2] - d[x][2]);
					break;
				}
			}
		}
		return ret;
	}

	int n, m;
	int[] t;
	int[][] d, dp;
}