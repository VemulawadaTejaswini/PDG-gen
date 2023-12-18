public class Main {
	
	public void run(java.io.InputStream in, java.io.PrintStream out) {
		final java.util.Scanner sc = new java.util.Scanner(in);
		int[][] a;
		int[] b;
		int[] r;
		int n, m;

		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[n][m];
		b = new int[m];
		for (int i = 0; i < n; ++i)
		for (int j = 0; j < m; ++j) {
			a[i][j] = sc.nextInt();
		}
		for (int i = 0; i < m; ++i) {
			b[i] = sc.nextInt();
		}
		
		r = new int[n];
		for (int i = 0; i < n; ++i) {
			r[i] = 0;
			for (int j = 0; j < m; ++j) {
				r[i] += a[i][j] * b[j];
			}
		}
		
		for (int i = 0; i < n; ++i) {
			out.println(r[i]);
		}
				
		sc.close();
	}

	public static void main(String[] args) {
		(new Main()).run(System.in, System.out);
	}

}