
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			w = scanner.nextInt();
			h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			map = new boolean[h][w];
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++)
					map[i][j] = scanner.nextInt() == 0;
			ans = 0;
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++) {
					if (map[i][j])
						continue;
					ans = Math.max(ans, dfs(i, j));
				}
			System.out.println(ans);
		}
	}

	private int dfs(int y, int x) {
		map[y][x] = true;
		int res = 1;
		for (int[] m : move) {
			int ny = y + m[0];
			int nx = x + m[1];
			if (!isOK(ny, nx))
				continue;
			if (map[ny][nx])
				continue;

			res = Math.max(dfs(ny, nx) + 1, res);

		}
		map[y][x] = false;
		return res;
	}

	private boolean isOK(int y, int x) {
		if (0 <= y && y < h && 0 <= x && x < w)
			return true;
		return false;
	}

	int h, w;
	int[][] move = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
	boolean[][] map;
	int ans;
}