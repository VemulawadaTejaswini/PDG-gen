import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a = new String[n];
		String[] b = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		b = a.clone();

		bubbleSort(a);
		selectionSort(b);
		print(a);
		System.out.println("Stable");
		print(b);
		if (a.equals(b)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}

	}
	static void print(String[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length-1) {
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}
	static void bubbleSort(String[] a) {
		int n = a.length;
		for (int i = n-1; i >= 0; i--) {
			for (int j = n-1; j > 0; j--) {
				String tmp = a[j];
				if (Integer.parseInt(a[j].substring(1, 2)) < Integer.parseInt(a[j-1].substring(1, 2))) {
					a[j] = a[j-1];
					a[j-1] = tmp;
				}
			}
		}
	}
	static void selectionSort(String[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int min = Integer.MAX_VALUE;
			int minj = 0;
			for (int j = i+1; j < n; j++) {
				if (min > Integer.parseInt(a[j].substring(1, 2))) {
					min = Integer.parseInt(a[j].substring(1, 2));
					minj = j;
				}
			}
			if (Integer.parseInt(a[i].substring(1, 2)) > min) {
				String tmp = a[i];
				a[i] = a[minj];
				a[minj] = tmp;
			}
		}
	}

}

