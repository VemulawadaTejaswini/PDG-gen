import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

class Pair {
	int x;
       	int y;
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dx[] = {2, 0, -2, 0};
		int dy[] = {0, 2, 0, -2};
		while (true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if (w == 0 && h == 0) break;
			int[][] maze = new int[2 * h - 1][2 * w - 1];
			for (int i = 0; i < 2 * h - 1; ++i)
				for (int j = 0; j < 2 * w - 1; ++j)
					maze[i][j] = -1;
			for (int i = 0; i < 2 * h - 1; ++i)
				if (i % 2 == 0)
					for (int j = 0; j < w - 1; ++j)
						maze[i][2 * j + 1] = sc.nextInt();
				else
					for (int j = 0; j < w; ++j)
						maze[i][2 * j] = sc.nextInt();
			Queue<Pair> que = new ArrayDeque<>();
			que.add(new Pair(0, 0));
			maze[0][0] = 1;
			while (que.size() != 0) {
				Pair now = que.poll();
				for (int i = 0; i < 4; ++i) {
					int nx = now.x + dx[i]; int ny = now.y + dy[i];
					if (!((0 <= nx && nx < 2 * h - 1) && (0 <= ny && ny < 2 * w - 1)))
						continue;
					if (maze[now.x + dx[i] / 2][now.y + dy[i] / 2] == 0) {
						if (maze[nx][ny] != -1) continue;
						maze[nx][ny] = maze[now.x][now.y] + 1;
						que.add(new Pair(nx, ny));
					}
				}
			}
			int ans = maze[2 * h - 2][2 * w - 2];
			System.out.println(ans == -1 ? 0 : ans);
		}
	}
}
