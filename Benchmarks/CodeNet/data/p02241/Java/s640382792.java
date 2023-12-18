import java.util.Scanner;

public class Main{
	static final int MAX = 100;
	static final int INF = 1 << 21;
	static final int WHITE = 0;
	static final int GRAY = 1;
	static final int BLACK = 2;
	static int n;
	static int[][]M = new int[MAX][MAX];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int e = scan.nextInt();
				if(e == -1) M[i][j] = INF;
				else M[i][j] = e;
			}
		}
		scan.close();
		System.out.println(prim());
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
