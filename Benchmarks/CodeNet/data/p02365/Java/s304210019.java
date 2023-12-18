
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	@SuppressWarnings("unchecked")
	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int s = scanner.nextInt();
		List<Edge>[] lists = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			lists[i] = new ArrayList<Edge>();
		}
		for (int i = 0; i < m; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			lists[a].add(new Edge(b, c));
		}
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		int[] cost = new int[n];
		Arrays.fill(cost, Integer.MAX_VALUE);
		cost[s] = 0;
		pq.offer(new Edge(s, 0));
		while (!pq.isEmpty()) {
			Edge edge = pq.poll();
			for (Edge e : lists[edge.target]) {
				if (cost[e.target] >  e.cost) {
					cost[e.target] =  e.cost;
					pq.offer(new Edge(e.target, 0));
				}
			}
		}
		int sum = 0;
		for (int c : cost)
			sum += c;
		System.out.println(sum);
	}

	class Edge implements Comparable<Edge> {
		int target, cost;

		public Edge(int target, int cost) {
			super();
			this.target = target;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Edge [target=" + target + ", cost=" + cost + "]";
		}

		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}

	}

	class UnionFind {
		int[] rank, node;

		UnionFind(int size) {
			rank = new int[size];
			node = new int[size];
			for (int i = 0; i < size; i++) {
				node[i] = i;
			}
		}

		@Override
		public String toString() {
			return "UnionFind [rank=" + Arrays.toString(rank) + ", node="
					+ Arrays.toString(node) + "]";
		}

		int find(int x) {
			if (x == node[x])
				return x;
			return node[x] = find(node[x]);
		}

		boolean isSame(int x, int y) {
			return find(x) == find(y);
		}

		void merge(int x, int y) {
			x = find(x);
			y = find(y);
			if (x == y)
				return;
			if (rank[x] > rank[y])
				node[y] = x;
			else {
				node[x] = y;
				if (rank[x] == rank[y])
					rank[y]++;
			}
		}

	}
}