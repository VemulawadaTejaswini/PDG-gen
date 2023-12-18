import java.util.Scanner;

public class Main{
	static final int MAX = 100;
	static final int INF = 1 << 21;
	static final int WHITE = 0;
	static final int GRAY = 1;
	static final int BLACK = 2;
	static int n;
	static int[][]M;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			n = sc.nextInt();
			if(n == 0) break;
			M = new int[n][n];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					M[i][j] = INF;
				}
			}
			int m = sc.nextInt();
			for(int i = 0; i < m; i++) {
				String[] s = sc.next().split(",");
				int a = Integer.parseInt(s[0]);
				int b = Integer.parseInt(s[1]);
				int c = Integer.parseInt(s[2]);
				M[a][b] = c;
				M[b][a] = c;
			}
			int t = prim();
			System.out.println(t / 100 - n + 1);
		}
		sc.close();
	}
	static int prim() {
		int u, minV;
		int[]d = new int[MAX];
		int[]p = new int[MAX];
		int[]color = new int[MAX];
		for(int i = 0; i < n; i++) {
			d[i] = INF;
			p[i] = -1;
			color[i] = WHITE;
		}
		d[0] = 0;
		while(true) {
			minV = INF;
			u = -1;
			for(int i = 0; i < n; i++) {
				if(minV > d[i] && color[i] != BLACK) {
					u = i;
					minV = d[i];
				}
			}
			if(u == -1) {
				break;
			}
			color[u] = BLACK;
			for(int v = 0; v < n; v++) {
				if(color[v] != BLACK && M[u][v] != INF) {
					if(d[v] > M[u][v]) {
						d[v] = M[u][v];
						p[v] = u;
						color[v] = GRAY;
					}
				}
			}
		}
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(p[i] != -1) {
				sum += M[i][p[i]];
			}
		}
		return sum;
	}
}
