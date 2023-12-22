import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int alice = 0;
		int bob = 0;
		Arrays.sort(a);
		for (int i = n - 1; i >= 0; i--) {
			if (i % 2 == (n - 1) % 2) {
				alice = alice + a[i];
			} else {
				bob += a[i];
			}
		}

		System.out.println(alice-bob);
	}
}