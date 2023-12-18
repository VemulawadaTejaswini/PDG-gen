import java.util.Scanner;

public class Main {

	final static int N = 3;
	public static int[] A;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		A = new int[N];
		int temp;

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		if (A[0] > A[1]) {
			temp = A[0];
			A[0] = A[1];
			A[1] = temp;
		}
		if (A[1] > A[2]) {
			temp = A[1];
			A[1] = A[2];
			A[2] = temp;
		}
		if (A[0] > A[1]) {
			temp = A[0];
			A[0] = A[1];
			A[1] = temp;
		}

		System.out.print(A[0]);
		for (int i = 1; i < N; i++) {
			System.out.print(" " + A[i]);
		}
		System.out.println();
	}
}
