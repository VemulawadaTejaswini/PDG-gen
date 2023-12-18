import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n, k;
		int sum;
		int total;
		
		n = scanner.nextInt();
		k = scanner.nextInt();
		while (n + k != 0) {
			sum = 0;
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			for (int i = 0; i < n - k + 1; i++) {
				total = 0;
				for (int j = i; j < i + k; j++) {
					total += a[j];
				}
				if (sum < total) {
					sum = total;
				}
			}
			System.out.println(sum);
			n = scanner.nextInt();
			k = scanner.nextInt();
		}
	}
}