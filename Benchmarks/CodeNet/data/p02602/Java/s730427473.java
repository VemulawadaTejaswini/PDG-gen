import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		sc.close();

		for (int i = K; i < N; i++) {
			long p = A[i];
			long m = A[i - K];

			if (p > m) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
