
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
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

	static int INF = Integer.MAX_VALUE;
	static class TaskX {
		@SuppressWarnings("unchecked")
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int v = in.nextInt();
			int e = in.nextInt();
			int r = in.nextInt();
			Node[] nodes = new Node[v];
			for (int i = 0; i < v; i++) {
				nodes[i] = new Node(i, INF);
			}
			List<Edge>[] list = new ArrayList[e];
			for (int i = 0; i < e; i++) {
				list[i] = new ArrayList<>();
			}
			for (int i = 0; i < e; i++) {
				int s = in.nextInt();
				int t = in.nextInt();
				int d = in.nextInt();
				list[s].add(new Edge(t, d));
			}

			if (findNegativeLoop(list, nodes)) {
				out.println("NEGATIVE CYCLE");
				return;
			}

			bellmanFord(list, nodes, r);

			for (int i = 0; i < v; i++) {
				if (nodes[i].cost == INF) {
					out.println("INF");
				} else {
					out.println(nodes[i].cost);
				}
			}
		}
	}

	static void bellmanFord(List<Edge>[] list, Node[] nodes, int fromNode) {

		for (int i = 0; i < nodes.length; i++) {
			nodes[i] = new Node(i, INF);
		}
		nodes[fromNode].cost = 0;

		if (list.length > 0) {
			while (true) {
				boolean update = false;
				for (int i = 0; i < list.length; i++) {
					for (int j = 0; j < list[i].size(); j++) {
						Edge e = list[i].get(j);
						if (nodes[i].cost != INF && nodes[e.toNodeNum].cost > nodes[i].cost + e.weight) {
							nodes[e.toNodeNum].cost = nodes[i].cost + e.weight;
							update = true;
						}
					}
				}
				if (!update) break;
			}
		}
	}

	static boolean findNegativeLoop(List<Edge>[] list, Node[] nodes) {
		int count = 0;
		for (int i = 0; i < nodes.length; i++) {
			nodes[i] = new Node(i, 0);
		}
		for (int k = 0; k < nodes.length; k++) {
			for (int i = 0; i < list.length; i++) {
				for (int j = 0; j < list[i].size(); j++) {
					Edge e = list[i].get(j);
					if (nodes[e.toNodeNum].cost > nodes[i].cost + e.weight) {
						nodes[e.toNodeNum].cost = nodes[i].cost + e.weight;
						if (count++ == nodes.length - 1) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	static class Node {
		int nodeNum;
		int cost;

		public Node(int nodeNum, int weight) {
			this.nodeNum = nodeNum;
			this.cost = weight;
		}
	}
	static class Edge {
		int toNodeNum;
		int weight;

		public Edge(int nodeNum, int weight) {
			this.toNodeNum = nodeNum;
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

