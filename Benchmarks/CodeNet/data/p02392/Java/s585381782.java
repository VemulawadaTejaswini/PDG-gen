import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static void solve() {
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		if (a < b && b < c) {
			out.println("Yes");
		} else {
			out.println("No");
		}
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		solve();
		out.flush();

		long end = System.currentTimeMillis();
		//trace(end-start + "ms");
		in.close();
		out.close();
	}

	static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}
