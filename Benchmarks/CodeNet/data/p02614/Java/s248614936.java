import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int W = scanner.nextInt();
		int K = scanner.nextInt();
		int[][] grid = new int[H][W];
		// System.out.println("H: " + H);
		// System.out.println("W: " + W);
		for (int i = 0; i < H; i++) {
			char[] line = scanner.next().toCharArray();
			// System.out.println("line: " + new String(line));
			for (int j = 0; j < W; j++) {
				if (line[j] == '.') {
					grid[i][j] = 0;
				} else {
					grid[i][j] = 1;
				}
			}
		}
		int ans = solve(grid, H, W, K);
		System.out.println(ans);
	}

	public static int solve(int[][] grid, int H, int W, int K) {
		int ans = 0;
		int maxH = 1 << H;
		int maxW = 1 << W;
		for (int maskR = 0; maskR < maxH; maskR++) {
			for (int maskC = 0; maskC < maxW; maskC++) {
				int black = 0;
				for (int i = 0; i < H; i++) {
					for (int j = 0; j < W; j++) {
						if (grid[i][j] == 1 && ((maskR >> i) & 1) == 0 && ((maskC >> j) & 1) == 0) {
							black++;
						}
					}
				}
				if (black == K) {
					ans++;
				}
			}
		}
		return ans;
	}
}
