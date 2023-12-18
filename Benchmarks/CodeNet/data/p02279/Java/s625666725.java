import java.util.Scanner;

public class Main {

	private static Node[] nodes;
	private static int[] D;

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		nodes = new Node[n];
		StringBuilder[] children = new StringBuilder[n];

		for (int i = 0; i < n; i++) {
			nodes[i] = new Node(-1, -1, -1);
		}

		for (int i = 0; i < n; i++) {
			int node = sc.nextInt();
			int Cnum = sc.nextInt();

			int[] Ckari = new int[Cnum];

			children[node] = new StringBuilder("[");

			for (int j = 0; j < Cnum; j++) {
				Ckari[j] = sc.nextInt();

				if (j == 0) {
					nodes[node].left = Ckari[j];
				} else {
					nodes[Ckari[j - 1]].right = Ckari[j];
				}

				nodes[Ckari[j]].parent = node;

				children[node].append(Ckari[j]);
				if (j != Cnum - 1) {
					children[node].append(", ");
				}
			}

			children[node].append("]");
		}

//		int rootJudge = -1;
		for (int i = 0; i < n; i++) {
			if (nodes[i].parent == -1) {
//				rootJudge = i;
				break;
			}
		}

		D = new int[n];
		
		for (int i = 0; i < n; i++) {
			setDepth(i);
		}


		for (int i1 = 0; i1 < n; i1++) {
			StringBuilder kari = new StringBuilder();
			kari.append("node ");
			kari.append(i1);
			kari.append(": parent = ");
			kari.append(nodes[i1].parent);
			kari.append(", depth = ");
			kari.append(D[i1]);
			kari.append(", ");
			if (nodes[i1].parent == -1) {
				kari.append("root, ");
			} else if (nodes[i1].left == -1) {
				kari.append("leaf, ");
			} else {
				kari.append("internal node, ");
			}
			kari.append(children[i1]);
			System.out.println(kari);

		}

	}

	// public static void setDepth(int u, int p) {
	// D[u] = p;
	//
	// if (nodes[u].right != -1) {
	// setDepth(nodes[u].right, p);
	// }
	// if (nodes[u].left != -1) {
	// setDepth(nodes[u].left, p + 1);
	// }
	//
	// return;
	// }

	public static int setDepth(int u) {
		if (nodes[u].parent == -1) {
			return 0;
		} else {
			return setDepth(nodes[u].parent) + 1;
		}
	}

}

class Node {
	int parent;
	int left;
	int right;

	public Node(int parent, int left, int right) {
		super();
		this.parent = parent;
		this.left = left;
		this.right = right;
	}

}