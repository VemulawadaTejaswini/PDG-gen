import java.util.*;
import java.util.stream.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static void solve() {
		int[] a = new int[3];
		for (int i=0; i<3; i++) {
			a[i] = in.nextInt();
		}
		String[] s = Arrays.stream(a).sorted().mapToObj(String::valueOf).toArray(String[]::new);
		out.println(String.join(" ", s));
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
