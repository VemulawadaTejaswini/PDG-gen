

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();// the number of nodes
		Rooted_tree rt = new Rooted_tree(n);
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			int k = sc.nextInt();
			int l = -1;
			for (int j = 0; j < k; j++) {
				if (j == 0) {
					rt.T[id].left = sc.nextInt();
					l = rt.T[id].left;
					rt.T[l].parent = id;
				} else {
					rt.T[l].right = sc.nextInt();
					l = rt.T[l].right;
					rt.T[l].parent = id;
				}
			}
		}
		int root = -1;
		for (int i = 0; i < n; i++) {
			if (rt.T[i].parent == -1)
				root = i;
		}
		rt.setDepth(root, 0);
		for (int i = 0; i < n; i++) {
			System.out.print("node " + i + ": parent = " + rt.T[i].parent + ", depth = " + rt.D[i] + ", ");
			if (rt.T[i].parent == -1)
				System.out.print("root,");
			else if (rt.T[i].left == -1)
				System.out.print("leaf,");
			else
				System.out.print("internal node,");
			System.out.print(" [");
			int u = rt.T[i].left;
			while (u != -1) {
				System.out.print(u);
				u = rt.T[u].right;
				if (u != -1) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}
	}

	class Rooted_tree {
		int NIL = -1;
		Node[] T;
		int[] D;

		// n is the number of vertex
		Rooted_tree(int n) {
			T = new Node[n];
			for (int i = 0; i < n; i++) {
				T[i] = new Node();
			}
			D = new int[n];
		}

		// ????????\????????±???????±??????????
		int getDepth(int u) {
			int d = 0;
			while (T[u].parent != NIL) {
				u = T[u].parent;
				d++;
			}
			return d;
		}

		// ??¨?????¨????????\????????±???????±??????????
		// u???root
		void setDepth(int u, int p) {
			D[u] = p;
			if (T[u].right != NIL) {
				setDepth(T[u].right, p);
			}
			if (T[u].left != NIL) {
				setDepth(T[u].left, p + 1);
			}
		}

		// ????????????????????¨??????
		void printChildren(int u) {
			int c = T[u].left;
			while (c != NIL) {
				System.out.println(c);
				c = T[c].right;
			}
		}

		class Node {
			int parent = NIL, left = NIL, right = NIL;

			Node() {
			}

			Node(int parent, int left, int right) {
				this.parent = parent;
				this.left = left;
				this.right = right;
			}
		}
	}
}