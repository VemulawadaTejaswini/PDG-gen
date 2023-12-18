import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Solution solution = new Solution();
		solution.compute();
	}
}

class Solution {
	void compute() {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		
		Dijkstra graph = new Dijkstra(10000);
		while (true) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if (n == 0 && m == 0) {
				break;
			}
			graph.initialize(n);
			for (int i = 0; i < m; i++) {
				int u = scanner.nextInt();
				int v = scanner.nextInt();
				int d = scanner.nextInt();
				int c = scanner.nextInt();
				u--;
				v--;
				graph.addEdge(u, v, d, c);
				graph.addEdge(v, u, d, c);
			}
			int ans = graph.dijkstra(0);
			System.out.println(ans);
		}

		scanner.close();
	}
}

class Dijkstra {
	final int INFINITY = 0x3f3f3f3f;
	final int MAX_N;

	class Edge implements Comparable<Edge> {
		int to;
		int cost;
		int money;

		Edge(int to, int cost, int money) {
			this.to = to;
			this.cost = cost;
			this.money = money;
		}

		@Override
		public int compareTo(Edge that) {
			int ans = this.cost - that.cost;
			if (ans != 0) {
				return ans;
			}
			return this.money - that.money;
		}
	}

	Vector<Edge>[] graph;
	int[] distance;
	boolean[] visit;
	int n;

	@SuppressWarnings("unchecked")
	Dijkstra(int MAX_N) {
		this.MAX_N = MAX_N;
		graph = (Vector<Edge>[]) new Vector[MAX_N];
		for (int i = 0; i < MAX_N; i++) {
			graph[i] = new Vector<Edge>();
		}
		distance = new int[MAX_N];
		visit = new boolean[MAX_N];
	}

	void initialize(int n) {
		this.n = n;
		for (int i = 0; i < n; i++) {
			graph[i].clear();
		}
		Arrays.fill(distance, INFINITY);
		Arrays.fill(visit, false);
	}

	void addEdge(int from, int to, int cost, int money) {
		graph[from].addElement(new Edge(to, cost, money));
	}

	int dijkstra(int start) {
		int ans = 0;
		
		Queue<Edge> que = new PriorityQueue<Edge>();
		distance[start] = 0;
		que.add(new Edge(start, 0, 0));
		while (!que.isEmpty()) {
			Edge node = que.poll();
			int from = node.to;
			if (visit[from]) {
				continue;
			}
			visit[from] = true;
			ans += node.money;
			for (Edge e : graph[from]) {
				int to = e.to;
				int cost = e.cost;
				if (!visit[to] && distance[to] >= distance[from] + cost) {
					distance[to] = distance[from] + cost;
					que.add(new Edge(to, distance[to], e.money));
				}
			}
		}
		return ans;
	}
}

