import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	static List<List<edge>> graph;

	static int[] d;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		graph = new ArrayList<>();

		d = new int[n];

		for (int i = 0; i < n; i++) {
			String[] node_edge = br.readLine().split(" ");

			int k = Integer.parseInt(node_edge[1]);
			List<edge> node_edges = new ArrayList<>();
			for (int j = 0; j < k; j++) {
				node_edges.add(
						new edge(i, Integer.parseInt(node_edge[2 + j * 2]), Integer.parseInt(node_edge[3 + j * 2])));
			}
			graph.add(node_edges);
		}
		/*
		 * for(int i=0; i<graph.size(); i++){ for(edge e: graph.get(i)){
		 * System.out.println(e.from+""+e.to+""+e.cost); } }
		 */
		bell(0);

		for (int i = 0; i < d.length; i++) {
			System.out.println(i + " " + d[i]);
		}
	}

	static void bell(int sx) {

		Arrays.fill(d, Integer.MAX_VALUE / 2);
		d[sx] = 0;

		while (true) {
			boolean judge = true;
			for (int i = 0; i < graph.size(); i++) {

				List<edge> e = graph.get(i);

				for (edge now_edge : e) {

					int v = now_edge.to;
					int u = now_edge.from;
					int c = now_edge.cost;

					if (d[v] > d[u] + c) {
						d[v] = d[u] + c;

						/*
						 * System.out.println("from"+u+""+"to"+v + ""+"??????"+
						 * d[v]);
						 */
						judge = false;
					}

				}

			}
			if (judge) {
				break;
			}
		}

	}

	static class edge {

		int to;

		int from;

		int cost;

		public edge(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
	}

}