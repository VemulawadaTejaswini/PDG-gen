import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long T = sc.nextLong();
		long[] input = new long[N];
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextLong();
		}
		long sum = T;
		for (int i = 0; i < N - 1; i++) {
			long next = input[i + 1] - input[i];
			sum += Math.min(T, next);
		}
		System.out.println(sum);

	}

}