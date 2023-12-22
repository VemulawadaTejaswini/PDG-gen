import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int diff[] = new int[N + 1];
		int sum = 0;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < N + 1; i++) {
			if (i == 0) {
				diff[i] = A[i] - 0;
			} else if (i == N) {
				diff[i] = 0 - A[i - 1];
			} else {
				diff[i] = A[i] - A[i - 1];
			}
			sum += Math.abs(diff[i]);
		}

		for (int i = 0; i < N; i++) {
			ans = sum - Math.abs(diff[i]) - Math.abs(diff[i + 1]);
			ans += Math.abs(diff[i] + diff[i + 1]);
			System.out.println(ans);
		}
	}
}
