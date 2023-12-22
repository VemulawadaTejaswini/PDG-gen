import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		ALucky7 solver = new ALucky7();
		solver.solve(1, in, out);
		out.close();
	}

	static class ALucky7 {
		public void solve(int testNumber, Scanner in, PrintWriter out) {
			String num = in.next();
			boolean ok = false;
			for (char ch : num.toCharArray()) {
				if (ch == '7') {
					ok = true;
					break;
				}
			}

			out.print(ok ? "Yes" : "No");
		}

	}
}

