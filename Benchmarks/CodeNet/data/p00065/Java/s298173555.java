import static java.util.Arrays.*;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	void solve() {
		int[][] on = new int[2][1024];
		for (;;) {
			String line = sc.nextLine();
			if (line.length() == 0) break;
			String[] ss = line.split(",");
			int num = Integer.parseInt(ss[0]);
			int day = Integer.parseInt(ss[1]);

			on[0][num]++;

		}
		for (;sc.hasNextLine();) {
			String line = sc.nextLine();
			String[] ss = line.split(",");
			int num = Integer.parseInt(ss[0]);
			int day = Integer.parseInt(ss[1]);
			on[1][num]++;
		}
		for (int i = 0; i < 1024; i++) {
			if (on[0][i] > 0 && on[1][i] > 0) {
				out.println(i + " " + (on[0][i] + on[1][i]));
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	Scanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
		out.close();
	}

}