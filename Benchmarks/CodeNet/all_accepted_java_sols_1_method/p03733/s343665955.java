

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long t = sc.nextInt();
		long[] time = new long[n];

		for (int i = 0; i < n; i++) {
			time[i] = Long.parseLong(sc.next());
		}
		long ans = t;

		for (int i = 0; i < n - 1; i++) {
			if (time[i + 1] - time[i] > t)
				ans += t;
			else {
				ans += time[i + 1] - time[i];
			}
		}

		System.out.println(ans);
	}

}
