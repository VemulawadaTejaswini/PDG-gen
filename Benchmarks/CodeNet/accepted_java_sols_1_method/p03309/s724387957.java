import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			A[i] = A[i] - i;
		}

		Arrays.sort(A);

		int mid = (N % 2 == 0) ? A[N / 2 - 1] : A[N / 2];

		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += Math.abs(A[i] - mid);
		}

		System.out.println(ans);
	}
}