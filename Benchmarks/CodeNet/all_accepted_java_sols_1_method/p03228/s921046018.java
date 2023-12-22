

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long A = in.nextLong();
		long B = in.nextLong();
		int K = in.nextInt();
		for (int i = 1; i <= K; i++) {
			if (i % 2 == 1) {
				if (A % 2 == 1) {
					A = A - 1;
				} 
				A = A / 2;
				B = B + A ;
			}
			else if (i % 2 == 0) {
				if (B % 2 == 1) {
					B = B - 1;
				} 
				B = B / 2;
				A = A + B ;
			}
		}
		System.out.println(A);
		System.out.println(B);

	}
}
