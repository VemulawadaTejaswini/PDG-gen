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
			System.out.print((char) (ans[0] + '0'));
			System.out.print(".");
			for (int i = 1; i <= R; ++i) {
				System.out.print((char) (ans[i] + '0'));
			}
			System.out.println();
		}
	}

	static int[] divide(int num, int den) {
		int[] ret = new int[R + 3];
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