import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] ws = new int[n];

		for (int i = 0; i < n; i++) {
			ws[i] = scn.nextInt();

		}

		scn.close();

		int min = 10001;
		for (int i = 0; i < n; i++) {
			int sum1 = 0;
			int sum2 = 0;
			for (int j = 0; j < i; j++) {
				sum1 += ws[j];
			}
			for (int j = i; j < n; j++) {
				sum2 += ws[j];
			}

			int dif = Math.abs(sum1 - sum2);

			if (dif < min) {
				min = dif;
			}

		}

		System.out.println(min);

	}
}