import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private int getMinCost(int n, int[] p) {
		int[][] m = new int[n+1][n+1];
		for (int s = 0; s < n; s++) {
			for (int i = 1, j = s + 2; j <= n; i++, j++) {
				m[i][j] = Integer.MAX_VALUE;
				for (int k = i; k < j; k++) {
					m[i][j] = Math.min(m[i][j], m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j]);
				}
			}
		}
		return m[1][n];
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] p = new int[n+1];
		for (int i = 0, j = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			if (i == 0) {
				p[j++] = n1;
			}
			p[j++] = n2;
		}
		System.out.println(getMinCost(n, p));
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}
