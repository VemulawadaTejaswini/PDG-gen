import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		print(a);
		insertionSort2(a);

	}

	static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length-1) {
				System.out.print(" ");
			} else {
				System.out.print("\n");
			}
		}
	}

	static void insertionSort1(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if (a[i] < a[j]) {
					int tmp = a[i];
					for (int k = i - 1; k >= j; k--) {
						a[k+1] = a[k];
					}
					a[j] = tmp;
				}
			}
			print(a);
		}
	}
	static void insertionSort2(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int v = a[i];
			int j = i-1;
			while (j >= 0 && a[j] > v) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = v;
			print(a);
		}
	}

}
