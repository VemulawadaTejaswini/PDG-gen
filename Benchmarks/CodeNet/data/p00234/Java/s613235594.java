
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {

		Scanner sc = new Scanner(System.in);

		int dir[][] = { { 0, -1 }, { 0, 1 }, { 1, 0 } };

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
				boolean[][] b = new boolean[h][w];
				queue.offer(new Walk(-map[0][i], init - 1, 0, i, b));
			}

			boolean flag = false;
			loop: while (!queue.isEmpty()) {
				Walk walk = queue.poll();
				int y = walk.y;
				int x = walk.x;
				if (walk.cost > amount) {
					continue;
				}
				if (y == h - 1) {
					flag = true;
					System.out.println(walk.cost);
					break loop;
				}

				walk.visited[y][x] = true;

				for (int i = 0; i < 3; i++) {
					int ny = y + dir[i][0];
					int nx = x + dir[i][1];
					if (nx < 0 || nx >= w || ny < 0 || ny >= h
							|| walk.visited[ny][nx])
						continue;
					int cost = walk.cost;
					int sanso = walk.sanso - 1;
					if (map[ny][nx] <= 0) {
						cost += (-map[ny][nx]);
					} else {
						sanso = Math.min(map[ny][nx] + sanso, capacity);
					}
					if (sanso == 1 && ny != h - 1)
						continue;
					boolean[][] nb = new boolean[h][w];
					for (int j = 0; j < h; j++) {
						nb[j] = Arrays.copyOf(walk.visited[j], w);
					}

					queue.offer(new Walk(cost, sanso, ny, nx, nb));
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

	public Walk(int cost, int sanso, int y, int x, boolean[][] visited) {
		super();
		this.cost = cost;
		this.sanso = sanso;
		this.x = x;
		this.y = y;
		this.visited = visited;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < visited.length; i++) {
			builder.append(Arrays.toString(visited[i])).append('\n');
		}
		return "Walk [cost=" + cost + ", sanso=" + sanso + ", x=" + x + ", y="
				+ y + ", visited=\n" + builder + "]";
	}

	@Override
	public int compareTo(Walk arg0) {
		if (this.cost == arg0.cost)
			return arg0.y - this.y;
		return this.cost - arg0.cost;
	}
}