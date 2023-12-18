

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
		int[] e = new int[26];
		for (int i = 0; i < 26; i++) {
			e[i]++;
		}

		for (int i = 0; i < d; i++) {
			int max = -10000000;
			for (int j = 0; j < 26; j++) {
				int f = 0;
				for (int k = 0; k < 26; k++) {
					if (k!=j) {
						f-= c[k] * e[k];
					}
				}
				if(max<s[i][j]+f) {
					max = s[i][j]+f;
					ans[i] = j;
				}
			}
			e[ans[i]] = 1;
			for (int j = 0; j < 26; j++) {
				if (ans[i] != j)
					e[j]++;
			}
		}

		for (int i = 0; i < d; i++) {
			System.out.println(ans[i] + 1);
		}
	}

}
