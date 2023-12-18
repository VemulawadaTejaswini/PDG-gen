import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];

		long gokei = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			gokei += a[i];
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			gokei -= a[i];
			sum = sum + (a[i] * gokei) % 1000000007;
			sum = sum % 1000000007;
		}

		System.out.println(sum);

		sc.close();

	}

}