import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int count = 0;

		for (int i = 0; i < N; i++) {
			int minj = i;
			for (int j = i; j < N; j++) {
				if (A[j] < A[minj]) {
					int x = A[j];
					A[j] = A[minj];
					A[minj] = x;
					count++;
				}
			}
		}
		for (int i = 0; i < N - 1; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println(A[N - 1]);
		System.out.print(count / 3);
		System.out.printf("\n");

	}
}
