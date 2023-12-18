
import java.io.IOException;
import java.util.Scanner;

public class Main {
	class Node {
		int key;
		Node left;
		Node right;

		public Node(int key) {
			this.key = key;
		}

	}

	Node root;

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		new Main().run();
	}

	private void run() throws NumberFormatException, IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			String s = scanner.next();
			if (s.startsWith("i")) {
				insert(scanner.nextInt());
			} else {
				inorder(root);
				System.out.println();
				preorder(root);
				System.out.println();
			}
		}
	}

	private void preorder(Node u) {
		if (u == null)
			return;
		System.out.print(" " + u.key);
		preorder(u.left);
		preorder(u.right);
	}

	private void inorder(Node u) {
		if (u == null)
			return;
		inorder(u.left);
		System.out.print(" " + u.key);
		inorder(u.right);
	}

	private void insert(int key) {
		Node y = null;
		Node x = root;
		Node z = new Node(key);
		while (x != null) {
			y = x;
			if (z.key < y.key) {
				x = x.left;
			} else {
				x = x.right;
			}
		}
		if (y == null) {
			root = z;
		} else if (z.key < y.key) {
			y.left = z;
		} else {
			y.right = z;
		}
	}
}