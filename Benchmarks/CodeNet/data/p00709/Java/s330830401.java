import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int W, H;
	static boolean[][] f;
	static int[][] size;
	static int[][] count;
	static int ans;

	public static void main(String[] args) {
		while (true) {
			W = sc.nextInt();
			if (W == 0) break;
			H = sc.nextInt();
			f = new boolean[H + 1][W + 1];
			size = new int[H + 1][W + 1];
			count = new int[H + 1][W + 1];
			for (int i = 0; i < H; ++i) {
				for (int j = 0; j < W; ++j) {
					f[i][j] = sc.next().equals("1");
				}
			}
			System.out.println(solve());
		}
	}

	static int solve() {
		ans = 999;
		int rest = 0;
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				if (f[i][j]) ++rest;
				OUT: for (int k = 1;; ++k) {
					for (int r = i; r < i + k; ++r) {
						for (int c = j; c < j + k; ++c) {
							if (!f[r][c]) {
								size[i][j] = k - 1;
								break OUT;
							}
						}
					}
				}
			}
		}
		if (rest == 0) return 0;
		rec(0, 0, 0, rest);
		return ans;
	}

	static void rec(int r, int c, int num, int rest) {
		if (rest == 0) {
			ans = num;
			return;
		}
		if (num + 1 >= ans) return;
		if (c == W) {
			rec(r + 1, 0, num, rest);
			return;
		}
		if (!f[r][c] || count[r][c] != 0) {
			rec(r, c + 1, num, rest);
		}

		// prune
		boolean filled = true;
		for (int i = 0; i < size[r][c]; ++i) {
			if (count[r + i][c] == 0) {
				filled = false;
				break;
			}
		}
		if (filled && size[r][c + 1] >= size[r][c]) return;
		filled = true;
		for (int i = 0; i < size[r][c]; ++i) {
			if (count[r][c + i] == 0) {
				filled = false;
				break;
			}
		}
		if (filled && size[r + 1][c] >= size[r][c]) return;

		boolean use = false;
		for (int i = 0; i < size[r][c]; ++i) {
			for (int j = 0; j < size[r][c]; ++j) {
				if (count[r + i][c + j] == 0) {
					use = true;
					--rest;
				}
				count[r + i][c + j]++;
			}
		}
		if (use) {
			rec(r, c + 1, num + 1, rest);
		}
		for (int i = 0; i < size[r][c]; ++i) {
			for (int j = 0; j < size[r][c]; ++j) {
				count[r + i][c + j]--;
			}
		}
	}
}