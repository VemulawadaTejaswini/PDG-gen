import java.util.Scanner;


public class Main {
	void insertionSort(int[] a, int n) {
		System.out.print(a[0]);
		for (int k = 1; k < n; k++) {
			System.out.print(" " + a[k]);
		}
		System.out.println();
		for (int i = 1; i < n; i++) {
			int v = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > v) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = v;
			System.out.print(a[0]);
			for (int k = 1; k < n; k++) {
				System.out.print(" " + a[k]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();
		new Main().insertionSort(a, n);
	}
}