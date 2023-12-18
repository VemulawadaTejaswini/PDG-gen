import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Main().run();
	}

	boolean isPrime[];

	final int MAX = 1000 * 1000;
	int MAX_X = 1102;
	int MAX_Y = 1102;
	int[][] caves;
	int[][] dp;

	void init() {

		isPrime = new boolean[MAX + 1];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i * i <= MAX; i++) {
			if (isPrime[i]) {
				for (int j = i * 2; j <= MAX; j += i) {
					isPrime[j] = false;
				}
			}
		}

		caves = new int[MAX_Y + 1][MAX_X + 1];
		dp = new int[MAX_Y + 1][MAX_X + 1];
		for (int i = 0; i <= MAX_Y; i++) {
			Arrays.fill(dp[i], -1);
		}
		int x = MAX_X / 2;
		int y = MAX_Y / 2;
		int dx[] = new int[] { 1, 0, -1, 0 };
		int dy[] = new int[] { 0, -1, 0, 1 };
		int idx = 1;
		int t = 0;
		for (int step = 1; idx <= MAX; step++) {
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < step && idx <= MAX; j++) {
					caves[y][x] = idx;
					x = x + dx[t];
					y = y + dy[t];
					idx++;
				}
				t++;
				t %= 4;
			}
		}
	}

	int m = 0;

	void run() {
		while (true) {
			init();
			m = sc.nextInt();
			int n = sc.nextInt();
			if ((n | m) == 0)
				break;
			int sx, sy;
			sx = sy = 0;
			for (int i = 0; i <= MAX_Y; i++) {
				for (int j = 0; j <= MAX_X; j++) {
					if (caves[i][j] == n) {
						sx = j;
						sy = i;
					}
				}
			}
			int cnt = solve(sx, sy);
			int x = sx;
			int y = sy;
			int last = -1;
			int dx[] = new int[] { -1, 0, 1 };
			int dy[] = new int[] { 1, 1, 1 };
			while (true) {
				if (isPrime[caves[y][x]])
					last = caves[y][x];
				int max = 0;
				int max_x = 0;
				int max_y = 0;
				int max_idx = 0;
				boolean end = true;
				for (int i = 0; i < 3; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					if (MAX_X < nx || MAX_Y < ny || caves[ny][nx] > m
							|| caves[ny][nx] == 0) {
						continue;
					}
					end = false;
					if (max < dp[ny][nx]) {
						max = dp[ny][nx];
						max_x = nx;
						max_y = ny;
						max_idx = caves[ny][nx];
					} else if (max == dp[ny][nx]) {
						if (max_idx < caves[ny][nx]) {
							max = dp[ny][nx];
							max_x = nx;
							max_y = ny;
							max_idx = caves[ny][nx];
						}
					}
				}
				x = max_x;
				y = max_y;
				if (end)
					break;
			}
			if (last >= 0) {
				System.out.println(cnt + " " + last);
			} else {
				System.out.println(0 + " " + 0);
			}
		}
	}

	int solve(int x, int y) {
		if (dp[y][x] >= 0)
			return dp[y][x];
		int res = 0;
		if (MAX_X < x || MAX_Y < y || caves[y][x] > m || caves[y][x] == 0) {
			return 0;
		}
		if (isPrime[caves[y][x]]) {
			res += 1;
		}
		int dx[] = { -1, 0, 1 };
		int dy[] = { 1, 1, 1 };
		int max = 0;
		for (int i = 0; i < 3; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			max = Math.max(max, solve(nx, ny));
		}
		res += max;
		return dp[y][x] = res;
	}
}