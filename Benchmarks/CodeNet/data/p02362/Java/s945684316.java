
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Queue;
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

	static class TaskX {
		@SuppressWarnings("unchecked")
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int v = in.nextInt();
			int e = in.nextInt();
			int r = in.nextInt();
			Node[] nodes = new Node[v];
			for (int i = 0; i < v; i++) {
				nodes[i] = new Node(i, Integer.MAX_VALUE);
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

			boolean isNegative = bellmanFord(list, nodes, r);

			if (!isNegative) {
				for (int i = 0; i < v; i++) {
					if (nodes[i].cost == Integer.MAX_VALUE) {
						out.println("INF");
					} else {
						out.println(nodes[i].cost);
					}
				}
			} else {
				out.println("NEGATIVE CYCLE");
			}

		}
	}

	static boolean bellmanFord(List<Edge>[] list, Node[] nodes, int fromNode) {

		int count = 0;
		boolean isNegativeCycle = false;
		nodes[fromNode].cost = 0;
		Queue<Node> q = new ArrayDeque<>();
		q.add(nodes[fromNode]);

		if (list.length > 0) {
			while (!q.isEmpty()) {
				Node fNode = q.remove();
				for (int i = 0; i < list[fNode.nodeNum].size(); i++) {
					Edge e = list[fNode.nodeNum].get(i);
					if (fNode.cost + e.weight < nodes[e.toNodeNum].cost) {
						nodes[e.toNodeNum].cost = fNode.cost + e.weight;
						q.add(nodes[e.toNodeNum]);
						if (count == 1 << 20) {
							isNegativeCycle = true;
							return isNegativeCycle;
						}
					}
				}
				count++;
			}
		}
		return isNegativeCycle;
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

