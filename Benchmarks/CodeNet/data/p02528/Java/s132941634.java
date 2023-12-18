import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int c;
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (x[i] > x[j]) {
					c = x[i];
					x[i] = x[j];
					x[j] = c;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (i != n - 1) {
				System.out.print(x[i] + " ");
			} else {
				System.out.print(x[i]);
			}
		}
		System.out.println();
	}
}