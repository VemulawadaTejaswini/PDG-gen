import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static void solve() {
		while (true) {

			int outer = 0;

			int[] num = new int[6];
			for (int i=0; i<6; i++) {
				num[i] = in.nextInt();
				outer += num[i];
			}

			if (outer == 0) break;

			int[] p = new int[3];
			for (int i=0; i<3; i++) {
				p[i] = num[i] + num[i+3];
			}

			int ans = 0;

			for (int i=0; i<3; i++) {
				int tmp = i;
				for (int j=0; j<3; j++) {
					if (p[j] - i < 0) {
						tmp = -1;
						break;
					} else {
						tmp += (p[j] - i)/3;
					}
				}
				ans = Math.max(ans, tmp);
			}

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