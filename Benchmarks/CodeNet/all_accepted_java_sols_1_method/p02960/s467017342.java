import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		final int MOD = 1000000007;
		final int N = 13;
		int[] count = new int[N];

		count[0] = 1;
		int order = 1;

		for (int i = 0; i < sb.length(); i++) {
			int[] next = new int[N];
			if (sb.charAt(i) == '?') {
//				System.out.print("★?★");
				for (int k = 0; k < 10; k++) {
					for (int j = 0; j < N; j++) {
						next[(k * order + j) % N] += count[j];
						next[(k * order + j) % N] %= MOD;
					}
				}
			} else {
				int i_ketame = sb.charAt(i) - '0';
//				System.out.print("★" + i_ketame + "★");

				for (int j = 0; j < N; j++) {
					next[(i_ketame * order + j) % N] += count[j];
					next[(i_ketame * order + j) % N] %= MOD;
				}
			}

			count = next;

			order *= 10;
			order %= N;
//			for (int m = 0; m < N; m++) {
//				System.out.print(count[m] + " ");
//			}
//			System.out.println();
		}

		System.out.println(count[5]);
		sc.close();
	}
}