import java.io.*;
import java.util.*;
import java.util.function.*;

final class Cost {
	int y, x;
	int cost;

	public Cost(int y, int x, int cost) {
		this.y = y;
		this.x = x;
		this.cost = cost;
	}
}

final class Solver {
	void solve(Supplier<String> sc) {
		int H = Integer.parseInt(sc.get());
		int W = Integer.parseInt(sc.get());
		int Sy = Integer.parseInt(sc.get())-1;
		int Sx = Integer.parseInt(sc.get())-1;
		int Ty = Integer.parseInt(sc.get())-1;
		int Tx = Integer.parseInt(sc.get())-1;
		var maze = new char[H][];
		Arrays.setAll(maze, $ -> sc.get().toCharArray());

		var queue = new PriorityQueue<>(Comparator.comparingInt((Cost c) -> c.cost));
		queue.add(new Cost(Sy, Sx, 0));
		var visited = new boolean[H][W];
		visited[Sy][Sx] = true;
		int[] dy = {1, -1,0, 0};
		int[] dx = {0, 0, 1, -1};
		while (!queue.isEmpty()) {
			var next = queue.remove();
			visited[next.y][(next.x)] = true;

			if (next.y == Ty && next.x == Tx) {
				System.out.println(next.cost);
				return;
			}

			var queued = new boolean[H][W];
			for (int i = 0; i < 4; i++) {
				var e = new Cost(next.y + dy[i], next.x + dx[i], next.cost);
				if (isValid(maze, e) && !visited[e.y][(e.x)] && !queued[e.y][(e.x)]) {
					queued[e.y][(e.x)] = true;
					queue.add(e);
				}
			}
			for (int i = -2; i <= 2; i++) {
				for (int j = -2; j <= 2; j++) {
					if (i == 0 && j == 0) continue;
					var e = new Cost(next.y + i, next.x + j, next.cost + 1);
					if (isValid(maze, e) && !visited[e.y][e.x] && !queued[e.y][e.x]) {
						queued[e.y][(e.x)] = true;
						queue.add(e);
					}
				}
			}
		}
		System.out.println(-1);
	}

	boolean isValid(char[][] maze, Cost yx){
		if (yx.y < 0 || maze.length <= yx.y) return false;
		if (yx.x < 0 || maze[0].length <= yx.x) return false;
		return maze[yx.y][yx.x] != '#';
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		var reader = new BufferedReader(new InputStreamReader(System.in));
		new Solver().solve(new Supplier<>() {
			StringTokenizer line;

			public String get() {
				while (line == null || !line.hasMoreTokens()) try {
					line = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
				return line.nextToken();
			}
		});
		System.out.flush();
	}
}