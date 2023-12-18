import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Cards
 */
public class Main {

	static final int INF = 1 << 29;

	static int S, T;
	static List<List<Edge>> G;
	static boolean[] used;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int m, n;
			m = parseInt(line.substring(0, line.indexOf(' ')));
			n = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((m | n) == 0) break;

			S = m + n;
			T = S + 1;

			int[] ms = new int[m];
			int[] ns = new int[n];

			for (int i = 0; i < m; ) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				while (st.hasMoreTokens()) {
					ms[i] = parseInt(st.nextToken());
					i++;
				}
			}

			for (int i = 0; i < n; ) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				while (st.hasMoreTokens()) {
					ns[i] = parseInt(st.nextToken());
					i++;
				}
			}

			//
			G = new ArrayList<>();
			used = new boolean[T + 1];

			for (int i = 0; i <= T; i++) {
				G.add(new ArrayList<>());
			}

			//S -> blue
			for (int i = 0; i < m; i++) {
				G.get(S).add(new Edge(i, 1, G.get(i).size()));
				G.get(i).add(new Edge(S, 0, G.get(S).size() - 1));
			}

			//red -> T
			for (int i = m; i < m + n; i++) {
				G.get(i).add(new Edge(T, 1, G.get(T).size()));
				G.get(T).add(new Edge(i, 0, G.get(i).size() - 1));
			}

			//blue -> red
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (gcd(ms[i], ns[j]) > 1) {
						G.get(i).add(new Edge(m + j, 1, G.get(m + j).size()));
						G.get(m + j).add(new Edge(i, 0, G.get(i).size() - 1));
					}
				}
			}

			int ans = 0;

			while (true) {
				used = new boolean[T + 1];
				int f = rec(S, T, INF);
				if (f == 0) break;
				ans += f;
			}

			System.out.println(ans);
		}
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

	static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
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