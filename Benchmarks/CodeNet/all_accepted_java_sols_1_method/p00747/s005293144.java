import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

/**
 * Amazing Mazes
 */
public class Main {

	static final int DIR[][] = {
			{0, -1},
			{1, 0},
			{0, 1},
			{-1, 0},
	};

	static final int DIR2[][] = {
			{0, -2},
			{2, 0},
			{0, 2},
			{-2, 0},
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

			w = w * 2 - 1;
			h = h * 2 - 1;
			int[][] maze = new int[h][w];

			for (int i = 0; i < maze.length; i++) {
				line = br.readLine();
				for (int j = 0; j < line.length(); j++) {
					if (line.charAt(j) == '1') maze[i][j] = 1;
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
					int ny, nx, ny2, nx2;
					ny = y + DIR[i][0];
					nx = x + DIR[i][1];
					ny2 = y + DIR2[i][0];
					nx2 = x + DIR2[i][1];

					if (0 <= ny2 && ny2 < h && 0 <= nx2 && nx2 < w) {
						if (maze[ny][nx] == 0 && maze[ny2][nx2] == 0) {
							q.offer(new int[]{ny2, nx2});
							maze[ny2][nx2] = maze[y][x] + 1;
						}
					}
				}
			}
			System.out.println(maze[h - 1][w - 1]);
		}
	}
}