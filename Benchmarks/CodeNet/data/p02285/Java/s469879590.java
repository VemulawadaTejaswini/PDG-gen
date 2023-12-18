import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		new BinSearchTree1().run();
	}
}

class BinSearchTree1 {

	Node root;

	public void run() {

		root = null;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int m = Integer.parseInt(br.readLine());
			for (int i = 0; i < m; i++) {

				String line = br.readLine();

				if(line.charAt(0) == 'i') {

					int val = Integer.parseInt(line.substring(7));
					insert(val);

				} else if (line.charAt(0) == 'f') {
					int val = Integer.parseInt(line.substring(5));
					Node result = find(val);
					if (result != null) {
						System.out.println("yes");
					} else {
						System.out.println("no");
					}

				} else if (line.charAt(0) == 'd') {

					int val = Integer.parseInt(line.substring(7));
					delete(val);

				} else {
					print();
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void delete(int val) {
		Node tgt = find(val);

		if (tgt == null) return;

		Node del;
		if ( tgt.left == null || tgt.right == null) {
			del = tgt;
		} else {
			del = getSuccessor(tgt);
		}

		// del??????x????±???????
		Node x;
		if ( del.left != null) {
			x = del.left;
		} else {
			x = del.right;
		}

		if ( x != null ) {
			x.parent = del.parent;
		}

		if (del.parent == null) {
			root = x;		// del ???????????¨??????x????????¨??????
		} else if ( del == del.parent.left ) {
			del.parent.left = x;
		} else {
			del.parent.right = x;
		}

		if ( del != tgt ) {
			tgt.key = del.key;
		}

	}

	private Node getSuccessor(Node tgt) {
		if (tgt.right != null) {
			return getMinimun(tgt.right);
		}

		Node y = tgt.parent;
		while (y != null && tgt == y.right) {
			tgt = y;
			y = tgt.parent;
		}

		return y;
	}

	private Node getMinimun(Node tgt) {
		while (tgt.left != null) {
			tgt = tgt.left;
		}
		return tgt;
	}

	private Node find(int tgt) {

		Node now = root;

		while ( now != null ) {
			if (now.key == tgt) {

				break;

			} else {
				if (tgt < now.key) {
					now = now.left;
				} else {
					now = now.right;
				}
			}
		}

		return now;

	}

	private void insert(int val) {

		Node y = null;
		Node x = root;

		Node z = new Node();
		z.key = val;
		z.left = null;
		z.right = null;

		while (x != null) {
			y = x;
			if (val < x.key) {
				x = x.left;
			} else {
				x = x.right;
			}
		}
		z.parent = y;

		if (y == null) {
			root = z;
		} else {
			if (val < y.key) {
				y.left = z;
			} else {
				y.right = z;
			}
		}
	}

	private void print() {

		pByInOrder(root);
		System.out.println();
		pByPreOrder(root);
		System.out.println();

	}

	private void pByInOrder(Node node) {

		if(node == null) return;

		pByInOrder(node.left);
		System.out.print(" " + node.key);
		pByInOrder(node.right);

	}

	private void pByPreOrder(Node node) {

		if(node == null) return;

		System.out.print(" " + node.key);
		pByPreOrder(node.left);
		pByPreOrder(node.right);

	}

}

class Node {

	int key;
	Node left, right, parent;

}