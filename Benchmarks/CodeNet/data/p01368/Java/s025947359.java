
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
			int d[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				Arrays.fill(d[i], Integer.MAX_VALUE / 4);
			}
			for(int i = 0; i < n ; i++){
				d[i][i] = 0;
			}
			for (int i = 0; i < m; i++) {
				int u = sc.nextInt();
				int v = sc.nextInt();
				d[u][v] = d[v][u] = sc.nextInt();
			}
			Node[] req = new Node[l];
			for (int i = 0; i < l; i++) {
				req[i] = new Node(sc.nextInt(), sc.nextInt());
			}
			Arrays.sort(req);

			for (int k = 0; k < n; k++) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
					}
				}
			}

			boolean r[][] = new boolean[l][l];
			boolean e[][] = new boolean[l][l];

//			LinkedList<Arrow> A = new LinkedList<Arrow>();

			
			for (int i = 0; i < l; i++) {
				for (int j = i + 1; j < l; j++) {
					if (d[req[i].p][req[j].p] <= -req[i].t + req[j].t) {
						r[i][j] = true;
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
						if (dfs(s, t, r,e, i , new boolean[l],new boolean[l])) {
							s[i] = true;
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

	boolean dfs(boolean[] s, boolean[] t, boolean r[][], boolean e[][], int p , boolean[] passed , boolean[] p2) {
		if(passed[p]){
			return  false;
		}else{
			passed[p] = true;
		}
		for(int  i = 0; i < t.length;i++){
			if(!r[p][i]){
				continue;
			}
			if(e[p][i]){
				continue;
			}
			e[p][i] = true;
			if(!t[i]){
				t[i] = true;
				return true;
			} 
			if(bdfs(s,t,r,e,i , passed , p2)){
				return true;
			}else{
				e[p][i] = false;
			}
		}
		return false;
	}

	boolean bdfs(boolean[] s, boolean[] t, boolean r[][] , boolean[][] e, int p,boolean passed[] , boolean [] p2) {
		if(p2[p]){
			return false;
		}else{
			p2[p] = true;
		}
		for(int i = 0; i < t.length; i++){
			
			if(!e[i][p]){
				continue;
			}
			e[i][p] = false;
			
			if(dfs(s,t,r,e,i ,passed , p2)){
				return true;
			}else{
				e[i][p] = true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		new Main().run();
	}
}