
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long[] A = new long[N * 3];

		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextLong();
		}

		Arrays.sort(A);

		long sum = 0;

		for (int i = N; i < A.length; i+=2) {
			sum += A[i];
		}

		System.out.println(sum);

	}
}
