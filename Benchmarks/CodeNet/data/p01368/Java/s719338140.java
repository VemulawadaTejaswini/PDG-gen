import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	class Node implements Comparable<Node> {
		int p, t;
		int j = 0;
		String s;

		Node(int p, int t) {
			this.p = p;
			this.t = t;
		}

		Node(int p, int t, String s) {
			this.p = p;
			this.t = t;
			this.s = s;
		}

		public int compareTo(Node tar) {
			return this.t - tar.t;
		}
	}

	class Arrow {
		int cap;
		int flow;
		int from;
		int to;

		Arrow(int from, int to) {
			this.from = from;
			this.to = to;
			this.cap = 1;
			this.flow = 0;
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int l = sc.nextInt();
			if ((n | m | l) == 0)
				break;
			n++;
			int d[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				Arrays.fill(d[i], Integer.MAX_VALUE / 4);
			}
			for (int i = 0; i < m; i++) {
				int u = sc.nextInt() + 1;
				int v = sc.nextInt() + 1;
				d[u][v] = d[v][u] = sc.nextInt();
			}
			Node[] req = new Node[l];
			for (int i = 0; i < l; i++) {
				req[i] = new Node(sc.nextInt() + 1, sc.nextInt());
			}
			Arrays.sort(req);

			for (int k = 0; k < n; k++) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
					}
				}
			}
			for (int i = 0; i < n; i++) {
				d[0][i] = 0;
			}

			boolean r[][] = new boolean[n][n];

			LinkedList<Arrow> A = new LinkedList<Arrow>();

			for (int i = 0; i < l; i++) {
				for (int j = i + 1; j < l; j++) {
					if (d[req[i].p][req[j].p] <= -req[i].t + req[j].t) {
						A.add(new Arrow(i, j));
					}
					// System.out.println(i+" "+j+" " + r[req[i].p][req[j].p]);
				}
			}

			boolean s[] = new boolean[l];
			boolean t[] = new boolean[l];

			int count = 0;

			for (;;) {
				boolean end = true;
				for (int i = 0; i < l; i++) {
					if (!s[i]) {
						if (dfs(s, t, A, i , new boolean[l])) {
							count++;
							end = false;
						}
					}
				}
				if(end){
					break;
				}
			}
			System.out.println(l-count);
		}

	}

	boolean dfs(boolean[] s, boolean[] t, LinkedList<Arrow> A, int p, boolean[] passed) {
		if(passed[p]){
			return false;
		}else{
			passed[p] = true;
		}
		for(Arrow hen:A){
			if(hen.from != p){
				continue;
			}
			
			if(hen.flow == 1){
				continue;
			}
			hen.flow = 1;
			s[hen.from] = true;
			if(!t[hen.to]){
				t[hen.to] = true;
				return true;
			} 
			if(bdfs(s,t,A,hen.to , passed)){
				return true;
			}else{
				hen.flow = 0;
				s[hen.from] = false;
			}
		}
		return false;
	}

	boolean bdfs(boolean[] s, boolean[] t, LinkedList<Arrow> A, int p, boolean[] passed) {
		for(Arrow hen:A){
			if(hen.to != p){
				continue;
			}
			
			if(hen.flow == 0){
				continue;
			}
			hen.flow = 0;
			
			if(dfs(s,t,A,hen.from , passed)){
				return true;
			}else{
				hen.flow = 1;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		new Main().run();
	}
}