import java.util.Random;
import java.util.Scanner;

public class Main {
	private static final int K = 26;
	private static final int COUNT = 1000000;
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

		var count = 0;
		var t = create(c, s, d);
		for (var i = 0; count < COUNT; i++) {
			for (var j = 1; j < K; j++) {
				count++;
				var mdi = i % d;
				var mti = (t[mdi] + j - 1) % K;
				var check = check(c, s, t, d, mdi, mti);
				if (check > 0) {
					t[mdi] = mti + 1;
					break;
				}
			}
		}

		for (var i = 0; i < d; i++) {
			System.out.println(t[i]);
		}
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

		//		System.out.printf("*****%d, %d, %d, %d, %d,     %d, %d\r\n", t[0], t[1], t[2], t[3], t[4], mdi + 1, mti + 1);
		//		System.out.printf("*****%d, %d, %d, %d, %d, %d, %d, %d\r\n", s[mdi][mti], s[mdi][ti], c[mti], c[ti], last1,
		//				last2, count1, count2);

		return sum;
	}

	private static int score(int[] c, int[][] s, int[] t, int d) {
		var sum = 0;
		var last = new int[K];
		for (var i = 0; i < d; i++) {
			var ti = t[i] - 1;
			sum += s[i][ti];
			last[ti] = i + 1;
			for (var j = 0; j < K; j++) {
				sum -= ((i + 1) - last[j]) * c[j];
			}
		}

		return sum;
	}

	private static int[] create(int[] c, int[][] s, int d) {
		var t = new int[d];
		var last = new int[K];
		for (var i = 0; i < d; i++) {
			var v = new int[K];
			for (var j = 0; j < K; j++) {
				v[j] = s[i][j] + (((i + 1) - last[j]) * c[j]);
			}
			t[i] = rand(v) + 1;
			last[t[i] - 1] = i + 1;
		}
		return t;
	}

	private static int rand(int[] v) {
		var sum = 0;
		for (var i = 0; i < v.length; i++) {
			sum += v[i];
		}
		var value = rand.nextInt(sum);
		var index = 0;
		sum = 0;
		for (var i = 0; i < v.length; i++) {
			sum += v[i];
			if (value < sum) {
				break;
			}
			index++;
		}
		return index;
	}
}
