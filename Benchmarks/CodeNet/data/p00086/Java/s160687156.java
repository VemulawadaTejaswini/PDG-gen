import static java.util.Arrays.*;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	void solve() {

		int[] count = new int[100];
		for (;;) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			if (a == -1 && b == -1) break;
			++count[a];
			++count[b];
		}
		boolean ok = true;
		for (int i = 2; i < 100; i++) if (count[i] % 2 == 1) ok = false;
		System.out.println(ok ? "OK":"NG");
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