

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];

		for (int i = 0; i < N-1; i++) {
			A[i] = sc.nextInt();
		}

		int result = A[0];
		for (int i = 0; i < N - 1; i++) {
			result += Math.min(A[i], A[i+1]);
		}

		System.out.println(result + A[N - 2]);
	}
}
