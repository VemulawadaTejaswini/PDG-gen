import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int[][] graph;
	static int V;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] V_E = br.readLine().split(" ");

		V = Integer.parseInt(V_E[0]);

		int E = Integer.parseInt(V_E[1]);

		graph = new int[V][V];

		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				if (!(i == j)) {
					graph[i][j] = Integer.MAX_VALUE / 2;
				}
			}
		}

		for (int i = 0; i < E; i++) {
			String[] edge = br.readLine().split(" ");

			int from = Integer.parseInt(edge[0]);

			int to = Integer.parseInt(edge[1]);

			int cost = Integer.parseInt(edge[2]);

			graph[from][to] = cost;
		}
		washawasha();

		boolean negative = true;

		for (int i = 0; i < V; i++) {
			if (graph[i][i] < 0) {
				System.out.println("NEGATIVE CYCLE");
				negative = false;
				break;
			}
		}

		if (negative) {

			for (int i = 0; i < V; i++) {
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < V; j++) {
					if (graph[i][j] == Integer.MAX_VALUE / 2) {
						sb.append("INF");
						sb.append(" ");
					} else {
						sb.append(graph[i][j]);
						sb.append(" ");
					}
				}
				System.out.print(sb.toString().trim());
				System.out.println("");
			}
		}

	}

	static void washawasha() {
		for (int k = 0; k < V; k++) {
			for (int i = 0; i < V; i++) {
				for (int j = 0; j < V; j++) {
					graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
				}
			}
		}

	}

}