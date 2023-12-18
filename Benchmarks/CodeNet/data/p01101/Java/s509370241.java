import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (n == 0 && m == 0) {
				break;
			}
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scan.nextInt();
			}
			int sum = 0;
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					if (sum < a[i] + a[j] && m >= a[i] + a[j]) {
						sum = a[i] + a[j];
					}
				}
			}
			if (sum == 0) {
				System.out.println("NONE");
			} else {
				System.out.println(sum);
			}
		}
	}
}

