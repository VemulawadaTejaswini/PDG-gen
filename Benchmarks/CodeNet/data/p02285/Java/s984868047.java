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

	boolean find(int key, Node currentNode) {
		if (currentNode == null) {
			return false;
		}
		if (currentNode.key == key) {
			return true;
		}
		if (currentNode.key > key) {
			return find(key, currentNode.left);
		} else {
			return find(key, currentNode.right);
		}
	}

	Node findNode(int key, Node currentNode) {
		if (currentNode == null) {
			return null;
		}
		if (currentNode.key == key) {
			return currentNode;
		}
		if (currentNode.key > key) {
			return findNode(key, currentNode.left);
		} else {
			return findNode(key, currentNode.right);
		}
	}
	void deleteNode(Node z) {
		Node y = null; 
		if (z.left == null || z.right == null) {
			y = z;
		} else {
			y = getSuccesssor(z); 
		}

		Node x = null;
		if (y.left != null) {
			x = y.left;
		} else {
			x = y.right;
		}

		if (x != null) {
			x.parent = y.parent;
		}

		if (y.parent == null) {
			this.root = x;
		} else if (y == y.parent.left) {
			y.parent.left = x;
		} else {
			y.parent.right = x;
		}

		if (y != z) {
			z.key = y.key;
		}
	}
	Node getSuccesssor(Node node) {
		if (node.right != null) {
			return getMinimum(node.right);
		}
		Node parent = node.parent;
		while (parent != null && parent.right == node) {
			node = parent;
			parent = parent.parent;
		}
		return parent;
	}
	Node getMinimum(Node node) {
		while (node.left != null) {
			node = node.left;
		}
		return node;
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
			} else if (operation[0].equals("find")) {
				key = Integer.parseInt(operation[1]);
				if (tree.find(key, tree.root)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			} else if (operation[0].equals("delete")) {
				key = Integer.parseInt(operation[1]);
				tree.deleteNode(tree.findNode(key, tree.root));
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
