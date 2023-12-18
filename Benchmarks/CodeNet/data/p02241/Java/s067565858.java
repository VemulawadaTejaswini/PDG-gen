import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private enum COLOR{WHITE,GRAY,BLACK}
	private static final int INFINITY = 1<<30;
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[][] m = new int[n][n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			for (int j = 0; j < n; j++) {
				m[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		reader.close();
		
		System.out.println(prim(n, m));
	}

	private int prim(int n, int[][] m) {
		
		COLOR[] colors = new COLOR[n];
		int[] d = new int[n];
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			colors[i] = COLOR.WHITE;
			d[i] = INFINITY;
			p[i] = -1;
		}
		
		d[0] = 0;
		while (true) {
			int minv = INFINITY;
			int u = -1;
			for (int i = 0; i < n; i++) {
				if (colors[i] == COLOR.BLACK) continue;
				if (minv > d[i]) {
					minv = d[i];
					u = i;
				}
			}
			if (u == -1) break;
			colors[u] = COLOR.BLACK;
			for (int v = 0; v < n; v++) {
				if (colors[v] == COLOR.BLACK) continue;
				if (m[u][v] == -1) continue;
				if (d[v] > m[u][v]) {
					d[v] = m[u][v];
					p[v] = u;
				}
			}
		}
		
		int cost = 0;
		for (int i = 0; i < n; i++) {
			if (p[i] != -1) cost += m[i][p[i]];
		}
		return cost;
	}
}

