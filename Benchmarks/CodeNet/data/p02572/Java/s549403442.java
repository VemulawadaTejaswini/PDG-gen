import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];

		long sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}

		sum = sum % 1000000007;
		
		long result = 0;
		for (int i = 0; i < n; i++) {
			sum -= a[i];
			result = (result + a[i] * sum) % 1000000007;
		}

		System.out.println(result);

		sc.close();

	}

}