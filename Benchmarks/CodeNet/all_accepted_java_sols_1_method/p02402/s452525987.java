import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long X[] = new long[10000];
		long sum = 0;
		long max, min;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			long temp = scan.nextLong();
			X[i] = temp;
			sum = X[i] + sum;
		}
		max = X[0];
		min = X[0];
		for (int i = 1; i < n; i++) {
			if (max < X[i]) {
				max = X[i];
			}
		}
		for (int i = 1; i < n; i++) {
			if (min > X[i]) {
				min = X[i];
			}
		}

		System.out.printf("%d %d %d\n", min, max, sum);

	}

}

