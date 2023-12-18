import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		long[] x = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = 2 * sc.nextLong();
			if (i % 2 == 0) {
				x[0] += A[i];
			} else {
				x[0] -= A[i];
			}
		}
		x[0] /= 2;
		for (int i = N - 1; i > 0; i--) {
			x[i] = (A[i] - x[(i+1) % N]);
		}
		for (int i = 0; i < N; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
}