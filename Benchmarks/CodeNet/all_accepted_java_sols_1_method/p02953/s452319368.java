

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];

		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		String answer = "Yes";

		for (int i = 0; i < n - 1; i++) {

			boolean flg = false;
			if (h[i] - h[i + 1] >= 2) {
				answer = "No";
				break;
			}

			if (i > 0) {
				if (h[i - 1] == h[i]) {
					flg = true;
				}
			}

			if (flg && h[i] > h[i + 1]) {
				answer = "No";
				break;
			}

			if (!flg)
				h[i]--;
		}
		System.out.println(answer);
	}

}
