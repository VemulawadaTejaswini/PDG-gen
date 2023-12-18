import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	private class Node {
		int id;
		Node left = null, right = null;
		boolean visited = false;
		public Node(int id) {this.id = id;}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		Node root = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			String cmd = st.nextToken();
			if (cmd.equals("insert")) {
				root = insert(root, Integer.parseInt(st.nextToken()));
			} else if (cmd.equals("print")){
				inOrder(root);
				preOrder(root);
			}
		}
		reader.close();
	}

	private void preOrder(Node root) {
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node cur = stack.pop();
			System.out.print(" " + cur.id);
			cur.visited = false;
			if (cur.right != null) stack.push(cur.right);
			if (cur.left != null) stack.push(cur.left);
		}
		System.out.println();
	}

	private void inOrder(Node root) {
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node cur = stack.peek().left;
			while (cur != null && !cur.visited) {
				stack.push(cur);
				cur = cur.left;
			}
			cur = stack.pop();
			System.out.print(" " + cur.id);
			cur.visited = true;
			if (cur.right != null && !cur.right.visited) {
				stack.push(cur.right);
			}
		}
		System.out.println();
	}

	private Node insert(Node root, int id) {
		if (root == null) {
			return new Node(id);
		}
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node cur = stack.pop();
			if (id < cur.id) {
				if (cur.left == null) {
					cur.left = new Node(id);
					return root;
				}
				stack.push(cur.left);
			} else {
				if (cur.right == null) {
					cur.right = new Node(id);
					return root;
				}
				stack.push(cur.right);
			}
		}
		return null;
	}
}

