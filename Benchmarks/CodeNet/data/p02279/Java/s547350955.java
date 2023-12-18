import java.util.Scanner;

public class Main {
	final boolean DEBUG = false;

	class Node {
		Node p;
		int[] child;
		int id;
		
		Node(int id) {
			this.id = id;
		}

		public String toString() {
			String parent = "parent = " + (this.p == null ? -1 : this.p.id);
			int d = 0;
			Node p = this.p;
			while (p != null) {
				d++;
				p = p.p;
			}
			String depth  = "depth = " + d;
			String type   = this.p == null         ? "root" :
							this.child.length != 0 ? "internal node" :
													 "leaf";
			String c = "[";
			for (int i = 0; i < this.child.length; i++)
				c += this.child[i] + (i != this.child.length - 1 ? ", " : "");
			c += "]";

			return parent + ", " + depth + ", " + type + ", " + c;
		}
	}
	
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Node[] nodes = new Node[n];
		for (int i = 0; i < n; i++)
			nodes[i] = new Node(i);

		for (int i = 0; i < n; i++) {
			int id = scan.nextInt();
			int k = scan.nextInt();
			nodes[id].child = new int[k];
			for (int j = 0; j < k; j++) {
				int c = scan.nextInt();
				nodes[id].child[j] = nodes[c].id;
				nodes[c].p = nodes[id];
			}
		}
		for (int i = 0; i < n; i++)
			System.out.println("node " + i + ": " + nodes[i].toString());
	}

	public static void main(String[] args) {
		new Main().run();
	}
}

