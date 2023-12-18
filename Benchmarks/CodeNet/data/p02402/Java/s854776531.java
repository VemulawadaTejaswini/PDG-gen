import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		long max = 0;
		long min = 1000000;
		long sum = 0;
		for (int i = 0; i < n; i++)
			sum += a[i];
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min + " " + max + " " + sum);
	}
}
