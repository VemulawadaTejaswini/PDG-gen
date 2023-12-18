import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static int rec(int x) {
		int min = Integer.MAX_VALUE / 2;
		if (x == 0) return 0;
		
		if (200 <= x) {
			min = Math.min(min, rec(x - 200) + 380);
		}
		if (300 <= x) {
			min = Math.min(min, rec(x - 300) + 550);
		}
		if (500 <= x) {
			min = Math.min(min, rec(x - 500) + 850);
		}
		
		if (200*5 <= x) {
			min = Math.min(min, rec(x - 200*5) + (int)(380*5*0.8));
		}
		if (300*4 <= x) {
			min = Math.min(min, rec(x - 300*4) + (int)(550*4*0.85));
		}
		if (500*3 <= x) {
			min = Math.min(min, rec(x - 500*3) + (int)(850*3*0.88));
		}
		
		return min;
	}

	static boolean solve() {
		int n = in.nextInt();
		
		if (n == 0) return false;
		
		out.println(rec(n));
		
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