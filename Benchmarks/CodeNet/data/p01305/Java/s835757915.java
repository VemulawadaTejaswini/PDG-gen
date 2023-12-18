import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			String packageName = new Main().getClass().getPackage().getName();
			System.setIn(new FileInputStream("src/" + packageName + "/input.txt"));
			// System.setOut(new PrintStream(new FileOutputStream("src/" + packageName + "/result.txt")));
		} catch (FileNotFoundException e) {
		} catch (NullPointerException e) {
		}
		new Main().run();
	}

	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T -- > 0) solve();
	}
	void solve() {
		int[] as = new int[9];
		int[] bs = new int[9];
		for (int i = 0; i < 9; i++) as[i] = sc.nextInt();
		for (int i = 0; i < 9; i++) bs[i] = sc.nextInt();
		sort(as);
		sort(bs);

		int awin = 0;
		int bwin = 0;
		int total = 0;
		do {
			int a = 0, b = 0;
			for (int i = 0; i < as.length; i++) {
				if (as[i] > bs[i]) {
					a += as[i] + bs[i];
				} else {
					b += as[i] + bs[i];
				}
			}
			if (a > b) awin++;
			if (a < b) bwin++;
			++total;
		} while (nextPermutation(as));
		System.out.println(1.0 * awin / total + " " + 1.0 * bwin / total);
	}

	boolean nextPermutation(int[] is) {
		int n = is.length;
		for (int i = n - 1; i > 0; i--) {
			if (is[i - 1] < is[i]) {
				int j = n;
				while (is[i - 1] >= is[--j])
					;
				swap(is, i - 1, j);
				rev(is, i, n);
				return true;
			}
		}
		rev(is, 0, n);
		return false;
	}

	void swap(int[] is, int i, int j) {
		int t = is[i]; is[i] = is[j]; is[j] = t;
	}

	void rev(int[] is, int s, int t) {
		while (s < --t) swap(is, s++, t);
	}
}