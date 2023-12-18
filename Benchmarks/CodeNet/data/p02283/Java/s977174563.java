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
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String command = br.readLine().trim();

			if (command.equals("print")) {
				print();
			} else {
				Node node = new Node();
				node.key = Integer.parseInt(command.split(" ")[1]);
				insert(node);
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

	private static void insert(Node z) {
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
		if (y == null) {
			T.add(z);
		} else if (z.key < y.key) {
			y.left = z;
		} else {
			y.right = z;
		}
	}
}