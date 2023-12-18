

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

	@SuppressWarnings("unchecked")
	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			//input
			int n = in.nextInt();
			int q = in.nextInt();
			// makeSet
			Node[] nodes = new Node[n];
			for (int i = 0; i < n; i++) {
				nodes[i] = new Node(i, 0);
			}

			// solve
			for (int i = 0; i < q; i++) {
				int command = in.nextInt();
				int x = in.nextInt();
				int y = in.nextInt();
				if (command == 0) {
					unite(nodes, x, y);
				} else if (command == 1) {
					out.println(check(nodes, x, y));
				}
			}


		}
	}

	static int check(Node[] nodes, int x, int y) {
		int ans = -1;
		if (findSet(nodes, x) == findSet(nodes, y)) {
			ans = 1;
		} else {
			ans = 0;
		}
		return ans;
	}

	static int findSet(Node[] nodes, int u) {
		int node = -1;
		if (nodes[u].parent != u) {
			node = findSet(nodes, nodes[u].parent);
		} else {
			node = nodes[u].parent;
		}
		return node;
	}
	static void countUp(Node[] nodes, int u) {
		while (nodes[u].parent != u) {
			nodes[u].rank++;
			u = nodes[u].parent;
		}
		nodes[u].rank++;
	}

	static void unite(Node[] nodes, int u, int v) {
		if (nodes[u].rank > nodes[v].rank) {
			countUp(nodes, u);
			nodes[findSet(nodes, u)].parent = v;
		} else if (nodes[u].rank < nodes[v].rank) {
			countUp(nodes, v);
			nodes[findSet(nodes, v)].parent = u;
		} else if (nodes[u].rank == nodes[v].rank) {
			if (u > v) {
				countUp(nodes, u);
				nodes[findSet(nodes, u)].parent = v;
			} else if (u < v) {
				countUp(nodes, v);
				nodes[findSet(nodes, v)].parent = u;
			}
		}
	}

	static class Node {
		int parent;
		int rank;
		Node(int parent, int rank) {
			this.parent = parent;
			this.rank = rank;
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

