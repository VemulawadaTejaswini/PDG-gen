import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int sum = 0;
			double sum2 = 0;
			if (n == 0) {
				break;
			}
			int[] scores = new int[n];
			for (int i = 0; i < scores.length; i++) {
				scores[i] = sc.nextInt();
			}
			double average = 0, variance = 0;
			for (int i = 0; i < scores.length; i++) {
				sum += scores[i];
			}
			average = (double) sum / n;
			for (int j = 0; j < scores.length; j++) {
				sum2 += (scores[j] - average) * (scores[j] - average);
			}
			variance = (double) sum2 / n;
			System.out.println(Math.sqrt(variance));
		}
	}
}