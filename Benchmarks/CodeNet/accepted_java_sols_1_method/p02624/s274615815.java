import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		long sum = 0;
		for(long i = 1 ; i <= n ; i++) {
			sum += (((n / i) * i) + i) * (n / i) / 2;
		}

		System.out.println(sum);

	}
}

