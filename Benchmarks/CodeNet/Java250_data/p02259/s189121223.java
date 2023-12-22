import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = n-1; i >= 0; i--) {
			for (int j = n-1; j > 0; j--) {
				int tmp = a[j];
				if (a[j] < a[j-1]) {
					a[j] = a[j-1];
					a[j-1] = tmp;
					count++;
				}
			}
		}
		print(a);
		System.out.println(count);

	}
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length-1) {
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}

}

