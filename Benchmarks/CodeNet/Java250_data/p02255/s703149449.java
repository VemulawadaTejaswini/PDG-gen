import java.util.Scanner;

public class Main {

	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);

			if (i != a.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] A = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}

		printArray(A);
		for (int i = 1; i < n; i++) {
			int key = A[i];
			int j;
			for (j = i - 1; j >= 0 && A[j] > key; j--) {
				A[j+1] = A[j];
			}
			A[j+1] = key;
			printArray(A);
		}

		scan.close();
	}

}