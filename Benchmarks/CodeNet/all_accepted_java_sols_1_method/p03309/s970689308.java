import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			A[i] = a - (i + 1);
		}

		Arrays.sort(A);

		int median = (N - 1) / 2;
		long answer = 0;

		for (int i = 0; i < N; i++) {
			answer += (long)Math.abs(A[i] - A[median]);
		}

		System.out.println(answer);
	}
}
