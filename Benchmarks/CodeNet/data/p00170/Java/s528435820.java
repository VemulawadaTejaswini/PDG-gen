
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class t{
		double v = 0;
		String a = "";
	}
	
	int w[];
	int s[];
	String f[];
	
	t g(boolean[] reaming, double rw, int depth) {
		if (depth == w.length) {
			return new t();
		}
		double res = Double.MAX_VALUE;
		int dv = 0;
		String ans= "";
		for (int i = 0; i < reaming.length; i++) {
			if (reaming[i]) {
				if (rw - w[i] <= s[i]) {
					// System.out.println(i + " " +rw+" " + depth);
					reaming[i] = false;
					t gz = g(reaming, rw - w[i],  depth + 1) ;
					gz.v += rw;
					reaming[i] = true;
					if (res > gz.v) {
						res = gz.v;
						ans = gz.a;
						dv = i;
					}
				}
			}
		}
		
		ans = f[dv]+"\n"+ans;
		t ret = new t();
		ret.v = res;
		ret.a = ans;
		return ret;
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			f = new String[n];
			w = new int[n];
			s = new int[n];

			double rw = 0;
			for (int i = 0; i < n; i++) {
				f[i] = sc.next();
				w[i] = sc.nextInt();
				s[i] = sc.nextInt();
				rw += w[i];
			}

			boolean reaming[] = new boolean[n];
			Arrays.fill(reaming, true);
			t ans = g(reaming, rw, 0);

			System.out.print(ans.a);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}