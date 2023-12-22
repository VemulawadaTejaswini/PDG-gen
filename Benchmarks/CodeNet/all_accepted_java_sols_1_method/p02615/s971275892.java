import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static long N;
	public static long[] A;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextLong();
		A = new long[(int) N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);

		long score = A[(int) N - 1];
		long idx = N - 2;
		boolean second = false;
		for (int i = 2; i < N; i++) {
			score += A[(int) idx];
			if (second)
				idx--;
			second = !second;
		}
		System.out.println(score);
	}
}
