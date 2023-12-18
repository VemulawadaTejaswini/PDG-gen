import java.util.Scanner;

class Node {

	int id, left, right, parent;

	public Node(int id, int left, int right) {
		super();
		this.id = id;
		this.left = left;
		this.right = right;
	}


}

public class Main {

	static StringBuilder sb;

	public static void setNode(Node[] nodes, int id, int parent) {
		Node node = nodes[id];
		node.parent = parent;
		if (node.left != -1) {
			setNode(nodes, node.left, node.id);
		}
		if (node.right != -1) {
			setNode(nodes, node.right, node.id);
		}
	}

	public static void preorder(Node[] nodes, int id) {
		Node node = nodes[id];
		sb.append(" " + id );
		int left = node.left, right = node.right;
		if (left != -1) {
			preorder(nodes, left);
		}
		if (right != -1) {
			preorder(nodes, right);
		}
	}

	public static void inorder(Node[] nodes, int id) {
		Node node = nodes[id];
		int left = node.left, right = node.right;

		if (left != -1) {
			inorder(nodes, left);
		}
		sb.append(" " + id);
		if (right != -1) {
			inorder(nodes, right);
		}

	}

	public static void postorder(Node[] nodes, int id) {
		Node node = nodes[id];
		int left = node.left, right = node.right;

		if (left != -1) {
			postorder(nodes, left);
		}
		if (right != -1) {
			postorder(nodes, right);
		}
		sb.append(" " + id);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Node[] nodes = new Node[n];
		int[] rootNode = new int[n];
		sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			int id = sc.nextInt(), left = sc.nextInt(), right = sc.nextInt();

			nodes[id] = new Node(id, left, right);

			if (left != -1) {
				rootNode[left] = 1;
			}
			if (right != -1) {
				rootNode[right] = 1;
			}
		}

		int root = 0;
		for (int i = 0; i < n; i++) {
			if (rootNode[i] == 0) {
				root = i;
			}
		}

		setNode(nodes, root, -1);


		sb.append("Preorder\n");
		preorder(nodes, root);
		sb.append("\n");


		sb.append("Inorder\n");
		inorder(nodes, root);
		sb.append("\n");

		sb.append("Postorder\n");
		postorder(nodes, root);


		System.out.println(sb.toString());
	}
}
