import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	private final int[] EDX = { 0, 1, 1, 0, -1, -1 };
	private final int[] EDY = { 1, 0, -1, -1, -1, 0 };
	private final int[] ODX = { 0, 1, 1, 0, -1, -1 };
	private final int[] ODY = { 1, 1, 0, -1, 0, 1 };
	private int limx, limy;

	public void solve() {
		Scanner scanner = new Scanner(System.in);
		int[] s = new int[2];
		int[] g = new int[2];
		for (int i = 0; i < 2; i++) {
			s[i] = scanner.nextInt();
		}
		for (int i = 0; i < 2; i++) {
			g[i] = scanner.nextInt();
		}

		int n = scanner.nextInt();
		int[] ox = new int[n];
		int[] oy = new int[n];
		for (int i = 0; i < n; i++) {
			ox[i] = scanner.nextInt();
			oy[i] = scanner.nextInt();
		}

		limx = scanner.nextInt();
		limy = scanner.nextInt();
		scanner.close();

		int xWidth = (limx * 2 + 1);
		int yWidth = (limy * 2 + 1);
		int N = xWidth * yWidth * 6;
		Graph graph = new Graph(N);

		TreeSet<Integer> obstacles = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			obstacles.add(getVertex(ox[i], oy[i], 0));
		}

		for (int x = -limx; x <= limx; x++) {
			for (int y = -limy; y <= limy; y++) {
				if (obstacles.contains(getVertex(x, y, 0))) {
					continue;
				}
				for (int t = 0; t < 6; t++) {
					int from = getVertex(x, y, t);
					int d = Math.abs(x * y * t) % 6;
					for (int dir = 0; dir < 6; dir++) {
						int nx = x + EDX[dir];
						int ny = y + EDY[dir];
						if (Math.abs(x) % 2 != 0) {
							nx = x + ODX[dir];
							ny = y + ODY[dir];
						}

						if (nx > limx || nx < -limx || ny > limy || ny < -limy) {
							continue;
						}
						if (obstacles.contains(getVertex(nx, ny, 0))) {
							continue;
						}

						int to = getVertex(nx, ny, t + 1);
						if (dir == d) {
							graph.addBidirectionalEdge(from, to, 0);
						} else {
							graph.addBidirectionalEdge(from, to, 1);
						}
					}
					int to = getVertex(x, y, t + 1);
					graph.addBidirectionalEdge(from, to, 1);
				}
			}
		}
		int start = getVertex(s[0], s[1], 0);
		long[] minDists = graph.minDistDijkstra(start);
		long ans = Integer.MAX_VALUE;
		for (int t = 0; t < 6; t++) {
			int goal = getVertex(g[0], g[1], t);
			ans = Math.min(ans, minDists[goal]);
		}
		if (ans >= Integer.MAX_VALUE) {
			System.out.println(-1);
			return;
		}
		System.out.println(ans);
	}

	private int getVertex(int x, int y, int t) {
		int nx = x + limx;
		int ny = y + limy;
		int xW = 2 * limx + 1;
		int yW = 2 * limy + 1;
		t %= 6;
		return t * xW * yW + nx * yW + ny;
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}

class Graph {
	public static final long INF = Long.MAX_VALUE / 2;
	int n;
	ArrayList<Edge>[] graph;

	@SuppressWarnings("unchecked")
	public Graph(int n) {
		this.n = n;
		this.graph = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<Edge>();
		}
	}

	public void addBidirectionalEdge(int from, int to, int cost) {
		addEdge(from, to, cost);
		addEdge(to, from, cost);
	}

	public void addEdge(int from, int to, int cost) {
		graph[from].add(new Edge(to, cost));
	}

	// dijkstra O(ElogV)
	public long[] minDistDijkstra(int start) {
		long[] dist = new long[n];
		Arrays.fill(dist, INF);
		dist[start] = 0;

		PriorityQueue<Node> priorityQueue = new PriorityQueue<Node>();
		priorityQueue.offer(new Node(0, start));

		while (!priorityQueue.isEmpty()) {
			// キューから1番距離の近いノードを取り出す
			Node node = priorityQueue.poll();
			int v = node.id;
			if (dist[v] < node.dist) {
				// 暫定の最短距離よりも遠かったらスルー
				continue;
			}

			for (Edge e : graph[v]) {
				/*
				 * 取り出したノードから出ている全ての辺について調べ、 暫定の最短距離が更新される場合は更新してキューに入れる
				 */
				if (dist[e.to] > dist[v] + e.cost) {
					dist[e.to] = dist[v] + e.cost;
					priorityQueue.add(new Node(dist[e.to], e.to));
				}
			}
		}
		return dist;
	}

}

class Edge {
	int to;
	int cost;

	public Edge(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}
}

class Node implements Comparable<Node> {
	long dist;
	int id;

	public Node(long dist, int i) {
		this.dist = dist;
		this.id = i;
	}

	public int compareTo(Node o) {
		if (this.dist > o.dist) {
			return 1;
		} else if (this.dist < o.dist) {
			return -1;
		} else {
			return 0;
		}
	}
}