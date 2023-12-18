import java.util.Scanner;

class Node {
	int id, key;
	Node parent, left, right;



	public Node(int id, int key) {
		super();
		this.id = id;
		this.key = key;
	}



	@Override
	public String toString() {
		String parentKey = parent == null ? "" :
			"parent key = " + Integer.toString(parent.key) + ", ";
		String leftKey = left == null ? "" :
			"left key = " + Integer.toString(left.key) + ", ";
		String rightKey = right == null ? "" :
			"right key = " + Integer.toString(right.key) + ", ";

		return "node " + id + ": key = " + key + ", " + parentKey + leftKey + rightKey;
	}
}

public class Main {
	public static Node binaryTree(Node[] btree, int p_id, int c_id) {
		if (p_id != -1) {
			btree[c_id - 1].parent = btree[p_id - 1];
		}

		if (c_id * 2 <= btree.length) {
			btree[c_id - 1].left = binaryTree(btree, c_id, c_id * 2);
		}
		if (c_id * 2 + 1 <= btree.length) {
			btree[c_id - 1].right = binaryTree(btree, c_id, c_id * 2 + 1);
		}

		return btree[c_id - 1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		Node[] btree = new Node[h];
		for (int i = 0; i < h; i++) {
			btree[i] = new Node(i + 1, sc.nextInt());
		}
		binaryTree(btree, -1, 1);
		for (int i = 0; i < h; i++) {
			System.out.println(btree[i]);
		}
	}
}
