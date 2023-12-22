import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long M = sc.nextLong();
		long[] a = new long[(int) (A)];
		long minA = Long.MAX_VALUE;
		for (int i = 0; i < A; i++) {
			a[i] = sc.nextLong();
			minA = Math.min(minA, a[i]);
		}
		long[] b = new long[(int) (B)];
		long minB = Long.MAX_VALUE;
		for (int i = 0; i < B; i++) {
			b[i] = sc.nextLong();
			minB = Math.min(minB, b[i]);
		}

		long answer = minA + minB;
		long[] c = new long[(int) (M)];
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			long t = a[x] + b[y];
			t -= sc.nextLong();
			answer = Math.min(answer, t);
		}

		System.out.println(answer);
	}
}
