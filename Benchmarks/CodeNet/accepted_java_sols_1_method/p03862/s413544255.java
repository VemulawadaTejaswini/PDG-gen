import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x = sc.nextLong();
		long[] a = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}

		long answer = 0;
		if (a[0] > x) {
			answer += a[0] - x;
			a[0] = x;
		}

		long t = a[0];
		for (int i = 1; i < a.length; i++) {
			if (t + a[i] > x) {
				answer += a[i] - (x - t);
				a[i] = (x - t);
			}

			t = a[i];
		}

		System.out.println(answer);
	}
}
