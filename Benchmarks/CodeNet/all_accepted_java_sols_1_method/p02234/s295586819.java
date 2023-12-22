import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int N = 100;
		int n;
		int[] p = new int[N + 1];
		int[][] m = new int[N+1][N+1];
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			p[i-1] = scan.nextInt();
			p[i] = scan.nextInt();
		}
		
		for (int i = 1; i <= n; i++) {
			m[i][i] = 0;
		}
		for (int l = 2; l <= n; l++ ) {
			for (int i = 1; i <= n - l + 1; i++ ) {
				int j = i + l - 1;
				m[i][j] = Integer.MAX_VALUE;
				for (int k = i; k <= j -1; k++ ){
					int x = m[i][k] + m[k+1][j] + p[i-1] * p[k] * p[j];
					if (x < m[i][j]) {
						m[i][j] = x;
					}
				}
			}
		}
		
		System.out.println(m[1][n]);
		scan.close();
	}

}