import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}

		Arrays.sort(A);

		boolean flag = false;
		for (int i = 0; i < N - 1; i++) {
			if (A[i] == A[i + 1]) {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}
}