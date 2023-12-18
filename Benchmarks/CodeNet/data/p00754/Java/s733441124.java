import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static boolean solve() {
		String s = in.nextLine();
		if (s.equals(".")) return false;

		int a = 0, b = 0;
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for (int i=0; i<s.length()-1; i++) {
			if (s.charAt(i) == '(') {
				a++;
				stack.add(0);
			} else if (s.charAt(i) == ')') {
				a--;
				if (a < 0 || b < 0) {
					out.println("no");
					return true;
				}
				if (stack.pollLast() != 0) {
					out.println("no");
					return true;
				}
			} else if (s.charAt(i) == '[') {
				b++;
				stack.add(1);
			} else if (s.charAt(i) == ']') {
				b--;
				if (a < 0 || b < 0) {
					out.println("no");
					return true;
				}
				if (stack.pollLast() != 1) {
					out.println("no");
					return true;
				}
			}
		}

		if (a == 0 && b == 0) {
			out.println("yes");
		} else {
			out.println("no");
		}

		return true;
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.nanoTime();

		while(solve());
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}