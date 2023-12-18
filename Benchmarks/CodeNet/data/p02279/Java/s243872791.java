import java.util.Scanner;

public class Main {
	final boolean DEBUG = false;

	class Node {
		Node p;
		Node[] child;
		int id, depth;
		
		Node(int id) {
			this.id = id;
		}
		Node(int id, int k, int[] c, Node p) {
			if (DEBUG)
				System.out.println("make node:" + id);
			this.id = id;
			this.p = p;
			this.depth = (p == null ? 0 : p.depth + 1);
			this.setNode(k, c);
		}
		Node(int id, Node p) {
			this.id = id;
			this.p = p;
			this.depth = p.depth + 1;
		}
		
		Node getNode(int id) {
			if (this.id == id)
				return this;
			if (this.child == null)
				return null;

			for (int i = 0; i < this.child.length; i++) {
				Node node = this.child[i].getNode(id);
				if (node != null)
					return node;
			}
			return null;
		}

		void setNode(int k, int[] c) {
			if (DEBUG) {
				System.out.println("set id: " + id);
			}
			this.child = new Node[k];
			for (int i = 0; i < k; i++) {
				System.out.println(c[i]);
				child[i] = new Node(c[i], this);
				if (DEBUG)
					System.out.println("make child:" + c[i]);
			}
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
				c += this.child[i].id + (i != this.child.length - 1 ? ", " : "");
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
			nodes[id].child = new Node[k];
			for (int j = 0; j < k; j++) {
				int c = scan.nextInt();
				nodes[id].child[j] = nodes[c];
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

