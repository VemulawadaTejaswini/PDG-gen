public class Main {
	
	public void run(java.io.InputStream in, java.io.PrintStream out) {
		try (final java.util.Scanner sc = new java.util.Scanner(in)) {
			for (;;) {
				final int D = sc.nextInt();
				final int E = sc.nextInt();
				if (D == 0 && E == 0) break ;
				
				double rval = Double.MAX_VALUE;
				for (int u = 0; u <= D; ++u) {
					final int v = D - u;
					rval = Math.min(rval, Math.abs(Math.sqrt(u*u+v*v) - E));
				}
				System.out.println(rval);
			}
		}
	}

	public static void main(String[] args) {
		(new Main()).run(System.in, System.out);
	}

}