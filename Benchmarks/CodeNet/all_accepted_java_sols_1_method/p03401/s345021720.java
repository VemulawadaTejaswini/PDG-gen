import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[] A = new int[N+2];
		int sum = 0;
		A[N+1] = 0;
		A[0] = 0;
		for (int i = 1; i <= N; i++) {
			A[i] = reader.nextInt();
			sum += Math.abs(A[i-1] - A[i]);
		}
		sum += Math.abs(A[N] - A[N+1]);

		for (int i = 1; i <= N; i++) {
			int ans = sum;
			ans -= Math.abs(A[i-1] - A[i]);
			ans -= Math.abs(A[i+1] - A[i]);
			ans += Math.abs(A[i+1] - A[i-1]);
			System.out.println(ans);
		}
	}
}

