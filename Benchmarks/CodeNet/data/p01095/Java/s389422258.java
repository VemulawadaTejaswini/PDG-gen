public class Main {
	
	public void run(java.util.Scanner sc, java.io.PrintStream out) {
		for (;;) {
			final int m = sc.nextInt();
			int n = sc.nextInt();
			if (m == 0 && n == 0) break ;
			final boolean[] d = new boolean[7368792];
			for (int i = m; ; ++i) {
				if (d[i]) continue ;
				if (n == 0) {
					out.println(i);
					break ;
				}
				for (int j = i; j < d.length; j += i)
					d[j] = true;
				n -= 1;
			}
		}
	}

	public static void main(String[] args) {
		(new Main()).run(new java.util.Scanner(System.in), System.out);
	}

}