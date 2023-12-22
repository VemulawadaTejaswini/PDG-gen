import java.util.Scanner;

public class Main {



	public static void bubble_sort(int[] a) {
		int num_swaps = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j >= i+1; j--) {
				if (a[j] < a[j-1]) {
					int tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
					num_swaps++;
				}
			}
		}
		display(a);
		System.out.println(num_swaps);
	}

	public static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1)
				System.out.print(" ");
			else
				System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		bubble_sort(a);
	}

}

