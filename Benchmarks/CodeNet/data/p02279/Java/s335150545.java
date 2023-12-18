import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader( new InputStreamReader(System.in) );

		int n = Integer.parseInt(br.readLine());

		Node[] u = new Node[n];
		for (int i=0; i < n; i++) {
			u[i] = new Node(i);
		}

		for (int i=0; i < n; i++) {
			String[] data = br.readLine().split(" ");

			int id = Integer.parseInt(data[0]);
			u[id].id = id;

			int k = Integer.parseInt(data[1]);
			u[id].degree = k;

			u[id].childs = new Node[k];
			for (int j=0; j < k; j++) {
				int cj = Integer.parseInt(data[j+2]);
				u[cj].ischild = true; //u[cj] is a child of u[id]
				u[cj].isroot = false; //u[cj] is not the root.
				u[id].childs[j] = u[cj];
			}
		}

//		Arrays.sort(u); // u[i].id = i

		Node root = null; // u[0] is a dammy
		for (int i=0; i < n; i++) {
			Node p = u[i]; // parent
			// for any childs of p, set its parent to p.
			for (int k=0; k < p.degree; k++) {
				p.childs[k].parent = p;
			}

			// if p is the root then depth of p is 0
			if (p.isroot) {
				root = p;
				root.depth = 0;
			}
		}

//		if (root != null)
			setdepth(root);
//		else System.out.println("error");

		for (int i=0; i < n; i++) {
			System.out.println(u[i]);
		}

	}

	static class Node /* implements  Comparable<Node> */ {
		int id;

		int degree;

		Node parent;

		int depth;

		Node[] childs;

		boolean isroot = true;

		boolean ischild;

		public Node(int id) {
			this.id = id;
		}

//		public int compareTo(Node x) {
//			return this.id - x.id;
//		}


		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();

			int n = this.id;

			int p;
			if (parent == null) {
				p = -1;
			} else {
				p = this.parent.id;
			}

			int d = this.depth;

			String type;
			if (parent == null) {
				type = "root";
			} else if (degree != 0) {
				type = "internal node";
			} else {
				type = "leaf";
			}

			sb.append("node " + n + ": parent = " + p +
					", depth = " + d +", " + type + ", [");

			if (degree == 0) return sb.append("]").toString();

			for (int i=0; i < degree-1; i++) {
				sb.append( this.childs[i].id + ", " );
			}
			sb.append(this.childs[degree-1].id);
			sb.append("]");

			return sb.toString();
		}

		void bechild() {
			ischild = true;
			isroot = false;
		}

		void beroot() {
			isroot = true;
			ischild = false;
		}
	}

	static void setdepth(Node x) {
		int c = x.childs.length;
		if (c == 0) return;
		for (int i=0; i < c; i++) {
			x.childs[i].depth = x.depth+1;
		}
		for (int i=0; i < c; i++) {
			setdepth( x.childs[i] );
		}
	}
}