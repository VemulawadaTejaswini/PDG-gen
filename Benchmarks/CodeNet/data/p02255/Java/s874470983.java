import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] A = inpNum(n);

		insertionSort(A);

	}

	private static void insertionSort(int[] A) {
		for (int i = 0; i < A.length; i++ ) {
			int v = A[i];
			int j = i - 1;

			while(j >= 0 && A[j] > v) {
				A[j+1] = A[j];
				j--;

			}

			A[j+1] = v;

			for (int k = 0; k < A.length; k++ ) {
				System.out.print(A[k]);
				if(k < A.length -1) {
					System.out.print(" ");
				}

			}
			System.out.println();


		}

	}

	private static int[] inpNum(int n) {
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		return nums;
	}

}

