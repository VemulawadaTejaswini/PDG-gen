import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] scores = new int[n];
			for (int i = 0; i < scores.length; i++) {
				scores[i] = sc.nextInt();

			}
			double sum = 0, average = 0, variance = 0, ss = 0;
			for (int i = 0; i < scores.length; i++) {
				sum = sum + scores[i];
			}
			average = sum / scores.length;
			for (int i = 0; i < scores.length; i++) {
				ss = ss + (scores[i] - average) * (scores[i] - average);
			}
			variance = ss / scores.length;
			System.out.println(Math.sqrt(variance));
		}
	}
}