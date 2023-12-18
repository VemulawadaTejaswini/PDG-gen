
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		new Main().run();
	}

	private void run() throws NumberFormatException, IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Node[] nodes = new Node[n];
		for (int i = 0; i < n; i++) {
			nodes[i] = new Node();
		}
		for (int i = 0; i < n; i++) {
			int v = scanner.nextInt();
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			nodes[v].left = l;
			nodes[v].right = r;
			if (l != -1)
				nodes[l].parent = v;
			if (r != -1)
				nodes[r].parent = v;
		}
		int root = 0;
		for (int i = 0; i < n; i++) {
			if (nodes[i].parent == -1) {
				root = i;
				break;
			}
		}
		setDepth(root, 0, nodes);
		setHeight(root, nodes);
		for (int i = 0; i < n; i++) {
			print(i, nodes);
		}
	}

	private void print(int u, Node[] nodes) {
		System.out.printf("node %d: parent = %d, sibling = %d, ", u,
				nodes[u].parent, getSibling(u, nodes));
		int deg = 0;
		if (nodes[u].left != -1)
			deg++;
		if (nodes[u].right != -1)
			deg++;
		System.out.printf("degree = %d, depth = %d, height = %d, ", deg,
				nodes[u].d, nodes[u].h);
		if (nodes[u].parent == -1)
			System.out.println("root");
		else if (nodes[u].left == -1 && nodes[u].right == -1)
			System.out.println("leaf");
		else
			System.out.println("internal node");
	}

	private Object getSibling(int u, Node[] nodes) {
		int p = nodes[u].parent;
		if (nodes[u].parent == -1)
			return -1;
		if (nodes[p].left != u && nodes[p].left != -1)
			return nodes[p].left;
		if (nodes[p].right != u && nodes[p].right != -1)
			return nodes[p].right;
		return -1;
	}

	private int setHeight(int u, Node[] nodes) {
		int h1 = 0;
		int h2 = 0;
		if (nodes[u].left != -1)
			h1 = setHeight(nodes[u].left, nodes) + 1;
		if (nodes[u].right != -1)
			h2 = setHeight(nodes[u].right, nodes) + 1;
		return nodes[u].h = (h1 > h2 ? h1 : h2);
	}

	private void setDepth(int u, int d, Node[] nodes) {
		if (u == -1)
			return;
		nodes[u].d = d;
		setDepth(nodes[u].left, d + 1, nodes);
		setDepth(nodes[u].right, d + 1, nodes);

	}

	class Node {
		int parent = -1;
		int left = -1;
		int right = -1;
		int d;
		int h;
	}
}