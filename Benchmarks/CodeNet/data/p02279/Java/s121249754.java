import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static class Node {		
		int id, parentId, depth;
		int[] children;
		public Node(int id, int parentId) {
			this.id = id;
			this.parentId = parentId;
			this.depth = 0;
			this.children = null;
		}
		private String getType() {
			if (depth == 0) {
				return "root";
			}
			if (children == null || children.length == 0) {
				return "leaf";
			}
			return "internal node";
		}
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("node " + id + ": ");
			sb.append("parent = " + parentId + ", ");
			sb.append("depth = " + depth + ", ");
			sb.append(getType() + ", ");
			sb.append(Arrays.toString(children));
			return sb.toString();
		}
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Node[] nodes = new Node[n];

		for (int i = 0; i < n; i++) {		
			StringTokenizer st = new StringTokenizer(reader.readLine());			
			int id = Integer.parseInt(st.nextToken());
			if (nodes[id] == null) {
				nodes[id] = new Node(id, -1);
			}
			if (nodes[id].parentId != -1) {
				nodes[id].depth = nodes[nodes[id].parentId].depth + 1;
			}

			int m = Integer.parseInt(st.nextToken());
			int[] children = new int[m];
			for (int j = 0; j < m; j++) {
				int childId = Integer.parseInt(st.nextToken());
				children[j] = childId;
				if (nodes[childId] == null) {
					nodes[childId] = new Node(childId, id);
				} else {
					nodes[childId].parentId = id;
				}
				nodes[childId].depth = nodes[id].depth + 1;
			}
			nodes[id].children = children;
		}

		for (Node node : nodes) {
			System.out.println(node);
		}
	}
}
