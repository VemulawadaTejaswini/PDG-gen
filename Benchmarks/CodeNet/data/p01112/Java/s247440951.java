import java.util.*;
import java.lang.*;

public class Main {
	static int n;
	static int m;
	static int[][] result;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				System.exit(0);
			}
			m = sc.nextInt();
			result = new int[n][n];
			for (int i = 0; i < m; i++) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				result[x][y] = 1;
				result[y][x] = -1;
			}
			count = 0;
			dfs(0, 1);
			System.out.println(count);
		}
	}
	static void dfs(int x, int y) {
		if (y == n) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += result[x][i];
			}
			if (sum == 0) {
				if (x < n - 1) {
					dfs(x + 1, x + 2);
				} else {
					count++;
				}
			}
			return;
		}
		if (x == y || result[x][y] != 0) {
			dfs(x, y + 1);
		} else {
			result[x][y] = 1;
			result[y][x] = -1;
			dfs(x, y + 1);
			result[x][y] = -1;
			result[y][x] = 1;
			dfs(x, y + 1);
			result[x][y] = 0;
			result[y][x] = 0;
		}
	}
}


