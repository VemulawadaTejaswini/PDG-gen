import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		int sw = bubbleSort(A);
		for (int i = 0; i < n; i++) {
			System.out.print(i!=(n-1) ? (A[i] + " ") : A[i] + "\n");
		}
		System.out.println(sw);

		sc.close();
	}

	static int bubbleSort(int[] A) {
		// 各要素を交換する
		// フラグがtrueの間やる
		int sw = 0; //交換した回数
		boolean flag = false;
		while (!flag) {
			flag = true;
			for (int i = A.length - 1; i > 0; i--) {
				if (A[i] < A[i-1]) {
					int w  = A[i];
					A[i]   = A[i-1];
					A[i-1] = w;
					flag = false;
					++sw;
				}
			}
		}
		return sw;
	}
}

