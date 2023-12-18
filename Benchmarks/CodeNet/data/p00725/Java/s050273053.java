import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	class Pair {
		int x, y;
		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public boolean equals(Object o) {
			return this.x == ((Pair)o).x && this.y == ((Pair)o).y;
		}
	}
	
	class Node implements Comparable<Node> {
		int x, y, cost;
		Set<Pair> set;
		Node (int x, int y, int cost) {
			this.x = x;
			this.y = y;
			this.cost = cost;
			set = new HashSet<Pair>();
		}
		@Override
		public int compareTo(Node o) {
			return cost - o.cost;
		}
	}
	
	void run() {
		int[][] map = new int[20][20];
		PriorityQueue<Node> queue = new PriorityQueue<Node>();
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};
		Pair[][] pairs = new Pair[20][20];
		for (int i = 0; i < 20; i++)
			for (int j = 0; j < 20; j++)
				pairs[i][j] = new Pair(i, j);
		t:while (true) {
			int w = sc.nextInt(), h = sc.nextInt();
			if (w == 0 && h == 0) break;
			int sx, sy;
			sx = sy = 0;
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++) {
					map[i][j] = sc.nextInt();
					if (map[i][j] == 2) {
						sx = i; sy = j;
					}
				}
			queue.clear();
			queue.add(new Node(sx, sy, 1));
			while (!queue.isEmpty()) {
				Node node = queue.poll();
				if (node.cost > 10) break;
				int x = node.x, y = node.y;
				for (int i = 0; i < 4; i++) {
					int c = 1;
					while (true) {
						if (x+c*dx[i] < 0 || y+c*dy[i] < 0 || x+c*dx[i] >= h || y+c*dy[i] >= w) {
							break;
						} else if (map[x+c*dx[i]][y+c*dy[i]] == 1 && !node.set.contains(pairs[x+c*dx[i]][y+c*dy[i]])) {
							if (c == 1) break;
							Node n = new Node(x+(c-1)*dx[i], y+(c-1)*dy[i], node.cost+1);
							n.set.addAll(node.set);
							n.set.add(pairs[x+c*dx[i]][y+c*dy[i]]);
							queue.add(n);
							break;
						} else if (map[x+c*dx[i]][y+c*dy[i]] == 3) {
							out.println(node.cost);
							continue t;
						} else {
							c++;
						}
					}
				}
			}
			out.println(-1);
		}

	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}