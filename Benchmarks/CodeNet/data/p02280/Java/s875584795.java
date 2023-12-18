
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.InputMismatchException;
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
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int n = in.nextInt();
			int[] degrees = new int[n];
			int[] depths = new int[n];
			int[] heights = new int[n];
			String[] types = new String[n];


			// make tree
			Node pNode = new Node(in.nextInt());
			pNode.left = new Node(in.nextInt());
			pNode.left.parent = pNode;
			pNode.right = new Node(in.nextInt());
			pNode.right.parent = pNode;

			for (int i = 1; i < n; i++) {
				int tNode = in.nextInt();
				int left = in.nextInt();
				int right = in.nextInt();
				Node tn = bfs(pNode, tNode);

				if (left != -1) {
					tn.left = new Node(left);
					tn.left.parent = tn;
				}
				if (right != -1) {
					tn.right = new Node(right);
					tn.right.parent = tn;
				}
			}

			// dgree depth type
			for (int i = 0; i < n; i++) {
				Node tn = bfs(pNode, i);
				int degree = tn.degree();
				String type = tn.type();
				int depth = 0;

				while (tn.parent != null) {
					tn = tn.parent;
					depth++;
				}
				degrees[i] = degree;
				depths[i] = depth;
				types[i] = type;
			}

			// height
			for (int i = 0; i < n; i++) {
				Deque<Node> stack = new ArrayDeque<>();
				Node targetNode = bfs(pNode, i);
				stack.add(targetNode);
				boolean[] visited = new boolean[n];

				int height = 0;
				int tmpHeight = 0;
				while (!stack.isEmpty()) {
					Node node = stack.peek();
					if (node.left != null && !visited[node.left.num]) {
						stack.push(node.left);
						visited[node.left.num] = true;
						tmpHeight++;
						continue;
					}
					if (node.right != null && !visited[node.right.num]) {
						stack.push(node.right);
						visited[node.right.num] = true;
						tmpHeight++;
						continue;
					}
					stack.pop();
					height = Math.max(height, tmpHeight);
					tmpHeight--;
				}
				heights[i] = height;
			}

			// print
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < n; i++) {
				Node node = bfs(pNode, i);
				sb.append("node ").append(i).append(": parent = ");
				sb.append(node.parent()).append(", sibling = ").append(node.sibling());
				sb.append(", degree = ").append(degrees[i]).append(", depth = ");
				sb.append(depths[i]).append(", height = ").append(heights[i]);
				sb.append(", ").append(types[i]);
				if (i == n - 1) {
					continue;
				}
				sb.append("\n");
			}
			out.println(sb.toString());

		}
	}

	static class Node {
		int num;
		Node parent;
		Node left;
		Node right;
		Node (int num) {
			this.num = num;
		}
		int degree() {
			int count = 0;
			if (left != null) {
				count++;
			}
			if (right != null) {
				count++;
			}
			return count;
		}
		String type() {
			String type = null;
			if (parent == null) {
				type = "root";
			} else if (left != null || right != null) {
				type = "internal node";
			} else {
				type = "leaf";
			}
			return type;
		}
		int sibling() {
			int k = -1;
			if (parent != null) {
				if (parent.left.num != this.num) {
					k = parent.left.num;
				} else if (parent.right.num != this.num) {
					k = parent.right.num;
				}
			}
			return k;
		}
		int parent() {
			int k = -1;
			if (parent != null) {
				k = parent.num;
			}
			return k;
		}
	}
	static Node bfs(Node pNode, int targetNum) {

		Queue<Node> q = new ArrayDeque<>();
		q.add(pNode);

		while (!q.isEmpty()) {
			Node node = q.remove();
			if (node.num == targetNum) {
				return node;
			}
			if (node.left != null) {
				q.add(node.left);
			}
			if (node.right != null) {
				q.add(node.right);
			}
		}

		return null;
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

