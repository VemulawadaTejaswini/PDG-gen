import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		insertionSort(array, n);
		sc.close();
	}

	// 挿入ソート
	static void insertionSort(int[] a, int n) {
		showArray(a);
		for(int i = 1; i < n; i++) {
			int v = a[i];   // 挿入する要素の保存
			int j = i - 1;
			while(j >= 0 && a[j] > v) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = v;
			showArray(a);
		}
	}

	static void showArray(int[] a) {
		System.out.print(a[0]);
		for(int i = 1; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}
}

