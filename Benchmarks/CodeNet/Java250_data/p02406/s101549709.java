public class Main {
	
	public void run(java.io.InputStream in, java.io.PrintStream out) {
		final java.util.Scanner sc = new java.util.Scanner(in);
		final int n = sc.nextInt();
		
		for (int i = 1; i <= n; ++i) {
			if (i % 3 == 0) {
				out.print(" " + i);
			} else {
				for (int j = i; j > 0; j /= 10) {
					if (j % 10 == 3) {
						out.print(" " + i);
						break ;
					}
				}
			}
		}
		out.println();
		sc.close();
	}

	public static void main(String[] args) {
		(new Main()).run(System.in, System.out);
	}

}