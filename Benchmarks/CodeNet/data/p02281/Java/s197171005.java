
import java.util.*;

class Node {
	public int id, degree, depth, height;
	public Node parent, sibling, left, right;
	Node(int id) {
		this.id = id;
		this.degree = 0;
		this.depth = 0;
		this.height = 0;
	}
	void setLeft(Node node) {
		left = node;
		left.parent = this;
		degree++;
	}
	void setRight(Node node) {
		right = node;
		right.parent = this;
		degree++;
	}
	/*
	void setSibling() {
		if (left != null && right != null) {
			left.sibling = right;
			right.sibling = left;
		}
	}
	void setDepth(int depth) {
		this.depth = depth;
		if (left != null) left.setDepth(depth + 1);
		if (right != null) right.setDepth(depth + 1);
	}
	void setHeight(int height) {
		if (height >= this.height) {
			this.height = height;
		}
		if (parent != null) parent.setHeight(this.height + 1);
	}
	*/
}

public class Main {
	public static void preorder(Node node, StringBuilder sb) {
		sb.append(" ").append(node.id);
		if (node.left != null) preorder(node.left, sb);
		if (node.right != null) preorder(node.right, sb);
	}
	public static void inorder(Node node, StringBuilder sb) {
		if (node.left != null) inorder(node.left, sb);
		sb.append(" ").append(node.id);
		if (node.right != null) inorder(node.right, sb);
	}
	public static void postorder(Node node, StringBuilder sb) {
		if (node.left != null) postorder(node.left, sb);
		if (node.right != null) postorder(node.right, sb);
		sb.append(" ").append(node.id);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Node[] tree = new Node[n];
		for (int i = 0; i < n; i++) {
			tree[i] = new Node(i);
		}
		for (int i = 0; i < n; i++) {
			Node node = tree[scanner.nextInt()];
			int left = scanner.nextInt();
			if (left != -1) node.setLeft(tree[left]);
			int right = scanner.nextInt();
			if (right != -1) node.setRight(tree[right]);
			//node.setSibling();
		}
		Node root = null;
		for (int i = 0; i < n; i++) {
			if (tree[i].parent == null) {	
				root = tree[i];
				break;
			}
		}
		/*
		root.setDepth(0);
		for (int i = 0; i < n; i++) {
			tree[i].setHeight(0);
		}
		*/
		StringBuilder sb = new StringBuilder();
		System.out.println("Preorder");
		preorder(root, sb);
		System.out.println(sb);
		sb.setLength(0);
		System.out.println("Inorder");
		inorder(root, sb);
		System.out.println(sb);
		sb.setLength(0);
		System.out.println("Postorder");
		postorder(root, sb);
		System.out.println(sb);
	}
}