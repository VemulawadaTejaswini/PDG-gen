import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void print_ary(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}

	public static void my_insertion_sort(int[] a) {
		print_ary(a);
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
			print_ary(a);
		}
	}

	public static void main(String[] args) {
		// Collect input
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		// Sort
		my_insertion_sort(a);
	}

}

