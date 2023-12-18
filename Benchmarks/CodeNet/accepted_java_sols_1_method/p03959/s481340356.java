import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] T = new int[N + 2];
		int[] A = new int[N + 2];
		for (int i = 1; i <= N; i++) {
			T[i] = sc.nextInt();
		}
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();

		boolean wrong = false;
		int[] min = new int[N + 1];
		int[] max = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			if (T[i] > T[i - 1]) {
				max[i] = T[i];
				min[i] = T[i];
			} else {
				max[i] = max[i - 1];
				min[i] = 1;
			}
		}
		for (int i = N; i >= 1; i--) {
			if (A[i] > A[i + 1]) {
				if (max[i] >= A[i] && A[i] >= min[i]) {
					max[i] = A[i];
					min[i] = A[i];
				} else {
					wrong = true;
					break;
				}
			} else {
				if (A[i] < min[i]) {
					wrong = true;
					break;
				} else {
					max[i] = Math.min(A[i], max[i]);
				}
			}
		}
		long ans = 1;
		long P = 1000000007;
		if (wrong == false) {
			for (int i = 1; i <= N; i++) {
				long a = max[i] - min[i] + 1;
				ans = (ans * a) % P;
			}
		} else {
			ans = 0;
		}
		System.out.println(ans);
	}
}
