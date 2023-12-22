

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long[] dam = new long[N];
		long diff = 0;
		for (int i = 0; i < N; i++) {
			dam[i] = 2 * (Integer.parseInt(sc.next()));

				diff = dam[i] - diff;

		}
		long a = diff / 2;
		long tmp = a;
		System.out.print(a);
		for (int i = 0; i < N-1; i++) {
			tmp = dam[i] - tmp;
			System.out.print(" " + tmp);
		}

		sc.close();

	}
}
