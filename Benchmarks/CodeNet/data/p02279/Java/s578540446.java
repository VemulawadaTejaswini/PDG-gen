
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		new Main().run();
	}

	private void run() throws NumberFormatException, IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Node[] node = new Node[n];
		for (int i = 0; i < n; i++) {
			node[i] = new Node();
		}
		int l = -1;
		int x = n;
		while (x-- > 0) {
			int v = scanner.nextInt();
			int s = scanner.nextInt();
			for (int i = 0; i < s; i++) {
				int c = scanner.nextInt();
				if (i == 0)
					node[v].l = c;
				else
					node[l].r = c;
				l = c;
				node[c].p = v;
			}
		}
		int r = -1;
		for (int i = 0; i < n; i++) {
			if (node[i].p == -1) {
				r = i;
				break;
			}
		}
		rec(r, 0, node);
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n; i++) {
			print(i, node, builder);
		}
		System.out.print(builder);
	}

	private void print(int u, Node[] T, StringBuilder builder) {
		builder.append("node ").append(u).append(": parent = ").append(T[u].p)
				.append(", depth = ").append(T[u].d).append(", ");
		if (T[u].p == -1)
			builder.append("root, ");
		else if (T[u].l == -1)
			builder.append("leaf, ");
		else
			builder.append("internal node, ");
		builder.append("[");
		boolean flag = false;
		int c = T[u].l;
		while (c != -1) {
			if (flag)
				builder.append(", ");
			builder.append(c);
			c = T[c].r;
			flag = true;
		}
		builder.append("]\n");
	}

	private void rec(int u, int p, Node[] T) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.offer(u);
		while (!deque.isEmpty()) {
			int t = deque.size();
			for (int i = 0; i < t; i++) {
				int c = deque.poll();
				T[c].d = p;
				if (T[c].l != -1) {
					c = T[c].l;
					while (c != -1) {
						deque.offer(c);
						c = T[c].r;
					}
				}
			}
			p++;
		}
	}

	class Node {
		int p = -1;
		int l = -1;
		int r = -1;
		int d;
	}
}