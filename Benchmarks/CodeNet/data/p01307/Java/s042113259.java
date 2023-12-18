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
		char[] ds = sc.next().toCharArray();

		int i = 0;
		int turn = 0;
		int cur = 0;
		while (true) {
			if (cur >= 10) {
				turn++;
				cur = (cur / 10) + (cur % 10);
			} else {
				if (i == ds.length) break;
				cur += ds[i++] - '0';
				turn++;
			}
		}
		System.out.println(turn % 2 == 1 ? "Audrey wins." : "Fabre wins.");
	}
}