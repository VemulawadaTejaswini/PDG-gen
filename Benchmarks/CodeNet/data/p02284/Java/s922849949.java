
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

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-- > 0) {
			char s = scanner.next().charAt(0);
			if (s == 'i') {
				insert(scanner.nextInt());
			} else if (s == 'p') {
				inorder(root);
				System.out.println();
				preorder(root);
				System.out.println();
			} else {
				Node node = find(scanner.nextInt());
				System.out.println(node != null ? "yes" : "no");
			}
		}
	}

	private Node find(int key) {
		Node x = root;
		while (x != null && x.key != key) {
			if (x.key > key)
				x = x.left;
			else
				x = x.right;
		}
		return x;
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
			if (x.key > z.key)
				x = x.left;
			else
				x = x.right;
		}
		if (y == null)
			root = z;
		else if (y.key > z.key)
			y.left = z;
		else
			y.right = z;
	}
}