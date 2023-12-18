import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	private static List<Node> T = new ArrayList<Main.Node>();

	private static class Node {
		public int id;
		public int parent = -1;
		public int depth = 0;
		public List<Integer> children;

		@Override
		public String toString() {
			String type = "";
			if (parent == -1) {
				type = "root";
			}
			else if (children.size() == 0) {
				type = "leaf";
			}
			else {
				type = "internal node";
			}

			StringBuilder childrenStr = new StringBuilder();
			for (int id : children) {
				if (childrenStr.length() > 0) {
					childrenStr.append(", ");
				}
				childrenStr.append(id);
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append("node ").append(id);
			sb.append(": parent = ").append(parent);
			sb.append(", depth = ").append(depth);
			sb.append(", ").append(type);
			sb.append(", [").append(childrenStr.toString()).append("]");
			return sb.toString();
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			createTree(br.readLine());
		}
		Collections.sort(T, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				return o1.id - o2.id;
			}
		});

		updateTree();

		for (Node n : T) {
			System.out.println(n);
		}

		if (br != null) {
			br.close();
			br = null;
		}
	}

	private static void createTree(String line) {
		String[] u = line.split(" ");
		int id = Integer.parseInt(u[0]);
		int k = Integer.parseInt(u[1]);
		List<Integer> c = new ArrayList<Integer>();
		for (int j = 0; j < k; j++) {
			c.add(Integer.parseInt(u[2 + j]));
		}

		Node node = new Node();
		node.id = id;
		node.children = c;
		T.add(node);
	}

	private static void updateTree() {
		for (Node node : T) {
			for (int id : node.children) {
				updateChildren(id, node.id);
			}
		}
	}

	private static void updateChildren(int cid, int pid) {
		Node key = new Node();
		key.id = cid;
		int idx = Collections.binarySearch(T, key, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				return o1.id - o2.id;
			}
		});
		Node node = T.get(idx);
		node.parent = pid;
		node.depth++;
		for (int id : node.children) {
			updateChildren(id, cid);
		}
	}
}