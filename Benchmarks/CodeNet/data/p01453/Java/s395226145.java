import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	int[] dx = { 1, -1, 0, 0 };
	int[] dy = { 0, 0, 1, -1 };
	char[][] table;

	int h, w;

	void solver() {
		Scanner sc = new Scanner(System.in);
		w = sc.nextInt();// max:500
		h = sc.nextInt();// max:500
		int sx = -1, sy = -1, gx = -1, gy = -1;
		double n = 0;
		table = new char[h][w];
		int[][] distance_from_goal = new int[h][w];
		int[][] distance_from_spring = new int[h][w];

		for (int i = 0; i < h; i++) {
			table[i] = sc.next().toCharArray();
			Arrays.fill(distance_from_goal[i], (1 << 30));
			Arrays.fill(distance_from_spring[i], (1 << 30));

			for (int j = 0; j < w; j++) {
				if (table[i][j] == 's') {
					sx = j;
					sy = i;
				} else if (table[i][j] == 'g') {
					gx = j;
					gy = i;
					distance_from_goal[gy][gx] = 0;
				} else if (table[i][j] == '.')
					n++;
				else if (table[i][j] == '*')
					distance_from_spring[i][j] = 0;
			}
		}

		ArrayDeque<Pair> que = new ArrayDeque<>();
		que.add(new Pair(gx, gy));
		while (!que.isEmpty()) {
			Pair p = que.poll();
			for (int i = 0; i < 4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if (on_filed(nx, ny) && distance_from_goal[ny][nx] > distance_from_goal[p.y][p.x] + 1) {
					distance_from_goal[ny][nx] = distance_from_goal[p.y][p.x] + 1;
					if (table[ny][nx] == '.')
						que.add(new Pair(nx, ny));
				}
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (table[i][j] == '*') {
					que.add(new Pair(j, i));
				}
			}
		}

		while (!que.isEmpty()) {
			Pair p = que.poll();
			for (int i = 0; i < 4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if (on_filed(nx, ny) && distance_from_spring[ny][nx] > distance_from_spring[p.y][p.x] + 1) {
					distance_from_spring[ny][nx] = distance_from_spring[p.y][p.x] + 1;
					if (table[ny][nx] == '.')
						que.add(new Pair(nx, ny));
				}
			}
		}

		long a = 0, b = 0;
		ArrayList<P> list = new ArrayList<>();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (table[i][j] == '.') {
					if (distance_from_goal[i][j] >= (1 << 30)) {
						a += distance_from_spring[i][j];
						b++;
						continue;
					} else {
						a += distance_from_goal[i][j];

						if (distance_from_spring[i][j] >= (1 << 30)
								|| distance_from_goal[i][j] <= distance_from_spring[i][j]) {
							continue;
						} else
							list.add(new P(distance_from_goal[i][j], distance_from_spring[i][j]));
					}
				}
			}
		}
		list.sort(null);

		double e = a / (n - b);
		for (int i = 0; i < list.size(); i++) {
			a -= list.get(i).d_goal;
			a += list.get(i).d_spring;
			b++;
			if (i < list.size() - 1 && list.get(i).diff == list.get(i + 1).diff)
				continue;
			System.out.println(a / (n - b));
			e = Math.min(e, a / (n - b));
		}

		System.out.println(Math.min(distance_from_goal[sy][sx], e + distance_from_spring[sy][sx]));
	}

	boolean on_filed(int x, int y) {
		if (0 <= x && x < w && 0 <= y && y < h && table[y][x] != '#')
			return true;
		else
			return false;
	}

	class Pair {
		int x;
		int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	class P implements Comparable<P> {
		int d_goal;
		int d_spring;
		int diff;

		public P(int d_goal, int d_spring) {
			this.d_goal = d_goal;
			this.d_spring = d_spring;
			diff = d_goal - d_spring;
		}

		@Override
		public int compareTo(P o) {
			return -Integer.compare(this.diff, o.diff);
		}
	}

	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}