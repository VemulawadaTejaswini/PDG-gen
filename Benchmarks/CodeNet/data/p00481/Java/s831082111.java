import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	static int h;
	static int w;
	static int n;

	static String matrix[][];

	static int sx, sy;
	static int gx, gy;

	static int answer = 0;

	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	static final int WHITE = 0;
	static final int GRAY = 1;
	static final int BLACK = 2;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		h = Integer.parseInt(str[0]);
		w = Integer.parseInt(str[1]);
		n = Integer.parseInt(str[2]);

		matrix = new String[h][w];

		for (int i = 0; i < h; i++) {
			str = br.readLine().split("");
			for (int j = 0; j < w; j++) {
				if (str[j].equals("S")) {
					sx = j;
					sy = i;
				}
				matrix[i][j] = str[j];
			}
		}
		bfs(sx, sy, 1);
		System.out.println(answer);
	}

	static void bfs(int x, int y, int nn) {
		int dist[][] = new int[h][w];
		int color[][] = new int[h][w];
		int num = nn;

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				dist[i][j] = Integer.MAX_VALUE;
				color[i][j] = WHITE;
			}
		}
		color[y][x] = GRAY;
		dist[y][x] = 0;

		int a, b;

		Queue<Integer> queueX = new ArrayDeque<>();
		Queue<Integer> queueY = new ArrayDeque<>();
		queueX.add(x);
		queueY.add(y);
		while (!queueX.isEmpty() && !queueY.isEmpty()) {
			a = queueX.poll();
			b = queueY.poll();

			for (int i = 0; i < 4; i++) {
				int nx = a + dx[i];
				int ny = b + dy[i];
				if (nx >= 0 && nx < w && ny >= 0 && ny < h) {
					if (matrix[ny][nx].equals("X")) {
						continue;
					}
					if (color[ny][nx] == WHITE) {
						dist[ny][nx] = dist[b][a] + 1;
						color[ny][nx] = GRAY;
						queueX.add(nx);
						queueY.add(ny);
					}
					if (matrix[ny][nx].equals(String.valueOf(num))) {
						if (num <= n) {
							answer += dist[ny][nx];
							bfs(nx, ny, num + 1);
							queueX.clear();
							queueY.clear();
							break;
						}
					}
				}
			}
			color[b][a] = BLACK;
		}
	}
}

class Edge implements Comparable<Edge> {
	int to;
	int cost;

	public Edge(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge e) {
		return this.cost - e.cost;
	}
}

