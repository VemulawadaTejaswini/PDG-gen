import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int A[] = new int[size];
		int B[] = new int[size + 1];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		countingSort(A, B, 10001);
	}

	static void countingSort(int[] A, int[] B, int k) {
		int C[] = new int[k];
		int aLength = A.length;
		int bLength = B.length;
		
		for (int i = 0; i < k; i++) {
			C[i] = 0;
		}
		for (int i = 0; i < aLength; i++) {
			C[A[i]] = C[A[i]]++;
		}
		for (int i = 1; i < k; i++) {
			C[i] = C[i] + C[i - 1];
		}
		for (int i = aLength - 1; i >= 0; i--) {
			int p = A[i];
			B[C[p]] = p;
			C[p] = C[p]--;
		}
		for (int i = 1; i < bLength; i++) {
			if (i == bLength - 1) {
				System.out.println(B[i]);
			} else {
				System.out.print(B[i] + " ");
			}
		}
	}

}