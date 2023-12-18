

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();
		int[] c = new int[26];
		for (int i = 0; i < 26; i++) {
			c[i] = Integer.parseInt(sc.next());
		}

		int[][] s = new int[d][26];
		for (int i = 0; i < d; i++) {
			for (int j = 0; j < 26; j++) {
				s[i][j] = Integer.parseInt(sc.next());
			}
		}

		int[] ans = new int[d];

		for (int i = 0; i < d; i++) {
			int max = 0;
			for (int j = 0; j < 26; j++) {
				for (int k = 0; k < 26; k++) {
					if (max < s[i][j] - c[k]) {
						max = s[i][j] - c[k];
						ans[i] = j;
					}
				}
			}
		}

		for (int i = 0; i < d; i++) {
			System.out.println(ans[i] + 1);
		}
	}

}
