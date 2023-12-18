public class Main {
	
	public void run(java.io.InputStream in, java.io.PrintStream out) {
		final java.util.Scanner sc = new java.util.Scanner(in);
		final int[] r = new int[sc.nextInt()];
		int max, min;
		
		for (int i = 0; i < r.length; ++i) {
			r[i] = sc.nextInt();
		}
		
		max = Integer.MIN_VALUE; min = r[0];
		for (int i = 1; i < r.length; ++i) {
			max = Math.max(max, r[i] - min);
			min = Math.min(min, r[i]);
		}
		out.println(max);
		
		sc.close();
	}

	public static void main(String[] args) {
		(new Main()).run(System.in, System.out);
	}

}