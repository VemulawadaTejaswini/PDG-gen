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
				M[i][j] = INF;
			}
		}
		for(int i = 0; i < n; i++) {
			int u = scan.nextInt();
			int k = scan.nextInt();
			for(int j = 0; j < k; j++) {
				int v = scan.nextInt();
				int c = scan.nextInt();
				M[u][v] = c;
			}
		}
		scan.close();
		dijkstra();
	}
	static void dijkstra() {
		int minV;
		int[]d = new int [MAX];
		int[]color = new int [MAX];
		for(int i = 0; i < n; i++) {
			d[i] = INF;
			color[i] = WHITE;
		}
		d[0] = 0;
		color[0] = GRAY;
		while(true) {
			minV = INF;
			int u = -1;
			for(int i = 0; i < n; i++) {
				if(minV > d[i] && color[i] != BLACK) {
					u = i;
					minV = d[i];
				}
			}
			if(u == -1) break;
			color[u] = BLACK;
			for(int v = 0; v < n; v++) {
				if(d[v] > d[u] + M[u][v]) {
					d[v] = d[u] + M[u][v];
					color[v] = GRAY;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			if(d[i] == INF) {
				System.out.println(i + " " + -1);
			}else {
				System.out.println(i + " " + d[i]);
			}
		}
	}
}
