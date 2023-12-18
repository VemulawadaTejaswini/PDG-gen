import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int D;
	int[] c;
	int[][] s;

	int[] ans;

	long score(int[] a) {
		int[] last = new int[26];

		long res = 0;

		for (int d = 0; d < D; d++) {
			res += s[d][a[d]];
			last[a[d]] = d + 1;

			for (int j = 0; j < 26; j++) {
				res -= (c[j] * (d + 1 - last[j]));
			}
//			System.err.println(res);
		}
		return Math.max(res + 1000000, 0);
	}

	public void _main(String[] args) {
		long st = System.currentTimeMillis();
		Scanner sc = new Scanner(in);

		D = sc.nextInt();
		c = new int[26];
		for (int i = 0; i < 26; i++) {
			c[i] = sc.nextInt();
		}

		s = new int[D][26];
		for (int i = 0; i < D; i++) {
			for (int j = 0; j < 26; j++) {
				s[i][j] = sc.nextInt();
			}
		}

		sc.close();

		ans = new int[D];

		long max = score(ans);
		Random random = new Random();

		while (System.currentTimeMillis() - st < 1800) {

			for (int d = 0; d < D; d++) {
				int t = ans[d];
				ans[d] = random.nextInt(26);

				long s = score(ans);
				if (s < max) {
					ans[d] = t;
				} else {
					max = s;
				}
			}
		}

//		System.err.println(score(ans));

		for (int x : ans) {
			out.println(x + 1);
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
