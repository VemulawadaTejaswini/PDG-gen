public class Main {

	public void run(java.io.InputStream in, java.io.PrintStream out) {
		final java.util.Scanner sc = new java.util.Scanner(in);
		long min, max, sum;
		int n;
		
		n = sc.nextInt();
		min = Long.MAX_VALUE;
		max = Long.MIN_VALUE;
		sum = 0;
		for (int i = 0; i < n; ++i) {
			final long a = sc.nextLong();
			
			if (a < min) min = a;
			if (max < a) max = a;
			sum += a;
		}
		out.println(min + " " + max + " " + sum);
		
		sc.close();
	}
	
	public static void main(String[] args) {
		(new Main()).run(System.in, System.out);
	}

}