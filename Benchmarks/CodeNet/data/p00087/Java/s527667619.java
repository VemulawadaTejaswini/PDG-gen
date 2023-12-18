import static java.util.Arrays.*;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	void solve() {
		String[] tokens = sc.nextLine().split(" ");
		double[] st = new double[100];
		int sp = 0;
		for (String token : tokens) {
			if (token.equals("+")) {
				double x = st[sp-2] + st[sp-1];
				sp-=2;
 				st[sp++] = x;
			} else if (token.equals("-")) {
				double x = st[sp-2] - st[sp-1];
				sp-=2;
				st[sp++] = x;

			} else if (token.equals("*")) {
				double x = st[sp-2] * st[sp-1];
				sp-=2;
				st[sp++] = x;

			} else if (token.equals("/")) {
				double x = st[sp-2] / st[sp-1];
				sp-=2;
				st[sp++] = x;
			} else {
				double x = Double.parseDouble(token);
				st[sp++] = x;
			}
		}
		double ans = st[0];
		out.printf("%.8f\n", ans);
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	Scanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

}