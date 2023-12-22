import java.io.*;
import java.util.*;

class Main {
	static final String YES = "Yes";
	static final String NO = "No";

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long[][] A = new long[(int) (3)][(int) (3)];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				A[i][j] = sc.nextLong();
			}
		}
		long N = sc.nextLong();
		boolean[][] c = new boolean[3][3];
		for (int i = 0; i < N; i++) {
			long b = sc.nextLong();
			for (int j = 0; j < A.length; j++) {
				for (int k = 0; k < A[0].length; k++) {
					if (A[j][k] == b) {
						c[j][k] = true;
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			boolean ok = true;
			for (int j = 0; j < 3; j++) {
				if (!c[i][j]) ok = false;
			}
			if (ok) {
				System.out.println(YES);
				return;
			}
		}
		for (int i = 0; i < 3; i++) {
			boolean ok = true;
			for (int j = 0; j < 3; j++) {
				if (!c[j][i]) ok = false;
			}
			if (ok) {
				System.out.println(YES);
				return;
			}
		}

		if ((c[0][0] && c[1][1] && c[2][2]) || (c[0][2] && c[1][1] && c[2][0])) {
			System.out.println(YES);
			return;
		}

		System.out.println(NO);
	}
}
