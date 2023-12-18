import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int H, W;
	static char[][] f;
	static int[][][] hole = new int[26][50][51];
	static boolean[][][][] reach;
	static int[][][][] dp;

	public static void main(String[] args) {
		while (true) {
			H = sc.nextInt();
			W = sc.nextInt();
			if (H == 0) break;
			f = new char[H][];
			for (int i = 0; i < H; ++i) {
				f[i] = sc.next().toCharArray();
				for (char j = 'A'; j <= 'Z'; ++j) {
					int pos = 0;
					for (int x = 0; x < W; ++x) {
						if (f[i][x] == j) hole[j - 'A'][i][pos++] = x;
					}
					hole[j - 'A'][i][pos] = 99;
				}
			}
			System.out.println(solve());
		}
	}

	static int solve() {
		reach = new boolean[H][W][H][W];
		dp = new int[H][W][H][W];
		for (int y = 0; y < H; ++y) {
			for (int x = 0; x < W; ++x) {
				if (f[y][x] != '#') reach[y][x][y][x] = true;
			}
		}
		for (int h = 0; h < H; ++h) {
			for (int w = 0; w < W; ++w) {
				for (int y1 = 0; y1 < H - h; ++y1) {
					for (int x1 = 0; x1 < W - w; ++x1) {
						update(y1, x1, y1 + h, x1 + w);
					}
				}
			}
		}
		return reach[0][0][H - 1][W - 1] ? dp[0][0][H - 1][W - 1] : -1;
	}

	static void update(int y1, int x1, int y2, int x2) {
		char v1 = f[y1][x1];
		if (v1 == '#') return;
		char v2 = f[y2][x2];
		if (v2 == '#') return;
		if (!(y2 > 0 && reach[y1][x1][y2 - 1][x2] || x2 > 0 && reach[y1][x1][y2][x2 - 1])) return;
		reach[y1][x1][y2][x2] = true;
		if (!('a' <= v1 && v1 <= 'z')) {
			if (y1 < y2) dp[y1][x1][y2][x2] = Math.max(dp[y1][x1][y2][x2], dp[y1 + 1][x1][y2][x2]);
			if (x1 < x2) dp[y1][x1][y2][x2] = Math.max(dp[y1][x1][y2][x2], dp[y1][x1 + 1][y2][x2]);
		} else if (!('A' <= v2 && v2 <= 'Z')) {
			if (y1 < y2) dp[y1][x1][y2][x2] = Math.max(dp[y1][x1][y2][x2], dp[y1][x1][y2 - 1][x2]);
			if (x1 < x2) dp[y1][x1][y2][x2] = Math.max(dp[y1][x1][y2][x2], dp[y1][x1][y2][x2 - 1]);
		} else {
			if (v1 - 'a' == v2 - 'A') {
				if (y1 + 1 < y2 && reach[y1 + 1][x1][y2 - 1][x2]) {
					dp[y1][x1][y2][x2] = Math.max(dp[y1][x1][y2][x2], dp[y1 + 1][x1][y2 - 1][x2] + 1);
				}
				if (y1 < y2 && x1 < x2 && reach[y1 + 1][x1][y2][x2 - 1]) {
					dp[y1][x1][y2][x2] = Math.max(dp[y1][x1][y2][x2], dp[y1 + 1][x1][y2][x2 - 1] + 1);
				}
				if (y1 < y2 && x1 < x2 && reach[y1][x1 + 1][y2 - 1][x2]) {
					dp[y1][x1][y2][x2] = Math.max(dp[y1][x1][y2][x2], dp[y1][x1 + 1][y2 - 1][x2] + 1);
				}
				if (x1 + 1 < x2 && reach[y1][x1 + 1][y2][x2 - 1]) {
					dp[y1][x1][y2][x2] = Math.max(dp[y1][x1][y2][x2], dp[y1][x1 + 1][y2][x2 - 1] + 1);
				}
				if (y1 == y2 && x1 + 1 == x2 || y1 + 1 == y2 && x1 == x2) dp[y1][x1][y2][x2] = 1;
			}
			for (int y = y1; y <= y2; ++y) {
				for (int i = 0; hole[v1 - 'a'][y][i] <= x2; ++i) {
					int x = hole[v1 - 'a'][y][i];
					if (x < x1) continue;
					dp[y1][x1][y2][x2] = Math.max(dp[y1][x1][y2][x2], dp[y1][x1][y][x] + dp[y][x][y2][x2]);
				}
			}
		}
	}
}