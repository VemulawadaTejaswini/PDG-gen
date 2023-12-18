import java.util.*;
import java.io.*;

public class Main {

	static Main obj = new Main();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int vertex;
	static int edges;
	static int start;
	static int[] cost;
	static int[] parent;
	static boolean[] visited;
	static ArrayList<Edge>[] graph;

	private class Edge implements Comparable<Edge> {
		int from;
		int to;
		int weight;

		public Edge(int from, int to, int weight) {
			this.from = from;
			this.to = to;
			this.weight = weight;
		}

		@Override
		public int compareTo(Edge other) {
			return this.weight - other.weight;

		}
	}

	public static void main(String[] args) throws IOException {
		input();
		dijk(start);
	}

	public static void dijk(int index) {
		// int added = 1;
		cost[index] = 0;
		visited[index] = true;
		parent[index] = index;
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		for (Edge temp : graph[index]) {
			pq.offer(temp);
			cost[temp.to] = temp.weight;
		}
		while (!pq.isEmpty()) {
			Edge e = pq.poll();
			if (visited[e.to]) {
				continue;
			}
			visited[e.to] = true;
			// added++;
			for (Edge f : graph[e.to]) {
				if (!visited[f.to]) {
					cost[f.to] = f.weight + e.weight;
					parent[f.to] = f.from;
					pq.offer(obj.new Edge(f.from, f.to, f.weight + e.weight));
				}
			}
		}
		for (int i : cost) {
			if (i == Integer.MAX_VALUE) {
				System.out.println("INF");
			} else {
				System.out.println(i);
			}
		}
	}

	@SuppressWarnings("unchecked")
	public static void input() throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		vertex = Integer.parseInt(st.nextToken());
		edges = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		cost = new int[vertex];
		parent = new int[vertex];
		visited = new boolean[vertex];
		graph = new ArrayList[vertex];
		for (int i = 0; i < vertex; i++) {
			graph[i] = new ArrayList<Edge>();
			cost[i] = Integer.MAX_VALUE;
		}
		for (int i = 0; i < edges; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			graph[a].add(obj.new Edge(a, b, c));
		}

	}
}

