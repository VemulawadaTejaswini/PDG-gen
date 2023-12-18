
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			w = scanner.nextInt();
			h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			dist = new int[h][w];
			map = new char[h][w];
			for (int i = 0; i < h; i++) {
				char[] cs = scanner.next().toCharArray();
				for (int j = 0; j < w; j++) {
					dist[i][j] = -1;
					char c = cs[j];
					map[i][j] = c;
					if (c == 'S') {
						sy = i;
						sx = j;
						map[i][j] = '.';
					} else if (c == 'G') {
						gy = i;
						gx = j;
						map[i][j] = '.';
					}
				}
			}
			int ID = 1;
			ice = new int[h * w];
			id = new int[h][w];
			ice[0] = INF;
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++) {
					if (id[i][j] == 0 && map[i][j] == 'X') {
						mark(i, j, ID);
						if (ice[ID] == 1)
							map[i][j] = '#';
						ID++;
					}

				}
			Deque<Point> deque = new ArrayDeque<Main.Point>();
			deque.offer(new Point(gy, gx));
			dist[gy][gx] = 0;
			while (!deque.isEmpty()) {
				Point p = deque.poll();
				for (int[] m : move) {
					int ny = p.y + m[0];
					int nx = p.x + m[1];
					if (!isOK(ny, nx))
						continue;
					if (map[ny][nx] != '#' && dist[ny][nx] == -1) {
						dist[ny][nx] = dist[p.y][p.x] + 1;
						deque.offer(new Point(ny, nx));
					}

				}
			}
			ans = dist[sy][sx];
			hit = new int[h * w];
			b = new boolean[h][w];
			b[sy][sx] = true;
			PriorityQueue<Point> pq = new PriorityQueue<Point>();
			pq.offer(new Point(sy, sx, 0, dist[sy][sx], hit, b));
			while (!pq.isEmpty()) {
				Point p = pq.poll();
				if (p.y == gy && p.x == gx) {
					System.out.println(p.step);
					break;
				}
				for (int[] m : move) {
					int ny = p.y + m[0];
					int nx = p.x + m[1];
					if (!isOK(ny, nx))
						continue;
					if (map[ny][nx] == '#')
						continue;
					if (p.b[ny][nx])
						continue;

					if (ice[id[ny][nx]] / 2 > p.hit[id[ny][nx]]) {
						Point cp = p.clone();
						cp.b[ny][nx] = true;
						cp.hit[id[ny][nx]]++;
						cp.step++;
						cp.md = cp.step + dist[ny][nx];
						cp.y = ny;
						cp.x = nx;
						pq.offer(cp);
					}
				}
			}

		}
	}

	private boolean f(int y, int x, int depth) {
		if (ans < depth + dist[y][x])
			return false;
		if (y == gy && x == gx)
			return true;
		for (int[] m : move) {
			int ny = y + m[0];
			int nx = x + m[1];
			if (!isOK(ny, nx))
				continue;
			if (b[ny][nx] || map[ny][nx] == '#')
				continue;
			if (ice[id[ny][nx]] / 2 > hit[id[ny][nx]]) {
				hit[id[ny][nx]]++;
				b[ny][nx] = true;
				if (f(ny, nx, depth + 1))
					return true;
				hit[id[ny][nx]]--;
				b[ny][nx] = false;
			}
		}
		return false;
	}

	private void mark(int i, int j, int ID) {
		ice[ID]++;
		id[i][j] = ID;
		for (int[] m : move) {
			int ny = i + m[0];
			int nx = j + m[1];
			if (!isOK(ny, nx))
				continue;
			if (map[ny][nx] == 'X' && id[ny][nx] == 0)
				mark(ny, nx, ID);
		}
	}

	private boolean isOK(int y, int x) {
		if (0 <= y && y < h && 0 <= x && x < w)
			return true;
		return false;
	}

	int h, w, sx, sy, gx, gy, INF = 1 << 24, ans;
	char[][] map;
	int[][] dist, id;
	int[] ice, hit;
	int[][] move = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
	boolean[][] b;

	class Point implements Cloneable, Comparable<Point> {
		int y, x, step, md;
		int[] hit;
		boolean[][] b;

		public Point(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}

		public Point(int y, int x, int step, int md, int[] hit, boolean[][] b) {
			super();
			this.y = y;
			this.x = x;
			this.step = step;
			this.md = md;
			this.hit = hit;
			this.b = b;
		}

		@Override
		protected Point clone() {
			// TODO ?????????????????????????????????????????????
			try {
				Point clonePoint = (Point) super.clone();
				clonePoint.hit = this.hit.clone();
				boolean[][] nb = new boolean[h][w];
				for (int i = 0; i < h; i++)
					nb[i] = Arrays.copyOf(this.b[i], w);
				clonePoint.b = nb;
				return clonePoint;
			} catch (CloneNotSupportedException e) {
				throw new InternalError();
			}
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			for (boolean[] bb : b)
				builder.append(Arrays.toString(bb)).append('\n');
			return "Point [y=" + y + ", x=" + x + ", step=" + step + ", md="
					+ md + ", hit=" + Arrays.toString(hit) + ", b=\n" + builder
					+ "]";
		}

		@Override
		public int compareTo(Point o) {
			if (this.md == o.md)
				return o.step - this.step;
			return this.md - o.md;
		}

	}
}