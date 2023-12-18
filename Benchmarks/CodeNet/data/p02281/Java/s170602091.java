import java.util.Scanner;

public class Main {

	private static Node3[] nodes;

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		nodes = new Node3[n];

		for (int i = 0; i < n; i++) {
			nodes[i] = new Node3(-1, -1, -1);
		}

		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			int left = sc.nextInt();
			int right = sc.nextInt();

			nodes[id].left = left;
			nodes[id].right = right;

			if (left != -1 && right != -1) {
				nodes[left].parent = id;
				nodes[right].parent = id;
			} else if (left != -1) {
				nodes[left].parent = id;
			} else if (right != -1) {
				nodes[right].parent = id;
			}
		}

		int root = -1;

		for (int i = 0; i < n; i++) {
			if (nodes[i].parent == -1) {
				root = i;
			}
		}

		System.out.println("Preorder");
		preorder(root);
		System.out.println("");
		System.out.println("Inorder");
		inorder(root);
		System.out.println("");
		System.out.println("Postorder");
		postorder(root);
		System.out.println("");
	}

	public static int searchMaxLeft(int u) {
		if (nodes[u].left == -1) {
			return u;
		} else {
			return searchMaxLeft(nodes[u].left);
		}
	}

	public static void preorder(int u) {

		System.out.print(" " + u);

		if (nodes[u].left != -1) {
			preorder(nodes[u].left);
		}
		if (nodes[u].right != -1) {
			preorder(nodes[u].right);
		}
	}

	public static void inorder(int u) {

		if (nodes[u].left != -1) {
			inorder(nodes[u].left);
		}

		System.out.print(" " + u);

		if (nodes[u].right != -1) {
			inorder(nodes[u].right);
		}
	}

	public static void postorder(int u) {

		if (nodes[u].left != -1) {
			postorder(nodes[u].left);
		}

		if (nodes[u].right != -1) {
			postorder(nodes[u].right);
		}

		System.out.print(" " + u);
	}
}

class Node3 {
	int parent;
	int left;
	int right;

	public Node3(int parent, int left, int right) {
		this.parent = parent;
		this.left = left;
		this.right = right;
	}

}