import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		long[] a = new long[N];
		for (int i = 0; i < N; ++i) {
			a[i] = Long.parseLong(sc.next());
		}
		Arrays.sort(a);
		long ans = 0;
		for (int t = N - 1; t > 5; --t) {
			for (int i = 0; i < (1 << 6); ++i) {
				if (Integer.bitCount(i) != 3) continue;
				ArrayList<Long> t1 = new ArrayList<Long>();
				ArrayList<Long> t2 = new ArrayList<Long>();
				for (int j = 0; j < 6; ++j) {
					if ((i & (1 << j)) == 0) {
						t1.add(a[t - j]);
					} else {
						t2.add(a[t - j]);
					}
				}
				if (tri(t1) && tri(t2)) {
					ans = Math.max(ans, a[t] + a[t - 1] + a[t - 2] + a[t - 3] + a[t - 4] + a[t - 5]);
				}
			}
		}
		boolean[] tri = new boolean[N];
		for (int i = 2; i < N; ++i) {
			ArrayList<Long> len = new ArrayList<Long>();
			for (int j = 0; j < 3; ++j) {
				len.add(a[i - j]);
			}
			tri[i] = tri(len);
		}
		long first = 0;
		int i = N - 1;
		while (i > 0) {
			if (tri[i]) {
				if (first > 0) {
					ans = Math.max(ans, first + a[i] + a[i - 1] + a[i - 2]);
					break;
				}
				first = a[i] + a[i - 1] + a[i - 2];
				i -= 2;
			}
			--i;
		}
		System.out.println(ans);
	}

	static boolean tri(ArrayList<Long> len) {
		return len.get(0) < len.get(1) + len.get(2);
	}

}