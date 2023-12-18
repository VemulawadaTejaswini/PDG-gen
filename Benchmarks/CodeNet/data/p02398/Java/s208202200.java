public class Main {

	public void run(java.io.InputStream in, java.io.PrintStream out) {
		final java.util.Scanner sc = new java.util.Scanner(in);
		final int a = sc.nextInt();
		final int b = sc.nextInt();
		final int c = sc.nextInt();
		int res = 0;
		sc.close();
		
		for (int i = a; i <= b; ++i) {
			if (c % i == 0) {
				res += 1;
			}
		}
		out.println(res);
	}
	
	public static void main(String[] args) {
		(new Main()).run(System.in, System.out);
	}

}