import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N + 1];
		long[] B = new long[N];
		for(int i = 0; i < N + 1; i++) {
			A[i] = sc.nextLong();
		}
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextLong();
		}
		long sum = 0;
		for(int i = 0; i < N; i++) {
			if(A[i] > B[i]) {
				sum += B[i];
			}
			else {
				sum += A[i];
				long temp = A[i + 1];
				A[i + 1] -= B[i] - A[i];
				A[i + 1] = Math.max(A[i + 1], 0);
				sum += temp - A[i + 1];

			}
		}
		System.out.println(sum);
	}
}