import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	private class Node {
		int id, parent=-1, depth=0;
		int[] children = null;
		public Node(int id) {
			this.id = id;
		}
		public Node(int id, int noOfChildren) {
			this.id = id;
			children = new int[noOfChildren];
		}
		public void setNoOfChildren(int noOfChildren) {
			children = new int[noOfChildren];
		}
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("node " + id + ": ");
			sb.append("parent = " + parent + ", ");
			sb.append("depth = " + depth + ", ");
			if (parent == -1) {
				sb.append("root");
			} else if (children == null || children.length == 0) {
				sb.append("leaf");
			} else {
				sb.append("internal node");
			}
			sb.append(", ");
			sb.append("[");
			if (children != null && children.length != 0) {
				for (int i = 0; i < children.length; i++) {
					sb.append(children[i]);
					if (i != children.length - 1) {
						sb.append(", ");
					}
				}
			}
			sb.append("]");
			return sb.toString();
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Node[] nodes = new Node[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int id = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			if (nodes[id] == null) {
				nodes[id] = new Node(id, k);
			} else {
				nodes[id].setNoOfChildren(k);
			}
			for (int j = 0; j < k; j++) {
				int childId = Integer.parseInt(st.nextToken());
				nodes[id].children[j] = childId;
				if (nodes[childId] == null) {
					nodes[childId] = new Node(childId);
				}
				nodes[childId].parent = id;
			}
		}
		reader.close();
		
		int rootId = -1;
		for (int i = 0; i < n; i++) {
			if (nodes[i].parent == -1) {
				rootId = nodes[i].id;
				break;
			}
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(rootId);
		while (!stack.isEmpty()) {
			Node current = nodes[stack.pop()];
			for (int i = 0; i < current.children.length; i++) {
				int childId = current.children[i];
				nodes[childId].depth = current.depth + 1;
				stack.push(childId);
			}
		}
 		
		for (int i = 0; i < n; i++) {
			System.out.println(nodes[i]);
		}
	}
}
