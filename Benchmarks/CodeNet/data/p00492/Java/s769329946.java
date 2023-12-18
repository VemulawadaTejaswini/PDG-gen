
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		w = scanner.nextInt();
		h = scanner.nextInt();
		map = new boolean[h + 2][w + 2];
		v = new boolean[h + 2][w + 2];
		for (int i = 1; i <= h; i++)
			for (int j = 1; j <= w; j++)
				map[i][j] = scanner.nextInt() == 1;
		System.out.println(slove(0, 0));
	}

	private int slove(int y, int x) {
		v[y][x] = true;
		int res = 0;
		for (int i = 0; i < 6; i++) {
			int ny = y + dy[i];
			int nx = x + (y % 2 == 1 ? dx1[i] : dx2[i]);
			if (!isOK(ny, nx))
				continue;
			if (map[ny][nx]) {
				res++;
				continue;
			}
			if (v[ny][nx])
				continue;
			res += slove(ny, nx);
		}
		return res;
	}

	private boolean isOK(int ny, int nx) {
		if (0 <= ny && ny <= h + 1 && 0 <= nx && nx <= w + 1)
			return true;
		return false;
	}

	int h, w;
	boolean[][] map;
	boolean[][] v;
	int[] dy = { -1, -1, 0, 0, 1, 1 };
	int[] dx1 = { 0, 1, -1, 1, 0, 1 };
	int[] dx2 = { -1, 0, -1, 1, -1, 0 };
}