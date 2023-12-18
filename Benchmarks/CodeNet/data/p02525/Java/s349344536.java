import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int sum = 0;
			if (n == 0)
				break;
			int[] scores = new int[n];
			for (int i = 0; i < scores.length; i++) {
				scores[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				sum += scores[i];
			}
			double ave = sum / scores.length;
			double sum2 = 0;

			for (int i = 0; i < n; i++) {
				sum2 += (scores[i] - ave) * (scores[i] - ave);
			}
			System.out.printf("%.8f\n", Math.sqrt(sum2 / n));
		}
	}

}