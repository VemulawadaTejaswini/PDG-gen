import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (sc.hasNext()) {
			char query = sc.next().charAt(0);
			String tree1 = sc.next();
			String tree2 = sc.next();
			Node root = new Node();
			parse(tree1, 0, root, 1);
			parse(tree2, 0, root, 2);
			root.write(query == 'u');
			System.out.println();
		}
	}

	static int parse(String tree, int pos, Node cur, int val) {
		cur.val += val;
		++pos;
		if (tree.charAt(pos) == '(') {
			if (cur.left == null) {
				cur.left = new Node();
			}
			pos = parse(tree, pos, cur.left, val);
		}
		++pos;
		if (tree.charAt(pos) == '(') {
			if (cur.right == null) {
				cur.right = new Node();
			}
			pos = parse(tree, pos, cur.right, val);
		}
		return pos + 1;
	}

	static class Node {
		Node left;
		Node right;
		int val = 0;

		boolean match(boolean union) {
			if (union) {
				return this.val > 0;
			} else {
				return this.val == 3;
			}
		}

		void write(boolean union) {
			if (!match(union)) return;
			System.out.print("(");
			if (this.left != null) this.left.write(union);
			System.out.print(",");
			if (this.right != null) this.right.write(union);
			System.out.print(")");
		}
	}
}