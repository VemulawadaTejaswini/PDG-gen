public class Main {
	
	public void run(java.io.InputStream in, java.io.PrintStream out) {
		final java.util.Scanner sc = new java.util.Scanner(in);
		String s, p;
		
		s = sc.next();
		p = sc.next();
		
		if ((s + s).contains(p)) {
			out.println("Yes");
		} else {
			out.println("No");
		}
	}

	public static void main(String[] args) {
		(new Main()).run(System.in, System.out);
	}

}