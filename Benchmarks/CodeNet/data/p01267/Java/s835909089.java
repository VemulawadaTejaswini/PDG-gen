
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int n, a, b, c, x;
	int[] y;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			n = sc.nextInt(); a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt(); x = sc.nextInt();
			if ((n|a|b|c|x) == 0) break;
			y = new int[n];
			for (int i=0;i<n;i++) {
				y[i] = sc.nextInt();
			}
			
			System.out.println (solve());
		}
	}
	
	int solve() {
		int p = 0;
		for (int t = 0;t <= 10000;t++) {
			if (y[p] == x) p++;
			if (p == n) return t;
			x = (a * x + b) % c;
		}
		return -1;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}