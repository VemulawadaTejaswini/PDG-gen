import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int prime[] = new int[1000000];
		int n;
		int sum;

		Arrays.fill(prime, 1);
		prime[0] = 0;
		prime[1] = 0;
		for (int i = 2; i <= 1000000 / 2; i++) {
			for (int j = i * 2; j < 1000000; j += i) {
				prime[j] = 0;
			}
		}

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			sum = 0;
			for (int i = 0; i < n; i++) {
				int p = sc.nextInt();
				int m = sc.nextInt();
				for (int j = 0 <= p - m ? p - m : 0; j <= p + m && j < 1000000; j++) {
					sum += prime[j];
				}
			}
			System.out.println(sum - n);
		}
	}
}