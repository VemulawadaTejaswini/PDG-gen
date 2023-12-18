import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];

		long gokei = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			gokei += a[i] % 1000000007;
			gokei = gokei  % 1000000007;
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i] * (gokei - a[i]) % 1000000007;
			gokei -= a[i];
			sum = sum % 1000000007;
		}

		System.out.println(sum);

		sc.close();

	}

}