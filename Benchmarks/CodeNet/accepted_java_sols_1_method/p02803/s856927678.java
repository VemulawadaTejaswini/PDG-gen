import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] delta = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] g = new char[h][w];
		for (int i = 0; i < h; i++) {
			g[i] = sc.next().toCharArray();
		}

		int answer = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (g[i][j] != '.') continue;
				boolean[][] visited = new boolean[h][w];
				Queue<int[]> q = new LinkedList<>();
				q.offer(new int[]{i, j, 0});
				visited[i][j] = true;
				while (!q.isEmpty()) {
					int[] p = q.poll();
					for (int k = 0; k < 4; k++) {
						int ny = delta[k][0] + p[0];
						int nx = delta[k][1] + p[1];
						if (nx < 0 || nx >= w || ny < 0 || ny >= h) continue;
						if (g[ny][nx] != '.' || visited[ny][nx]) continue;
						visited[ny][nx] = true;
						q.offer(new int[]{ny, nx, p[2] + 1});
					}

					if (q.isEmpty()) answer = Math.max(answer, p[2]);
				}
			}
		}
		System.out.println(answer);
	}
}
