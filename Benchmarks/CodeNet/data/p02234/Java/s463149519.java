import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int[] p;
	int[][] m; 
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		p = new int[n+1];
		m = new int[n+1][n+1];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
			p[i+1] = sc.nextInt();
		}
		mutrixChainMultiplication(n);
		System.out.println(m[1][n]);
		sc.close();
	}
	
	private void mutrixChainMultiplication(int n) {
		for(int i = 1; i <= n; i++) {
			m[i][i] = 0;
		}
		for(int l = 2; l <= n; l++) {
			for(int i = 1; i <= n - l + 1; i++) {
				int j = i + l - 1;
				m[i][j] = Integer.MAX_VALUE;
				for(int k = i; k <= j - 1; k++) {
					m[i][j] = Math.min(m[i][j], m[i][k] + m[k+1][j] + p[i-1] * p[k] * p[j]);
				}
			}
		}
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
