import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	static String matrix[][];
	static int fin[][];
	static int color[][];

	static final int WHITE = 0;
	static final int GRAY = 1;
	static final int BLACK = 2;

	static int w;
	static int h;

	static int sx;
	static int sy;

	static final int dx[] = { 1, 0, -1, 0 };
	static final int dy[] = { 0, 1, 0, -1 };

	static int count = 0;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String str[] = br.readLine().split(" ");
			w = Integer.parseInt(str[0]);
			h = Integer.parseInt(str[1]);

			if (w == 0 && h == 0)
				break;

			matrix = new String[h][w];
			fin = new int[h][w];
			color = new int[h][w];

			for (int i = 0; i < h; i++) {
				str = br.readLine().split("");
				for (int j = 0; j < w; j++) {
					if (str[j].equals("@")) {
						sx = j;
						sy = i;
					}
					matrix[i][j] = str[j];
				}
			}
			dfs(sx, sy);
			System.out.println(count);
		}
	}

	static void dfs(int x, int y) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				fin[i][j] = -1;
				color[i][j] = WHITE;
			}
		}
		count = 0;
		dfs_visit(x, y);
	}

	static void dfs_visit(int x, int y) {
		color[y][x] = GRAY;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx < w && nx >= 0 && ny >= 0 && ny < h) {
				if (color[ny][nx] == WHITE && matrix[ny][nx].equals(".")) {
					dfs_visit(nx, ny);
				}
			}
		}

		color[y][x] = BLACK;
		fin[y][x] = ++count;
	}
}
