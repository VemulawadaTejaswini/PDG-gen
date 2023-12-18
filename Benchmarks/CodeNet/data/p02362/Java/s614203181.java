
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static long INF = Long.MAX_VALUE;
	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int v = in.nextInt();
			int e = in.nextInt();
			int r = in.nextInt();
			Node[] nodes = new Node[v];
			Edge[] edges = new Edge[e];
			for (int i = 0; i < e; i++) {
				int s = in.nextInt();
				int t = in.nextInt();
				long d = in.nextLong();
				edges[i] = new Edge(s, t, d);
			}

			if (findNegativeCycleByBellmanFord(edges, nodes, r)) {
				out.println("NEGATIVE CYCLE");
				return;
			}

			bellmanFord(edges, nodes, r);

			for (int i = 0; i < v; i++) {
				if (nodes[i].cost == INF) {
					out.println("INF");
				} else {
					out.println(nodes[i].cost);
				}
			}


		}
	}

	static void bellmanFord(Edge[] edges, Node[] nodes, int fromNode) {

		int n = nodes.length;
		int m = edges.length;
		long INF = Long.MAX_VALUE;

		// 最短経路の探索
		for (int i = 0; i < n; i++) {
			nodes[i] = new Node(i, INF);
		}
		nodes[fromNode].cost = 0;

		for (int loop = 0; loop < n - 1; loop++) {
			for (int i = 0; i < m; i++) {
				if (nodes[edges[i].fromNodeNum].cost == INF) {
					continue;
				}
				if (nodes[edges[i].toNodeNum].cost > nodes[edges[i].fromNodeNum].cost + edges[i].weight) {
					nodes[edges[i].toNodeNum].cost = nodes[edges[i].fromNodeNum].cost + edges[i].weight;
				}
			}
		}
	}

	static boolean findNegativeCycleByBellmanFord(Edge[] edges, Node[] nodes, int fromNode) {

		int n = nodes.length;
		int m = edges.length;
		long INF = Long.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			nodes[i] = new Node(i, INF);
		}
		nodes[fromNode].cost = 0;

		// 負閉路の検知
		boolean isNegative = false;
		for (int loop = 0; loop < n; loop++) {
			for (int i = 0; i < m; i++) {
				if (nodes[edges[i].fromNodeNum].cost == INF) {
					continue;
				}
				if (nodes[edges[i].toNodeNum].cost > nodes[edges[i].fromNodeNum].cost + edges[i].weight) {
					nodes[edges[i].toNodeNum].cost = nodes[edges[i].fromNodeNum].cost + edges[i].weight;
					if (loop == n - 1) isNegative = true;
				}
			}
		}

		return isNegative;

	}

	static class Node {
		int nodeNum;
		long cost;

		public Node(int nodeNum, long weight) {
			this.nodeNum = nodeNum;
			this.cost = weight;
		}
	}
	static class Edge {
		int fromNodeNum;
		int toNodeNum;
		long weight;

		public Edge(int fromNodeNum, int toNodeNum, long weight) {
			this.fromNodeNum = fromNodeNum;
			this.toNodeNum = toNodeNum;
			this.weight = weight;
		}
	}

	static class ArrayUtils {
		public static Map<Integer, Integer> getCountMap(int[] array) {
			Map<Integer, Integer> map = new TreeMap<>();
			for (int x : array)
				map.merge(x, 1, Integer::sum);
			return map;
		}
	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}

	}

}

