import java.util.Scanner;

public class Main{
	static Node[] T;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		T = new Node[n + 1];
		for(int i = 0; i <= n; i++) {
			T[i] = new Node(-1);
		}
		for(int i = 0; i < n; i++) {
			int v = scan.nextInt();
			int l = scan.nextInt();
			int r = scan.nextInt();
			T[v].setL(l);
			T[v].setR(r);
			if(l != -1) {
				T[l].setP(v);
			}
			if(r != -1) {
				T[r].setP(v);
			}
		}
		scan.close();
		int root = 0;
		for(int i = 0; i < n; i++) {
			if(T[i].getP() == -1) {
				root = i;
			}
		}
		System.out.println("Preorder");
		preParse(root);
		System.out.println();
		System.out.println("Inorder");
		inParse(root);
		System.out.println();
		System.out.println("Postorder");
		postParse(root);
		System.out.println();
	}
	// 先行順巡回
	static void preParse(int u) {
		if(u == -1) return;
		System.out.print(" " + u);
		preParse(T[u].getL());
		preParse(T[u].getR());
	}
	// 中間順巡回
	static void inParse(int u) {
		if(u == -1) return;
		inParse(T[u].getL());
		System.out.print(" " + u);
		inParse(T[u].getR());
	}
	// 後行順巡回
	static void postParse(int u) {
		if(u == -1) return;
		postParse(T[u].getL());
		postParse(T[u].getR());
		System.out.print(" " + u);
	}
	static class Node{
		int p,l,r;
		public Node(int p) {
			this.p = p;
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
		void setP(int p) {
			this.p = p;
		}
		void setL(int l) {
			this.l = l;
		}
		void setR(int r) {
			this.r = r;
		}
	}
}
