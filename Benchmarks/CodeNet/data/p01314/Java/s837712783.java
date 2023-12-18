public class Main {
	
	public void run(java.util.Scanner sc, java.io.PrintStream out) {
		final int[] d = new int[1001];
		for (int i = 1; i <= 1000; ++i)
			d[i] = d[i - 1] + i;
		
		for (;;) {
			final int N = sc.nextInt();
			if (N == 0) break ;
			
			int res = 0;
			for (int i = 0; i <= 1000; ++i)
			for (int j = i + 2; j <= 1000; ++j) {
				if (d[j] - d[i] == N)
					++res;
			}
			out.println(res);
		}
	}

	public static void main(String[] args) {
		(new Main()).run(new java.util.Scanner(System.in), System.out);
	}

}