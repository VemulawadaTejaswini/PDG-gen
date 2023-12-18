import java.util.*;

public class Main {
	static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] grid = new int[h][w];
		for (int i = 0; i < h; i++) {
			String s = sc.next();
			for (int j = 0; j < w; j++) {
				if (s.charAt(j) == '#') {
					grid[i][j] = -1;
				}
			}
			for (int j = 0; j < w; j++) {
				if (i == 0 && j == 0) {
					grid[i][j] = 1;
					continue;
				}
				if (grid[i][j] == -1) {
					continue;
				}
				if (i != 0 && grid[i - 1][j] != -1) {
					grid[i][j] += grid[i - 1][j];
				}
				if (j != 0 && grid[i][j - 1] != -1) {
					grid[i][j] += grid[i][j - 1];
				}
				grid[i][j] %= MOD;
			}
		}
		System.out.println(grid[h - 1][w - 1]);
	}
	
}
