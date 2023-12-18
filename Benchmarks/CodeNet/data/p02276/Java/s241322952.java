import java.util.Scanner;

public class Main {
	public static int partition(int[] A, int p, int r) {
		int x = A[r];
		int i = p - 1;
		int oki = 0;
		for (int j = p; j < r; j++) {
			if (A[j] <= x) {
				i = i + 1;
				oki = A[i];
				A[i] = A[j];
				A[j] = oki;
			}
		}
		oki = A[i + 1];
		A[i + 1] = A[r];
		A[r] = oki;
		return i + 1;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
		}
		int r = n - 1;
		int partition = partition(A, 0, r);
		System.out.print(A[0]);
		for (int i = 1; i < n; i++) {
			if (i == partition) {
				System.out.print(" [" + A[partition] + "]");
			} else {
				System.out.print(" " + A[i]);
			}
		}
		System.out.println();
		scanner.close();
	}

}
