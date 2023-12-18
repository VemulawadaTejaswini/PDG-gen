import java.util.Scanner;

public class Main{
	static final int NIL = -1;
	static final int MAX = 100005;
	static Node[] T = new Node[MAX];
	static int n;
	static int D[] = new int[MAX];

	public static void main(String[] args) {
		int i, j, d, v, c, l = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		for(i = 0; i < n; i++) {
			T[i] = new Node(NIL, NIL, NIL);
		}
		for(i = 0; i < n; i++) {
			v = scan.nextInt();
			d = scan.nextInt();
			for(j = 0; j < d; j++) {
				c = scan.nextInt();
				if(j == 0) {
					T[v].setL(c);
				}else {
					T[l].setR(c);
				}
				l = c;
				T[c].setP(v);
			}
		}
		scan.close();

		for(i = 0; i < n; i++) {
			D[i] = getDepth(i);
		}


		for(i = 0; i < n; i++) {
			disp(i);
		}
	}
	// 深さを求める
	static int getDepth(int u) {
		int d = 0;
		while(T[u].getP() != NIL) {
			u = T[u].getP();
			d ++;
		}
		return d;
	}
	static void disp(int u) {
		int i, c;
		System.out.print("node " + u + ": ");
		System.out.print("parent = " + T[u].getP() + ", ");
		System.out.print("depth = " + D[u] + ", ");
		if(T[u].getP() == NIL) {
			System.out.print("root, ");
		}else if(T[u].getL() == NIL) {
			System.out.print("leaf, ");
		}else {
			System.out.print("internal node, ");
		}
		System.out.print("[");
		for(i = 0, c = T[u].getL(); c != NIL; i++, c = T[c].getR()) {
			if(i != 0) {
				System.out.print(", ");
			}
			System.out.print(c);
		}
		System.out.println("]");
	}
}

class Node {
	private int p, l ,r;
	public Node(int p, int l, int r) {
		this.p = p;
		this.l = l;
		this.r = r;
	}
	int getP() {
		return p;
	}
	int getL() {
		return l;
	}
	int getR() {
		return r;
	}
	void setR(int r) {
		this.r = r;
	}
	void setL(int l) {
		this.l = l;
	}
	void setP(int p) {
		this.p = p;
	}
}
