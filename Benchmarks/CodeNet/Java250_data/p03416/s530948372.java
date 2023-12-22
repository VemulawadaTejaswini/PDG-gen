import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();

		int ans = 0;
		out:
		for (int i = a; i <= b; i++) {
			char[] s = Integer.toString(i).toCharArray();

			for (int j = 0; j < s.length / 2; j++) {
				if (s[j] != s[s.length - 1 - j]) {
					continue out;
				}
			}

			ans++;
		}

		pr.println(ans);
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
