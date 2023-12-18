
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		loop: while (true) {
			w = scanner.nextInt();
			h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			count = 0;
			visited = new boolean[h][w];
			sx = -1;
			sy = -1;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					int now = scanner.nextInt();
					if (now == 0) {
						count++;
						if (sx == -1) {
							sy = i;
							sx = j;
						}
					} else {
						visited[i][j] = true;
					}
				}
			}
			if(count%2==1){
				System.out.println("No");
				continue;
			}
			}
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (visited[i][j])
						continue;
					int count = 0;
					for (int k = 0; k < 4; k++) {
						int x = j + vx[k];
						int y = i + vy[k];
						if (!isOK(x, y))
							continue;
						if (!visited[y][x])
							count++;
					}
					if (count < 2) {
						System.out.println("No");
						continue loop;
					}
				}
			}

			System.out.println(dfs(sx, sy, 0) ? "Yes" : "No");
		}

	}

	private boolean dfs(int x, int y, int deep) {
		if (count - deep < Math.abs(x - sx) + Math.abs(y - sy))
			return false;

		for (int i = 0; i < 4; i++) {
			int nx = x + vx[i];
			int ny = y + vy[i];
			if (!isOK(nx, ny))
				continue;
			if (ny == sy && nx == sx && deep + 1 == count)
				return true;
			if (visited[ny][nx])
				continue;
			boolean res = check(nx, ny);
			if (!res)
				continue;
			visited[ny][nx] = true;
			if (dfs(nx, ny, deep + 1))
				return true;
			visited[ny][nx] = false;
		}
		return false;

	}

	private boolean check(int x, int y) {
		loop: for (int i = 4; i < vx.length; i++) {
			int nx = x + vx[i];
			int ny = y + vy[i];
			if (!isOK(nx, ny))
				continue;
			if (nx == sx && ny == sy)
				continue;
			if (visited[ny][nx])
				continue;
			int count = 0;
			for (int j = 0; j < 4; j++) {
				int nnx = nx + vx[j];
				int nny = ny + vy[j];
				if (!isOK(nnx, nny))
					continue;
				if (visited[nny][nnx])
					continue;
				count++;
				if (count == 2)
					continue loop;
			}
			return false;
		}
		return true;
	}

	private boolean isOK(int x, int y) {
		if (0 <= x && x < w && 0 <= y && y < h)
			return true;
		return false;
	}

	boolean[][] visited;
	boolean ans;
	int count, w, h, sx, sy;
	int[] vx = { 0, 1, 0, -1, 1, 1, -1, -1 };
	int[] vy = { -1, 0, 1, 0, -1, 1, 1, -1 };
}