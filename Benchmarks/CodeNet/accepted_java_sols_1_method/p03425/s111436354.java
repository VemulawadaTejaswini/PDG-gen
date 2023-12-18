import java.util.Scanner;

public class Main {

	static int[] f = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 2 };
	static int[] s = { 1, 1, 1, 2, 2, 3, 2, 2, 3, 3 };
	static int[] t = { 2, 3, 4, 3, 4, 4, 3, 4, 4, 4 };

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long[] count = new long[5];
		for (int i = 0; i < N; i++) {
			String S = in.next();
			if (S.charAt(0) == 'M') {
				count[0]++;
			}
			if (S.charAt(0) == 'A') {
				count[1]++;
			}
			if (S.charAt(0) == 'R') {
				count[2]++;
			}
			if (S.charAt(0) == 'C') {
				count[3]++;
			}
			if (S.charAt(0) == 'H') {
				count[4]++;
			}
		}
		long ans = 0;
		for (int i = 0; i < 10; i++) {
			ans += count[f[i]] * count[s[i]] * count[t[i]];
		}
		System.out.println(ans);
		in.close();
	}
}