
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long[] A = new long[N+1];
		long[] B = new long[N];

		for (int i = 0; i < N+1; i++) {
			A[i] = sc.nextLong();
		}

		for (int i = 0; i < N; i++) {
			B[i] = sc.nextLong();
		}

		long ans = 0;

		for (int i = N - 1; i >= 0 ; i--) {
			if (A[i+1] >= B[i]) {
				A[i+1] -= B[i];
				ans+=B[i];
			}else {
				B[i] -= A[i+1];
				ans += A[i+1];
				A[i+1] = 0;
				if (A[i] >= B[i]) {
					A[i] -= B[i];
					ans+=B[i];
				}else {
					B[i] -= A[i];
					ans += A[i];
					A[i] = 0;
				}
			}
		}

		System.out.println(ans);

	}
}
