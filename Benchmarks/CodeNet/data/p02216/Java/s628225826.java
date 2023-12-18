import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N;

	public static void main(String[] args) {
		N = sc.nextInt();
		long[] A = new long[N];
		long sum = 0;
		long min = Long.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			sum += A[i];
			min = Math.min(min, A[i]);
		}
		if (N % 2 == 1) {
			System.out.println(sum % 2 == 1 ? "First" : "Second");
		} else {
			if (min % 2 == 1) {
				System.out.println("First");
			} else {
				System.out.println(sum % 2 == 1 ? "First" : "Second");
			}
		}
	}
}

