import java.util.Random;
import java.util.Scanner;

public class Main {
	private static final int K = 26;
	private static final int TIME = 300;
	private static Random rand = new Random(System.currentTimeMillis());

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var d = sc.nextInt();
		var c = new int[K];
		var s = new int[d][K];
		for (var i = 0; i < K; i++) {
			c[i] = sc.nextInt();
		}
		for (var i = 0; i < d; i++) {
			for (var j = 0; j < K; j++) {
				s[i][j] = sc.nextInt();
			}
		}
		sc.close();

		var t = search(c, s, d);
		for (var i = 0; i < d; i++) {
			System.out.println(t[i]);
		}
	}

	private static int[] search(int[] c, int[][] s, int d) {
		var time = System.currentTimeMillis();
		var t = create(c, s, d);
		while (System.currentTimeMillis() - time <= TIME) {
			var mdi = rand.nextInt(d);
			var mti = rand.nextInt(K);
			var check = check(c, s, t, d, mdi, mti);
			if (border(time) < check) {
				t[mdi] = mti + 1;
			}

			var mdi1 = rand.nextInt(d);
			var mdi2 = rand.nextInt(d);
			var check1 = check(c, s, t, d, mdi1, t[mdi2] - 1);
			var tbk = t[mdi1];
			t[mdi1] = t[mdi2];
			var check2 = check(c, s, t, d, mdi2, tbk - 1);
			if (border(time) < check1 + check2) {
				t[mdi2] = tbk;
			} else {
				t[mdi1] = tbk;
			}
		}

		return t;
	}

	private static int border(long time) {
		return (int) (-300.0 * (1 - (double)(System.currentTimeMillis() - time) / TIME));
	}

	private static int check(int[] c, int[][] s, int[] t, int d, int mdi, int mti) {
		var sum = 0;
		var ti = t[mdi] - 1;
		sum += s[mdi][mti] - s[mdi][ti];

		var last1 = 0;
		var last2 = 0;
		for (var i = mdi - 1; i >= 0; i--) {
			if (t[i] == ti + 1) {
				last1 = i + 1;
				break;
			}
		}
		for (var i = mdi - 1; i >= 0; i--) {
			if (t[i] == mti + 1) {
				last2 = i + 1;
				break;
			}
		}

		var count1 = 1;
		var count2 = 1;
		for (var i = mdi + 1; i < d; i++) {
			if (t[i] == ti + 1) {
				break;
			}
			count1++;
		}
		for (var i = mdi + 1; i < d; i++) {
			if (t[i] == mti + 1) {
				break;
			}
			count2++;
		}
		sum += (mdi - last2 + 1) * c[mti] * count2 - (mdi - last1 + 1) * c[ti] * count1;

		return sum;
	}

	private static int[] create(int[] c, int[][] s, int d) {
		var t = new int[d];
		for (var i = 0; i < d; i++) {
			t[i] = rand.nextInt(K) + 1;
		}
		return t;
	}
}
