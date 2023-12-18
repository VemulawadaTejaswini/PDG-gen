import java.util.Scanner;

public class Main {

	static String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
			"r", "s", "t", "u", "v", "w", "x", "y", "z" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] ary = new long[N];
		for (int i = 0; i < N; i++) {
			ary[i] = sc.nextLong();
		}
		long cstKisu = 0;
		long[] aryKisu = new long[N];
		System.arraycopy(ary, 0, aryKisu, 0, ary.length);
		long sumKisu = 0;
		for (int i = 0; i < aryKisu.length; i++) {
			sumKisu += aryKisu[i];
			if (i % 2 == 0) {
				if (sumKisu <= 0) {
					aryKisu[i] += 1 - sumKisu;
					cstKisu += 1 - sumKisu;
					sumKisu = 1;
				}
			} else {
				if (sumKisu >= 0) {
					aryKisu[i] -= sumKisu + 1;
					cstKisu += sumKisu + 1;
					sumKisu = -1;
				}
			}
		}

		long cstGusu = 0;
		long[] aryGusu = new long[N];
		System.arraycopy(ary, 0, aryGusu, 0, ary.length);
		long sumGusu = 0;
		for (int i = 0; i < aryGusu.length; i++) {
			sumGusu += aryGusu[i];
			if (i % 2 == 0) {
				if (sumGusu >= 0) {
					aryGusu[i] -= sumGusu + 1;
					cstGusu += sumGusu + 1;
					sumGusu = -1;
				}
			} else {
				if (sumGusu <= 0) {
					aryGusu[i] += 1 - sumGusu;
					cstGusu += 1 - sumGusu;
					sumGusu = 1;
				}
			}
		}
		System.out.println(Math.min(cstGusu, cstKisu));

	}

}