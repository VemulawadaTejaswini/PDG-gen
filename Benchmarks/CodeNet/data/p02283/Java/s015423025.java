import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
	int key;
	Node parent, left, right;

	public Node(int key) {
		super();
		this.key = key;
	}

}

class Tree {
	Node root;



	void insert(Node z) {
		Node y = null; // parent of x
		Node x = this.root; // the root of Tree

		while (x != null) {
			y = x;
			if (z.key < x.key) {
				x = x.left;
			} else {
				x = x.right;
			}
		}
		z.parent = y;

		if (y == null) {
			this.root = z;
		} else {
			if (z.key < y.key) {
				y.left = z;
			} else {
				y.right = z;
			}
		}
	}


}

public class Main {

	static StringBuilder sb;

	public static void printPreOrder(Node node) {
		if (node == null) {
			return;
		}

		sb.append(" " + node.key);
		printPreOrder(node.left);
		printPreOrder(node.right);
	}

	public static void printInOrder(Node node) {
		if (node == null) {
			return;
		}

		printInOrder(node.left);
		sb.append(" " + node.key);
		printInOrder(node.right);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int m = Integer.parseInt(br.readLine());
		String[] operation;
		int key;
		Tree tree = new Tree();
		sb = new StringBuilder();

		for (int i = 0; i < m; i++) {
			operation = br.readLine().split(" ");
			if (operation[0].equals("insert")) {
				key = Integer.parseInt(operation[1]);
				tree.insert(new Node(key));
			} else {
				printInOrder(tree.root);
				sb.append("\n");
				printPreOrder(tree.root);
				System.out.println(sb.toString());
				sb.setLength(0);
			}
		}
	}
}
