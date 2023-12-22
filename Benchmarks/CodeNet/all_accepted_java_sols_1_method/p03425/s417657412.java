

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n;
		long m = 0, a = 0, r = 0, c = 0, h = 0, count = 0;
		long d[];
		d = new long[5];
		int p[] = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 2 };
		int q[] = { 1, 1, 1, 2, 2, 3, 2, 2, 3, 3 };
		int s[] = { 2, 3, 4, 3, 4, 4, 3, 4, 4, 4 };
		String tmp;

		n = sc.nextLong();

		for (int i = 0; i < n; ++i) {
			tmp = sc.next();
			if (tmp.charAt(0) == 'M')
				++m;
			if (tmp.charAt(0) == 'A')
				++a;
			if (tmp.charAt(0) == 'R')
				++r;
			if (tmp.charAt(0) == 'C')
				++c;
			if (tmp.charAt(0) == 'H')
				++h;
		}

		d[0] = m;
		d[1] = a;
		d[2] = r;
		d[3] = c;
		d[4] = h;
		for (int i = 0; i < 10; ++i) {
			count += d[p[i]] * d[q[i]] * d[s[i]];
		}
		System.out.println(count);

		sc.close();
	}

}
