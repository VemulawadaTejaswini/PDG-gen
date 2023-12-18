import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		long B[] = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}

		System.arraycopy(A, 0, B, 0, N);
		Arrays.sort(A);
		long right = A[N / 2];
		long left = A[N / 2 - 1];

		for (int i = 0; i < N; i++) {
			if (B[i] <= left) {
				System.out.println(right);
			} else {
				System.out.println(left);
			}
		}

	}
}
