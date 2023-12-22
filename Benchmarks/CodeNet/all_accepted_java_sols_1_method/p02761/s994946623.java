import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[3];
		Arrays.fill(a, -1);

		for (int i = 0; i < M; i++) {
			int s = sc.nextInt() - 1;
			int c = sc.nextInt();
			if (a[s] != -1 && a[s] != c) {
				System.out.println(-1);
				return;
			}

			if (s + 1 > N) {
				System.out.println(-1);
				return;
			}

			a[s] = c;
		}

		if (N == 1) {
			System.out.println((a[0] != -1) ? a[0] : 0);
			return;
		}

		if (N >= 2 && a[0] == 0) {
			System.out.println(-1);
			return;
		}

		if (a[0] == -1) {
			a[0] = 1;
		}

		for (int i = 1; i < N; i++) {
			if (a[i] == -1) a[i] = 0;
		}

		for (int i = 0; i < N; i++) {
			System.out.print(a[i]);
		}

		System.out.println();
	}
}
