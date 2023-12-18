import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int[] D;
	Node[] T;
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		T = new Node[n];
		for(int i = 0; i < n; i++) {
			T[i] = new Node();
		}
		
		int l = 0;
		for(int i = 0; i < n; i++) {
			T[i].parent = -1;
			T[i].left = -1;
			T[i].right = -1;
		}
		
		for(int i = 0; i < n; i++) {
			int id = sc.nextInt();
			int k = sc.nextInt();
			for(int j = 0; j < k; j++) {
				int c = sc.nextInt();
				if(j == 0) T[id].left = c;
				else T[l].right = c;
				l = c;
				T[c].parent = id;
			}
		}
		
		int r = -1;
		for(int i = 0; i < n; i++) {
			if(T[i].parent == -1) r = i;
		}
		D = new int[n];
		rec(r,0);
		
		for(int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("node ");
			sb.append(i);
			sb.append(": ");
			sb.append("parent = ");
			sb.append(T[i].parent);
			sb.append(", ");
			sb.append("depth = ");
			sb.append(D[i]);
			sb.append(", ");
			if(T[i].parent == -1) sb.append("root, [");
			else if(T[i].left == -1) sb.append("leaf, [");
			else sb.append("internal node, [");
			String s = sb.toString();
			System.out.print(s);
			
			for(int c = T[i].left, j = 0; c != -1; c =T[c].right) {
				if(j != 0) System.out.print(", ");
				System.out.print(c);;
				j++;
			}
			System.out.println("]");
		}
		
		sc.close();
	}
	
	void rec(int u, int p) {
		D[u] = p;
		if(T[u].right != -1) {
			rec(T[u].right, p);
		}
		if(T[u].left != -1) {
			rec(T[u].left, p+1);
		}
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
class Node {
	int parent, left, right;
}
