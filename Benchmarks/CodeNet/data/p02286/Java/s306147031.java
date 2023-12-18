import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
	int key, priority;
	Node parent, left, right;

	public Node(int key, int priority) {
		super();
		this.key = key;
		this.priority = priority;
	}

}

class Tree {
	Node root;

	Node rightRotate(Node t) {
		Node s = t.left;
		t.left = s.right;
		s.right = t;
		if (t == this.root) {
			this.root = s;
		}
		return s;
	}

	Node leftRotate(Node t) {
		Node s = t.right;
		t.right = s.left;
		s.left = t;
		if (t == this.root) {
			this.root = s;
		}
		return s;
	}

	Node insert(Node t, int key, int priority) {
		if (this.root == null) {
			this.root = new Node(key, priority);
			return t;
		}
		if (t == null) {
			return new Node(key, priority);
		}
		if (key == t.key) {
			return t;
		}

		if (key < t.key) {
			t.left = insert(t.left, key, priority);
			if (t.priority < t.left.priority) {
				t = rightRotate(t);
			}
		} else {
			t.right = insert(t.right, key, priority);
			if (t.priority < t.right.priority) {
				t = leftRotate(t);
			}
		}
		return t;

	}


	Node delete(Node t, int key) {
		if (t == null) {
			return null;
		}
		if (key < t.key) {
			t.left = delete(t.left, key);
		} else if(key > t.key) {
			 t.right = delete(t.right, key);
		} else {
			return _delete(t, key);
		}

		return t;
	}

	Node _delete(Node t, int key) {
		if (t.left == null && t.right == null) {
			return null;
		} else if (t.left == null) {
			t = leftRotate(t);
		} else if (t.right == null) {
			t = rightRotate(t);
		} else {
			if (t.left.priority > t.right.priority) {
				t = rightRotate(t);
			} else {
				t = leftRotate(t);
			}
		}

		return delete(t, key);
	}

	boolean find(Node t, int key) {
		if (t == null) {
			return false;
		}
		if (key < t.key) {
			return find(t.left, key);
		} else if (key > t.key) {
			return find(t.right, key);
		} else {
			return true;
		}
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
		int key, priority;
		Tree tree = new Tree();
		sb = new StringBuilder();

		for (int i = 0; i < m; i++) {
			operation = br.readLine().split(" ");
			if (operation[0].equals("insert")) {
				key = Integer.parseInt(operation[1]);
				priority = Integer.parseInt(operation[2]);
				tree.insert(tree.root, key, priority);
			} else if (operation[0].equals("find")) {
				key = Integer.parseInt(operation[1]);
				if (tree.find(tree.root, key)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			} else if (operation[0].equals("delete")) {
				key = Integer.parseInt(operation[1]);
				tree.delete(tree.root, key);
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
