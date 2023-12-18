import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Graph II - Single Source Shortest Path I
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int n = parseInt(br.readLine());

		Graph G = new Graph(n);

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int u, k;
			u = parseInt(st.nextToken());
			k = parseInt(st.nextToken());
			for (int j = 0; j < k; j++) {
				int v, c;
				v = parseInt(st.nextToken());
				c = parseInt(st.nextToken());
				Edge e = new Edge();
				e.s = G.vs[u];
				e.t = G.vs[v];
				e.cost = c;
				G.es.get(e.s).add(e);
			}
		}

		//
		G.vs[0].cost = 0;

		Queue<Vertex> pq = new PriorityQueue<>();
		pq.offer(G.vs[0]);

		while (!pq.isEmpty()) {
			Vertex s = pq.poll();
			for (Edge e : G.es.get(s)) {
				if (e.t.cost > s.cost + e.cost) {
					e.t.cost = s.cost + e.cost;
					if (!pq.contains(e.t)) {
						pq.offer(e.t);
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(i + " " + G.vs[i].cost);
		}

	} //end main
}

class Graph {

	static int INF = 1 << 29;

	Vertex[] vs;
	Map<Vertex, List<Edge>> es;

	Graph(int n) {
		vs = new Vertex[n];
		for (int i = 0; i < n; i++) {
			vs[i] = new Vertex();
		}
		es = new HashMap<>();
		for (int i = 0; i < n; i++) {
			es.put(vs[i], new ArrayList<>());
		}
	}
}

class Vertex implements Comparable<Vertex> {
	int cost = Graph.INF;
	boolean passed = false;

	@Override
	public int compareTo(Vertex o) {
		return Integer.compare(this.cost, o.cost);
	}
}

class Edge {
	Vertex s, t;
	int cost;
}