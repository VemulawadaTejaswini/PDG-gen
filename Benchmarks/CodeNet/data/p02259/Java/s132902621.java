import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		bubbleSort(A, N);
		sc.close();
	}

	public static void bubbleSort(int[] A, int N) {
		int count = 0;
		for (int i = 0; i <= N; i++) {
			for (int j = N - 1; j >= i + 1; j--) {
				if (A[j] < A[j - 1]) {
					int tmp = A[j];
					A[j] = A[j - 1];
					A[j - 1] = tmp;
					count++;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(A[i]);
		}
		System.out.printf("\n");
		System.out.println(count);
	}
}

