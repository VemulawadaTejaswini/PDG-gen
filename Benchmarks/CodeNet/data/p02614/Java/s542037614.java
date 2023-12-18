import java.util.*;

public class Main {
	public static void main(String[] args) {
		// yes or no for each row and col
		// 2 ^ H * 2 ^ W
		// 2 ^ (H + W)
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		int k = scanner.nextInt();
		// System.out.println("h: " + h);
		// System.out.println("w: " + w);
		int[][] grid = new int[h][w];
		for (int i = 0; i < h; i++) {
			char[] nextLine = scanner.next().toCharArray();
			// System.out.println("nextLine size: " + nextLine.length);
			for (int j = 0; j < w; j++) {
				grid[i][j] = nextLine[j] == '.' ? 0 : 1;
			}
		}
		int ans = solve(h, w, k, grid);
		System.out.println(ans);
	}

	public static int solve(int h, int w, int K, int[][] grid) {
		int ans = 0;
		int maxH = 1 << h;
		int maxW = 1 << w;
		for (int i = 0; i < maxH; i++) {
			for (int j = 0; j < maxW; j++) {
				int black = 0;
				for (int k = 0; k < h; k++) {
					for (int l = 0; l < w; l++) {
						// row and col are not selected
						// 8: 101
						// i >> k
						if (grid[k][l] == 1 && ((i >> k) & 1) == 0 && ((j >> l) & 1) == 0) {
							black++;
						}
					}
				}
				if (K == black) {
					ans++;
				}
			}
		}
		return ans;
	}
}
