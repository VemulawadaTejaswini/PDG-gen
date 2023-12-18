
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {

		Scanner sc = new Scanner(System.in);

		int dir[][] = { { -1, 0 }, { 1, 0 }, { 0, 1 } };

		while (true) {
			final int w = sc.nextInt();
			final int h = sc.nextInt();

			if (w == 0 && h == 0) {
				break;
			}

			final int amount = sc.nextInt();
			final int capacity = sc.nextInt();
			final int init = sc.nextInt();

			int[][] map = new int[h][w];

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			PriorityQueue<Walk> queue = new PriorityQueue<Walk>();
			for (int i = 0; i < w; i++) {
				Walk walk = new Walk(0, init, i, 0, h, w);
				walk.sanso--;
				queue.add(walk);
			}

			boolean flag = false;
			while (!queue.isEmpty()) {
				Walk walk = queue.poll();

				// System.out.println(walk.x + " " + walk.y + " " + walk.cost +
				// " " + walk.sanso);

				if (walk.sanso <= 0) {
					continue;
				} else if (walk.y >= h) {
					flag = true;
					System.out.println(walk.cost);
					break;
				}

				walk.visited[walk.y][walk.x] = true;

				if (map[walk.y][walk.x] <= 0) {
					walk.cost += (-map[walk.y][walk.x]);
				} else {
					walk.sanso = Math.min(map[walk.y][walk.x] + walk.sanso,
							capacity);
				}

				if (walk.cost > amount) {
					continue;
				}

				for (int i = 0; i < 3; i++) {
					if (walk.x + dir[i][0] >= 0
							&& walk.x + dir[i][0] <= w - 1
							&& walk.y + dir[i][1] >= 0
							&& walk.y + dir[i][1] <= h - 1
							&& !walk.visited[walk.y + dir[i][1]][walk.x
									+ dir[i][0]]) {

						Walk wa = new Walk(walk);
						wa.x += dir[i][0];
						wa.y += dir[i][1];
						wa.sanso--;
						queue.add(wa);
					} else if (i == 2 && walk.y == h - 1) {
						Walk wa = new Walk(walk);
						wa.y++;
						queue.add(wa);
					}
				}
			}

			if (!flag) {
				System.out.println("NA");
			}

		}
	}
}

class Walk implements Comparable<Walk> {
	int cost;
	int sanso;
	int x, y;
	boolean[][] visited;

	public Walk(int cost, int sanso, int x, int y, int h, int w) {
		super();
		this.cost = cost;
		this.sanso = sanso;
		this.x = x;
		this.y = y;
		visited = new boolean[h][w];
	}

	public Walk(Walk w) {
		this.cost = w.cost;
		this.sanso = w.sanso;
		this.x = w.x;
		this.y = w.y;
		visited = new boolean[w.visited.length][w.visited[0].length];
		for (int i = 0; i < w.visited.length; i++) {
			visited[i] = Arrays.copyOf(w.visited[i], w.visited[0].length);
		}
	}

	@Override
	public int compareTo(Walk arg0) {
		return this.cost - arg0.cost;
	}
}