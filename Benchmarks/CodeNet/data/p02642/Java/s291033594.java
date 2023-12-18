

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int c = 1000005;

		int n = sc.nextInt();
		int[] a = new int[n];
		int[] cnt = new int[c];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());

			if (cnt[a[i]] != 0) {
				cnt[a[i]] = 2;
				continue;
			}
			for (int j = a[i]; j < c; j += a[i]) {
				cnt[j]++;
			}
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (cnt[a[i]] == 1)
				ans++;
		}

		System.out.println(ans);

	}

}
