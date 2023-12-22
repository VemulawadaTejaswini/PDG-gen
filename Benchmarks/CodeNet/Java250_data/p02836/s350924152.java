
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MOD = (long) (1e9 + 7);

	void run() {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		int s = 0, t = c.length - 1;
		int ans = 0;
		while (s < t) {
			if (c[s] != c[t])
				++ans;
			++s;
			--t;
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
