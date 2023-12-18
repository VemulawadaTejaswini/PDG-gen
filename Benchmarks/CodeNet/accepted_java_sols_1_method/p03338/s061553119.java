import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();

		int max = 0;
		for (int i = 0; i < N - 1; i++) {
			int ans = 0;
			String S1 = S.substring(0, i + 1);
			String S2 = S.substring(i + 1);
			char[] c1 = S1.toCharArray();
			char[] c2 = S2.toCharArray();
			for (char c = 'a'; c <= 'z'; c++) {
				boolean A = false, B = false;
				for (int j = 0; j < S1.length(); j++) {
					if (c1[j] == c) {
						A = true;
					}
				}
				for (int j = 0; j < S2.length(); j++) {
					if (c2[j] == c) {
						B = true;
					}
				}
				if (A && B)
					ans++;
			}
			if (max < ans) {
				max = ans;
			}
		}
		System.out.println(max);
	}
}