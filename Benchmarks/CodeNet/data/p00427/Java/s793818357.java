import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, K, M, R;

	public static void main(String[] args) throws Exception {
		while (true) {
			N = sc.nextInt();
			K = sc.nextInt();
			M = sc.nextInt();
			R = sc.nextInt();
			if (N == 0) break;
			int[] ans = divide(1, N);
			if (M == 1) {
				for (int i = 1; i < N; ++i) {
					add(ans, divide(1, N * i));
				}
			}
			boolean carry = true;
			for (int i = R + 1; i < ans.length - 4; ++i) {
				if (ans[i] != 9) {
					carry = false;
					break;
				}
			}
			if (carry) {
				int[] add = new int[ans.length];
				add[R + 1] = 1;
				add(ans, add);
			}
			StringBuilder sb = new StringBuilder();
			sb.append((char) (ans[0] + '0'));
			sb.append('.');
			for (int i = 1; i <= R; ++i) {
				sb.append((char) (ans[i] + '0'));
			}
			System.out.println(sb);
		}
	}

	static int[] divide(int num, int den) {
		int[] ret = new int[R + 10];
		for (int i = 0; i < ret.length; ++i) {
			ret[i] = num / den;
			num %= den;
			num *= 10;
		}
		return ret;
	}

	static void add(int[] recipient, int[] donor) {
		int carry = 0;
		for (int i = donor.length - 1; i >= 0; --i) {
			recipient[i] += carry + donor[i];
			carry = recipient[i] / 10;
			recipient[i] %= 10;
		}
	}

}