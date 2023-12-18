import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[];
		int count;

		n = sc.nextInt();
		while (n != 0) {
			a = new int[n];
			count = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if (a[i] == 0) {
					count++;
				}
				if (i % 2 == 1) {
					count = f(a, i, count);
				}
			}
			System.out.println(count);
			n = sc.nextInt();
		}
	}

	public static int f(int a[], int n, int count) {
		for (int i = n - 1; 0 <= i; i--) {
			if (a[i] == a[n]) {
				break;
			}
			a[i] = a[n];
			if (a[i] == 0) {
				count++;
			} else {
				count--;
			}
		}
		return count;
	}
}