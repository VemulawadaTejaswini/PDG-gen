

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] h = new int[n];

		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(sc.next());
		}

		int ans = 0;
		int act = 0;

		for (int i = 0; i < n; i++) {
			if (act >= h[i]) {
				act = h[i];
			} else {
				ans += h[i] - act;
				act = h[i];
			}
		}
		System.out.println(ans);
	}

}
