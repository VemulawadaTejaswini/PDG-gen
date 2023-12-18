import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

	static final int OBSTACLE = -1;
	static final int[] X = {0, 1, 1, 0, -1, -1};
	static final int[] Y = {1, 1, 0, -1, -1, 0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";


		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int t, n;
			t = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			n = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			if ((t | n) == 0) {
				break;
			}

			int size, ox, oy;
			size = t * 4 + 1;
			ox = oy = t * 2;
			int[][] map = new int[size][size];

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				int x, y;
				x = Integer.parseInt(line.substring(0, line.indexOf(' ')));
				y = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
				map[ox + x][oy + y] = OBSTACLE;
			}
			line = br.readLine();
			int sx, sy;
			sx = ox + Integer.parseInt(line.substring(0, line.indexOf(' ')));
			sy = oy + Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			int count = 0;
			ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
			queue.offer(new int[]{sx, sy, 0});
			map[sx][sy] = OBSTACLE;
			count++;

			while (!queue.isEmpty()) {
				int[] hex = queue.poll();
				for (int i = 0; i < 6; i++) {
					int nx, ny;
					nx = hex[0] + X[i];
					ny = hex[1] + Y[i];
					if (hex[2] < t && map[nx][ny] != OBSTACLE) {
						queue.offer(new int[]{nx, ny, hex[2] + 1});
						map[nx][ny] = OBSTACLE;
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}