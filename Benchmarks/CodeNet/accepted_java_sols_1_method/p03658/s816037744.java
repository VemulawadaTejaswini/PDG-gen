import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x[] = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}

		Arrays.sort(x);

		int sum = 0;
		for (int i = n - 1; n - 1 - i < k; i--) {
			sum += x[i];
		}

		System.out.println(sum);


		sc.close();

	}

}