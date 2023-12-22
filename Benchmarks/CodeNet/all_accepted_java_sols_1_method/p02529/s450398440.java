

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, q, count = 0;
		int[] S, T;
		n = scan.nextInt();
		S = new int[n];
		for (int i = 0; i < n; i++) {
			S[i] = scan.nextInt();
		}
		q = scan.nextInt();
		T = new int[q];
		for (int i = 0; i < q; i++) {
			T[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < q; j++) {
				if (T[i] == S[j]) {
					count += 1;
					break;
				}
			}
		}

		System.out.println(count);
	}

}