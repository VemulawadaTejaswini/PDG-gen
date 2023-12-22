import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}

		sc.close();

		//
		long result = 0;
		for (int i = 1; i < N; i++) {
			if (A[i - 1] <= A[i]) {
				// result = result;
			} else {
				result = result + (A[i - 1] - A[i]);
				A[i] = A[i - 1];
			}
		}
		System.out.println(result);
	}
}
