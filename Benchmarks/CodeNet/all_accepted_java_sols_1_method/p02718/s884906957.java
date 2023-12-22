import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];

		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}

		Arrays.sort(a);

		boolean can = true;;
		for (int i = 1; i <= m; i++) {
			if (a[n - i] < (double)sum / (double)(4 * m)) can = false;
		}

		if (can) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();

	}
}