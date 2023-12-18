import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	static int a;
	static int b;
	static int q;
	static long[] s;
	static long[] t;
	static long INF = (long) Math.pow(10, 18);

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		q = sc.nextInt();
		s = new long[a + 2];
		t = new long[b + 2];

		s[0] = -INF;
		s[a + 1] = INF;
		t[0] = -INF;
		t[b + 1] = INF;


		for (int i = 1; i < a + 1; i++) {
			s[i] = sc.nextLong();
		}

		for (int i = 1; i < b + 1; i++) {
			t[i] = sc.nextLong();
		}


		for (int i = 0; i < q; i++) {
			long res = INF;
			long n = sc.nextLong();

			int b = Arrays.binarySearch(s, n);
			int d = Arrays.binarySearch(t, n);

			long[] sAry = { s[~b - 1], s[~b] };
			long[] tAry = { t[~d - 1], t[~d] };

			for (long S : sAry) {
				for (long T : tAry) {
					long d1 = Math.abs(S - n) + Math.abs(T - S);
					long d2 = Math.abs(S - T) + Math.abs(T - n);

					res = Math.min(res, Math.min(d1, d2));
				}
			}
			System.out.println(res);
		}

		sc.close();
	}

}
