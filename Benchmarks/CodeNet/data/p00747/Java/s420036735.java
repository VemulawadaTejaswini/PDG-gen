import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Amazing Mazes
 */
public class P1166 {

	static final int DIR[][] = {
			{0, -1},
			{1, 0},
			{0, 1},
			{-1, 0},
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int w, h;
			w = parseInt(line.substring(0, line.indexOf(' ')));
			h = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((w | h) == 0) break;

			int[][] maze = new int[h][w];
			int[][] moveH = new int[h][w - 1];
			int[][] moveV = new int[h - 1][w];

			for (int i = 0; i < 2 * h - 1; i++) {
				line = br.readLine();
				if (i % 2 == 0) {
					StringTokenizer st = new StringTokenizer(line.substring(1));
					for (int j = 0; j < moveH[0].length; j++) {
						moveH[i / 2][j] = parseInt(st.nextToken());
					}
				} else {
					StringTokenizer st = new StringTokenizer(line);
					for (int j = 0; j < moveV[0].length; j++) {
						moveV[i / 2][j] = parseInt(st.nextToken());
					}
				}
			}

			//solve
			Deque<int[]> q = new ArrayDeque<>();

			q.offer(new int[]{0, 0});
			maze[0][0] = 1;

			while (!q.isEmpty()) {

				int y, x;
				y = q.peek()[0];
				x = q.peek()[1];
				q.poll();

				if (y == h - 1 && x == w - 1) break;

				for (int i = 0; i < DIR.length; i++) {
					int ny, nx;
					ny = y + DIR[i][0];
					nx = x + DIR[i][1];
					if (0 <= ny && ny < h && 0 <= nx && nx < w && maze[ny][nx] == 0) {
						if (i % 2 == 0 && moveH[ny][(nx + x) / 2] == 1) {
							continue;
						} else if (i % 2 != 0 && moveV[(ny + y) / 2][nx] == 1) {
							continue;
						}
						q.offer(new int[]{ny, nx});
						maze[ny][nx] = maze[y][x] + 1;
					}
				}
			}
			System.out.println(maze[h - 1][w - 1]);
		}
	}
}