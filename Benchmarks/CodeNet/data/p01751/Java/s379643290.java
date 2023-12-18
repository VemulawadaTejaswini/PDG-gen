public class Main {

	private final java.util.Scanner sc;
	private final java.io.PrintStream out;
	
	public Main(java.io.InputStream in, java.io.PrintStream out) {
		this.sc = new java.util.Scanner(in);
		this.out = out;
	}
	
	public void run() {
		final int a = sc.nextInt();
		final int b = sc.nextInt();
		final int c = sc.nextInt();
		
		final boolean[] d = new boolean[60];
		int rval = 0;
		for (int s = 0;;) {
			if (d[s]) {
				rval = -1;
				break ;
			}
			d[s] = true;
			if (s <= c && c <= s + a) {
				rval += c;
				break ;
			}
			s += a;
			if (60 <= s) {
				rval += 60;
				s -= 60;
				if (c <= s) {
					rval += c;
					break ;
				}
			}
			s += b;
			if (60 <= s) {
				s -= 60;
				rval += 60;
			}
		}
		out.println(rval);
	}
	
	public static void main(String[] args) {
		(new Main(System.in, System.out)).run();
	}

}