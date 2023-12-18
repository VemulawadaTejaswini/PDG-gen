import java.util.Scanner;

public class Main {
	public static void insertionSort(int A[], int N) {
		for (int i = 1; i < N+1 ; i++) {
			for (int k = 0; k < N; k++) {
				if (k != N - 1) {
					System.out.print(A[k] + " ");
				} else {
					System.out.println(A[k]);

				}
			}

			int v = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > v) {
				A[j + 1] = A[j];
				
				j--;

			}A[j + 1] = v;
			

		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] A = new int[N+1];
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}
		insertionSort(A, N);

	}
}

