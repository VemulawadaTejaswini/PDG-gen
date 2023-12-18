import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader( new InputStreamReader(System.in) );

		int m = Integer.parseInt(br.readLine());

		Node t = new Node(0);
		for (int i=0; i < m; i++) {
			String[] command = br.readLine().split(" ");

			switch (command[0]) {
			case "insert":
				int k = Integer.parseInt(command[1]);
				insert(t,k);
				break;

			case "find":
				int kk = Integer.parseInt(command[1]);
				if ( find(t,kk) ) System.out.println("yes");
				else System.out.println("no");
				break;

			case "print":
				inorder(t.left);
				System.out.println();
				preorder(t.left);
				System.out.println();
			}
		}
	}

	public static class Node {
		int key;
		Node parent;
		Node left;
		Node right;

		public Node(int key) {
			this.key = key;
		}
	}

	public static void preorder(Node x) {
		System.out.print(" " + x.key);

		if (x.left != null) preorder(x.left);

		if (x.right != null) preorder(x.right);
	}

	public static void inorder(Node x) {
		if (x.left != null) inorder(x.left);

		System.out.print(" " + x.key);

		if (x.right != null) inorder(x.right);
	}

	// t.left = t.right = Tree???root ??¨?????????????????????
	public static void insert(Node t, int k) {
		//Tree t??????????????°x???null
		//Tree t???node????????¨??????????????°x???t???root
		Node x = t.left;

		// Tree t???node??????????????´???
		if (x == null) {
			Node root = new Node(k);
			t.left = t.right = root;
			return;
		}

		// Tree t???root??\???????????¨????????´???
		while (true) {
			if (k < x.key) {
				if (x.left != null) {
					x = x.left;
				} else {
					x.left = new Node(k);
					x.left.parent = x;
					break;
				}
			} else { // x.key <= k
				if (x.right != null) {
					x = x.right;
				} else {
					x.right = new Node(k);
					x.right.parent = x;
					break;
				}
			}
		}
	}

	public static boolean find(Node t, int k) {
		if (t.left == null) return false;

		Node x = t.left; // Tree t???root
		while (x != null) {
			if (k == x.key) {
				return true;
			} else if (k < x.key) {
				x = x.left;
			} else {
				x = x.right;
			}
		}
		return false;
	}
}