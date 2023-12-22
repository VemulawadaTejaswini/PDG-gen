import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N+2];
		A[N+1] = A[0] = 0;
		int sum = 0;

		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 1; i <= N+1; i++) {
			sum += Math.abs(A[i-1] - A[i]);
		}

		for (int i = 1; i <= N; i++) {
			int ans = sum + Math.abs(A[i-1] - A[i+1]) - Math.abs(A[i-1] - A[i]) - Math.abs(A[i] - A[i+1]);
			System.out.println(ans);
		}
	}
}
