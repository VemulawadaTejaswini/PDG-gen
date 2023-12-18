import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		print(a);
		sort(a);
		scanner.close();
	}

	static void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int v = a[i];
			int j = i - 1;
			while ((j >= 0) && (a[j] > v)) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = v;
			print(a);
		}
	}

	static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

}

