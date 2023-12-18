
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Node[] T = new Node[n];

		for (int i = 0; i < n; i++) {
			T[i] = new Node();
		}
		int l = 0;
		for (int i = 0; i < n; i++) {
			int v = scanner.nextInt();
			int d = scanner.nextInt();
			for (int j = 0; j < d; j++) {
				int c = scanner.nextInt();
				if (j == 0) {
					T[v].l = c;
				} else {
					T[l].r = c;
				}
				l = c;
				T[c].p = v;
			}
		}
		int r = -1;
		for (int i = 0; i < n; i++) {
			if (T[i].p == -1){
				r = i;
				break;
			}
		}
		int[] D = new int[n];
		rec(r, 0, D, T);
		for(int i = 0;i<n;i++){
			print(i,T,D);
		}
	}

	private void print(int u,Node[] T,int[] D) {
		System.out.printf("node %d: parent = %d, depth = %d, ", u,T[u].p,D[u]);
		if(T[u].p==-1)
			System.out.print("root, ");
		else if(T[u].l==-1)
			System.out.print("leaf, ");
		else
			System.out.print("internal node, ");
		System.out.print("[");
		for(int i = 0, c = T[u].l;c!=-1;i++,c=T[c].r){
			if(i!=0)
				System.out.print(", ");
			System.out.print(c);
		}
		System.out.println("]");
	}

	private void rec(int u, int p, int[] D, Node[] T) {
		D[u] = p;
		if (T[u].r != -1)
			rec(T[u].r, p, D, T);
		if (T[u].l != -1)
			rec(T[u].l, p + 1, D, T);
	}
	class Node {
		int p = -1;
		int l = -1;
		int r = -1;
	}
}