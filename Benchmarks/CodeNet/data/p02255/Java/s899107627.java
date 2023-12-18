import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] temoti = new int[N];
		for (int i = 0; i < N; i++) {
			temoti[i] = scan.nextInt();
		}
		insertionSort(temoti, N);
	}

	public static void insertionSort(int[] A, int N) {
		for (int i = 0; i < N; i++) {
			int v = A[i]; // 1枚取り出す
			int j = i - 1;
			while (j >= 0 && A[j] > v) {// 取り出した一枚より前の方に持っていたカードと比較
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = v;
			for (int k = 0; k < N; k++) {
				if (k == N - 1) {
					System.out.print(A[k]);
				} else {
					System.out.print(A[k] + " ");
				}
			}
			System.out.println("");
		}

	}
}

