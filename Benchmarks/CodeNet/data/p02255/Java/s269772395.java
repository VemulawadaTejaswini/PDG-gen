 import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 要素数
		int[] a = new int[n];
		// 初期化
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		printArray(a);
		new Main().insertionSort(a, n);

	}

	// 挿入ソート
	private void insertionSort(int[] a, int n) {

		for (int i = 1; i < a.length; i++) {
			int v = a[i]; // 未ソート部分列の先頭
			int j = i - 1;
			// ソート処理
			while (j >= 0 && a[j] > v) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = v;
			printArray(a);
		}
	}

	// 配列の中身を表示
	static private void printArray(int[] n) {
		for (int i = 0; i < n.length; i++) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(n[i]);
		}
		System.out.println();
	}
}

