public class Main {

	public void run(java.io.InputStream in, java.io.PrintStream out) {
		final java.util.Scanner sc = new java.util.Scanner(in);
		int n, min, max, sum;
		
		n = sc.nextInt();
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		sum = 0;
		for (int i = 0; i < n; ++i) {
			final int a = sc.nextInt();
			
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