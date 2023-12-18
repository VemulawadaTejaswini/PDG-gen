import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			double average = 0, variance = 0, sum = 0, bun = 0;
			if (n == 0) {
				break;
			}
			int[] scores = new int[n];
			for (int i = 0; i < scores.length; i++) {
				scores[i] = sc.nextInt();
				sum = sum + scores[i];
			}
			average = sum / scores.length;
			for (int i = 0; i < scores.length; i++) {
				bun = bun + (scores[i] - average) * (scores[i] - average);
			}
			variance = bun / scores.length;

			System.out.println(Math.sqrt(variance));
		}

	}
}