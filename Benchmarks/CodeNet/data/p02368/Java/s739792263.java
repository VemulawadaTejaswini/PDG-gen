import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	private static List<Integer>[] G;
	private static List<Integer>[] rG;
	private static ArrayList<Integer> vs = new ArrayList<Integer>();
	private static boolean[] used;
	private static int[] cmp;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int V = nextInt();
		int E = nextInt();

		G = new List[V];
		rG = new List[V];
		for (int i = 0; i < V; i++) {
			G[i] = new ArrayList<Integer>();
			rG[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < E; i++) {
			int from = nextInt();
			int to = nextInt();
			G[from].add(to);
			rG[to].add(from);
		}

		used = new boolean[V];
		cmp = new int[V];
		for (int i = 0; i < V; i++) {
			if (!used[i]) {
				dfs(i);
			}
		}

		used = new boolean[V];
		int k = 0;
		for (int i = vs.size() - 1; i >= 0; i--) {
			if (!used[vs.get(i)]) {
				rdfs(vs.get(i), k++);
			}
		}

		int Q = nextInt();
		for (int i = 0; i < Q; i++) {
			int u = nextInt();
			int v = nextInt();
			if (cmp[u] == cmp[v]) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}

	}

	static void dfs(int v) {
		used[v] = true;
		for (int i = 0; i < G[v].size(); i++) {
			if (!used[G[v].get(i)]) {
				dfs(G[v].get(i));
			}
		}
		vs.add(v);
	}

	static void rdfs(int v, int k) {
		used[v] = true;
		cmp[v] = k;
		for (int i = 0; i < rG[v].size(); i++) {
			if (!used[rG[v].get(i)]) {
				rdfs(rG[v].get(i), k);
			}
		}
	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

}