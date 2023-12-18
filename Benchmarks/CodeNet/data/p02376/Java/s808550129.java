import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Network Flow - Maximum Flow
 */
public class Main {

	static final int INF = 1 << 29;

	static List<List<Edge>> G;
	static boolean[] used;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		line = br.readLine();

		int V = Integer.parseInt(line.substring(0, line.indexOf(' ')));
		int E = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

		G = new ArrayList<>();

		for (int i = 0; i < V; i++) {
			G.add(new ArrayList<>());
		}

		for (int i = 0; i < E; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int u, v, c;
			u = parseInt(st.nextToken());
			v = parseInt(st.nextToken());
			c = parseInt(st.nextToken());

			G.get(u).add(new Edge(v, c, G.get(v).size()));
			G.get(v).add(new Edge(u, 0, G.get(u).size() - 1));
		}

		int ans = 0;

		while (true) {
			used = new boolean[V];
			int f = rec(0, V - 1, INF);
			if (f == 0) break;
			ans += f;
		}

		System.out.println(ans);
	}

	static int rec(int u, int v, int f) {

		if (u == v) return f;

		used[u] = true;

		for (Edge e : G.get(u)) {
			if (!used[e.to] && e.cap > 0) {
				int d = rec(e.to, v, Math.min(f, e.cap));
				if (d > 0) {
					e.cap -= d;
					G.get(e.to).get(e.rev).cap += d;
					return d;
				}
			}
		}

		return 0;
	}
}

class Edge {
	int to, cap, rev;

	public Edge(int to, int cap, int rev) {
		this.to = to;
		this.cap = cap;
		this.rev = rev;
	}
}