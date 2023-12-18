import java.io.*;
import java.util.*;

public class Main {
	static int vertex;
	static int edge;
	static int start;
	static int[] cost;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Main obj = new Main();
	static ArrayList<Edge>[] graph;

	private class Edge implements Comparable<Edge> {
		int from;
		int to;
		int weight;

		public Edge(int a, int b, int c) {
			from = a;
			to = b;
			weight = c;
		}

		@Override
		public int compareTo(Edge other) {
			return weight - other.weight;
		}
	}

	public static void main(String[] args) throws IOException {
		input();
		compute(start);

	}

	public static void compute(int a) {
		cost[a] = 0;
		ArrayList<Edge> temp = graph[a];
		for (Edge e : temp) {
			if (cost[e.to] > e.weight) {
				cost[e.to] = e.weight;
			}
		}
		boolean changed = true;
		int index = 1;
		while (changed) {
			if (index == vertex) {
				System.out.println("NEGATIVE CYCLE");
				System.exit(0);
			}
			changed = false;
			for (int i = 1; i <= vertex; i++) {
				for (Edge e : graph[i]) {
					if (cost[e.from] != Integer.MAX_VALUE && cost[e.to] > e.weight + cost[e.from]) {
						cost[e.to] = e.weight + cost[e.from];
						changed = true;
					}
				}
			}
			index++;
		}
		for (int i = 1; i < cost.length; i++) {
			if(cost[i]!= Integer.MAX_VALUE){
				System.out.println(cost[i] + " ");
			}else{
				System.out.println("INF");
			}
		}
	}

	public static void input() throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		vertex = Integer.parseInt(st.nextToken());
		edge = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken())+1;
		graph = new ArrayList[vertex + 1];
		cost = new int[vertex + 1];
		for (int i = 1; i <= vertex; i++) {
			graph[i] = new ArrayList<Edge>();
			cost[i] = Integer.MAX_VALUE;
		}
		for (int i = 0; i < edge; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			graph[a+1].add(obj.new Edge(a+1, b+1, c));
		}

	}
}