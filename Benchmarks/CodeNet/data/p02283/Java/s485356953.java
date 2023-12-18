import java.util.Scanner;

class Main {
	static Node node;
	static Node root;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ins;
		for (int i = 0; i < n; i++) {
			ins = sc.next();
			if (ins.equals("print")) {
				inorder(root);
				System.out.println();
				preorder(root);
				System.out.println();
			} else if (ins.equals("insert")) {
				Node z = new Node();
				z.key = sc.nextInt();
				insert(z);
			}

		}
	}
	static void inorder(Node node) {
		if (node == null) return;
		inorder(node.l);
		System.out.print(" " + node.key);
		inorder(node.r);
	}

	static void preorder(Node node) {
		if (node == null) return;
		System.out.print(" " + node.key);
		preorder(node.l);
		preorder(node.r);
	}

	static void insert(Node z) {
		if (root == null) {
			root = z;
			return;
		}
		Node y = null;
		Node x = root;
		while (x != null) {
			y = x;
			if (z.key < x.key) x = x.l;
			else x = x.r;
		}

		if (z.key < y.key) y.l = z;
		else y.r = z;
	}
}

class Node {
	int key;
	Node l;
	Node r;
	Node() {
		key = -1;
		l = null;
		r = null;
	}
}