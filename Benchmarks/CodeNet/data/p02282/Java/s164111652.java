import java.util.Scanner;

class Node {
	int id;
	Node left, right;

	public Node(int id) {
		super();
		this.id = id;
	}

}

public class Main {

	static Node[] preorder, inorder;
	static int pre;
	static StringBuilder sb;

	public static int nextPre() {
		return preorder[pre++].id;
	}

	public static int find(int c, Node[] inorder, int l, int r) {
		for (int i = l; i < r; i++) {
			if (c == inorder[i].id) {
				return i;
			}
		}
		return -1;
	}

	public static void reconstruction(int l, int r, Node[] inorder) {
		if (l >= r) {
			return;
		}

		int c = nextPre();
		int m = find(c, inorder, l, r);

		reconstruction(l, m, inorder);
		reconstruction(m + 1, r, inorder);

		sb.append(c + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		preorder = new Node[n]; inorder = new Node[n];

		for (int i = 0; i < n; i++) {
			preorder[i] = new Node(sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			inorder[i] = new Node(sc.nextInt());
		}

		sb = new StringBuilder();
		reconstruction(0, n, inorder);
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
