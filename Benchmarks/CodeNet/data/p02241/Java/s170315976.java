import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	private int prim(int n, int[][] map) {
		int[] p = new int[n];
		int[] d = new int[n];
		boolean[] c = new boolean[n];
		Arrays.fill(p, -1);
		Arrays.fill(d, Integer.MAX_VALUE);
		d[0] = 0;
		while (true) {
			int min = Integer.MAX_VALUE;
			int u = -1;
			for (int i = 0; i < n; i++) {
				if (d[i] < min && !c[i]) {
					min = d[i];
					u = i;
				}
			}
			if (u == -1) break;
			c[u] = true;
			for (int i = 0; i < n; i++) {
				if (!c[i] && map[u][i] != Integer.MAX_VALUE && map[u][i] < d[i]) {
					d[i] = map[u][i];
					p[i] = u;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (p[i] != -1) sum += map[i][p[i]];
		}
		return sum;
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[][] map = new int[n][n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			for (int j = 0; j < n; j++) {
				int v = Integer.parseInt(st.nextToken());
				map[i][j] = v == -1?Integer.MAX_VALUE:v;
			}
		}
		reader.close();
		System.out.println(prim(n, map));
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}

