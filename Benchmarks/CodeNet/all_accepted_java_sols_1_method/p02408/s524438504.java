

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int S[] = new int[13];
		int H[] = new int[13];
		int C[] = new int[13];
		int D[] = new int[13];

		for (int i = 0; i < n; i++) {
			String M = sc.next();
			int R = sc.nextInt();
			if (M.equals("S")) {
				S[R - 1] = 1;
			} else if (M.equals("H")) {
				H[R - 1] = 1;
			} else if (M.equals("C")) {
				C[R - 1] = 1;
			} else {
				D[R - 1] = 1;
			}
		}

		for (int i = 0; i < 13; i++) {
			if (S[i] == 0) {
				int m = i + 1;
				System.out.println("S " + m);
			}
		}
		for (int i = 0; i < 13; i++) {
			if (H[i] == 0) {
				int m = i + 1;
				System.out.println("H " + m);
			}
		}
		for (int i = 0; i < 13; i++) {
			if (C[i] == 0) {
				int m = i + 1;
				System.out.println("C " + m);
			}
		}
		for (int i = 0; i < 13; i++) {
			if (D[i] == 0) {
				int m = i + 1;
				System.out.println("D " + m);
			}
		}

	}
}
