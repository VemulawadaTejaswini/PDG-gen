public class Main {
	
	public void run(java.util.Scanner sc, java.io.PrintStream out) {
		PROBLEM:
		for (;;) {
			final int n = sc.nextInt();
			if (n == 0) break ;
			final int[] c = new int[n];
			for (int i = 0; i < n; ++i)
				c[i] = sc.next().charAt(0) - 'A';
			
			final int[] d = new int['Z' - 'A' + 1];
			for (int i = 0; i < n; ++i) {
				d[c[i]] += 1;
				
				for (int k = 0; k < d.length; ++k) {
					boolean flag = true;
					for (int j = 0; j < d.length; ++j) {
						if (j == k) continue ;
						flag = flag && (d[j] + (n - i - 1) < d[k]);
					}
					if (flag) {
						out.println(String.valueOf((char)('A' + k)) + " " + (i + 1));
						continue PROBLEM;
					}
				}
			}
			out.println("TIE");
		}
	}
	
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			(new Main()).run(sc, System.out);
		}
	}

}