import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private static List<Node> T = new ArrayList<Main.Node>();

	private static class Node {
		public int key;
		public Node left;
		public Node right;
		public Node parent;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String command = br.readLine().trim();

			if (command.equals("print")) {
				print();
			} else if (command.startsWith("insert")) {
				insert(Integer.parseInt(command.split(" ")[1]));
			} else if (command.startsWith("find")) {
				find(Integer.parseInt(command.split(" ")[1]));
			} else if (command.startsWith("delete")) {
				delete(Integer.parseInt(command.split(" ")[1]));
			}
		}

		if (br != null) {
			br.close();
			br = null;
		}
	}

	private static void print() {
		Node root = T.size() == 0 ? null : T.get(0);

		List<Integer> tmp = new ArrayList<Integer>();
		inorder(root, tmp);
		for (int i : tmp) {
			System.out.print(" " + i);
		}
		System.out.println();

		tmp = new ArrayList<Integer>();
		preorder(root, tmp);
		for (int i : tmp) {
			System.out.print(" " + i);
		}
		System.out.println();
	}

	private static void inorder(Node node, List<Integer> ret) {
		if (node == null) {
			return;
		}

		inorder(node.left, ret);
		ret.add(node.key);
		inorder(node.right, ret);
	}

	private static void preorder(Node node, List<Integer> ret) {
		if (node == null) {
			return;
		}

		ret.add(node.key);
		preorder(node.left, ret);
		preorder(node.right, ret);
	}

	private static void insert(int key) {
		Node z = new Node();
		z.key = key;

		Node y = null;
		Node x = T.size() == 0 ? null : T.get(0);
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
			T.add(z);
		} else if (z.key < y.key) {
			y.left = z;
		} else {
			y.right = z;
		}
	}

	private static void find(int key) {
		Node root = T.size() == 0 ? null : T.get(0);
		System.out.println(find(root, key) != null ? "yes" : "no");
	}

	private static Node find(Node node, int key) {
		if (node == null) {
			return null;
		}

		if (node.key == key) {
			return node;
		} else if (node.key > key) {
			return find(node.left, key);
		} else {
			return find(node.right, key);
		}
	}

	private static void delete(int key) {
		Node root = T.size() == 0 ? null : T.get(0);
		Node z = find(root, key);

		Node y;
		if (z.left == null || z.right == null) {
			y = z;
		} else {
			y = successor(z);
		}

		Node x;
		if (y.left != null) {
			x = y.left;
		} else {
			x = y.right;
		}

		if (x != null) {
			x.parent = y.parent;
		}
		if (y.parent == null) {
			T.set(0, x);
		} else if (y.key == y.parent.left.key) {
			y.parent.left = x;
		} else {
			y.parent.right = x;
		}

		if (y.key != z.key) {
			z.key = y.key;
		}
	}

	private static Node successor(Node x) {
		if (x.right != null) {
			return minimum(x.right);
		}
		Node y = x.parent;
		while (y != null && x.key == y.right.key) {
			x = y;
			y = y.parent;
		}
		return y;
	}

	private static Node minimum(Node x) {
		while (x.left != null)
			x = x.left;
		return x;
	}
}