public class Main {
	
	public void run(java.io.InputStream in, java.io.PrintStream out) {
		final java.util.Scanner sc = new java.util.Scanner(in);
		long[][] a;
		long[][] b;
		long[][] r;
		int n, m, l;

		n = sc.nextInt();
		m = sc.nextInt();
		l = sc.nextInt();
		a = new long[n][m];
		b = new long[m][l];
		for (int i = 0; i < n; ++i)
		for (int j = 0; j < m; ++j) {
			a[i][j] = sc.nextLong();
		}
		for (int i = 0; i < m; ++i)
		for (int j = 0; j < l; ++j){
			b[i][j] = sc.nextLong();
		}
		
		r = new long[n][l];
		for (int i = 0; i < n; ++i)
		for (int j = 0; j < l; ++j) {
			r[i][j] = 0;
			for (int k = 0; k < m; ++k) {
				r[i][j] += a[i][k] * b[k][j];
			}
		}
		
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < l; ++j) {
				out.print(r[i][j]);
				if (j + 1 == l) out.println();
				else out.print(" ");
			}
		}
				
		sc.close();
	}

	public static void main(String[] args) {
		(new Main()).run(System.in, System.out);
	}

}