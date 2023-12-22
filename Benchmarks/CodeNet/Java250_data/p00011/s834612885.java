import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static void solve() {
		int w = in.nextInt();
		int n = in.nextInt();

		int[] x = new int[w];
		for (int i=0; i<w; i++) {
			x[i] = i + 1;
		}

		while (n-- > 0) {
			String[] str = in.next().split(",");
			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;

			int t = x[a];
			x[a] = x[b];
			x[b] = t;
		}

		for (int ans : x) {
			System.out.println(ans);
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