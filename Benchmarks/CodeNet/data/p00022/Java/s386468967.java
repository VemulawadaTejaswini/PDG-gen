import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[];
		long sum;
		long max;

		n = sc.nextInt();
		while (n != 0) {
			a = new int[n];
			sum = 0L;
			max = 0L;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			for (int i = 0; i < n; i++) {
				sum = a[i];
				max = (i == 0) ? sum : max;
				max = (max < sum) ? sum : max;
				for (int j = i + 1; j < n; j++) {
					sum += a[j];
					max = (max < sum) ? sum : max;
				}
			}

			System.out.println(max);
			n = sc.nextInt();
		}
	}
}