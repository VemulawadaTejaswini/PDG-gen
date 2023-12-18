public class Main {
	
	private char[] e;
	private int p;

	public int number() {
		int res = 0;
		if (e[p] == '(') {
			++p;
			res = expression();
			++p;
		} else {
			for (; Character.isDigit(e[p]); ++p) {
				res = res * 10 + (e[p] - '0');
			}
		}
		return res;
	}
	
	public int factor() {
		int res = number();
		for (;;) {
			if (e[p] == '*') {
				++p;
				res *= number();
			} else if (e[p] == '/') {
				++p;
				res /= number();
			} else break ;
		}
		return res;
	}
	
	public int expression() {
		int res = factor();
		for (;;) {
			if (e[p] == '+') {
				++p;
				res += factor();
			} else if (e[p] == '-') {
				++p;
				res -= factor();
			} else break ;
		}
		return res;
	}
	
	public void run(java.util.Scanner sc, java.io.PrintStream out) {
		final int n = sc.nextInt();
		for (int i = 0; i < n; ++i) {
			e = sc.next().toCharArray();
			p = 0;
			out.println(expression());
		}
	}
	
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			(new Main()).run(sc, System.out);
		}
	}

}