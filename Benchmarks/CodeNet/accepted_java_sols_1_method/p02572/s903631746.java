
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		long[] B = new long[N - 1];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		B[0] = A[N-1];
		for (int i = N-2; i > 0; i--) {
			B[(N - 1) - i] = (A[i] + B[(N - 1) - i - 1] ) % 1000000007;
		}
		long ans = 0;
		for (int i = 0; i < N-1; i++) {
			long let = (A[i] * B[N-2-i]) % 1000000007;
			ans = (ans + let) % 1000000007;
		}

		System.out.println(ans);
	}

}