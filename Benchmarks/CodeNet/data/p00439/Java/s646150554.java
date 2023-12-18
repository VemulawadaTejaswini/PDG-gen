import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n, k;
		int sum;
		int total;
		int scan;
		
		n = scanner.nextInt();
		k = scanner.nextInt();
		while (n + k != 0) {
			sum = 0;
			int a[] = new int[k];
			for (int i = 0; i < k; i++) {
				a[i] = scanner.nextInt();
				sum += a[i];
			}
			total = sum;
			for (int i = 0; i < n - k; i++) {
				scan = scanner.nextInt();
				total += (scan - a[0]);
				if (sum < total) {
					sum = total;
				}
				for (int j = 0; j < k - 1; j++) {
					a[j] = a[j + 1];
				}
				a[a.length - 1] = scan;
			}
			System.out.println(sum);
			n = scanner.nextInt();
			k = scanner.nextInt();
		}
	}
}