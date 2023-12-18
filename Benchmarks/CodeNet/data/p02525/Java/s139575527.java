import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
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
			int sum = 0;
			double average = 0, variance = 0;
			for (int j = 0; j < scores.length; j++) {
				sum = sum + scores[j];
			}
			average = sum / scores.length;
			double a = 0, b = 0;
			for (int l = 0; l < scores.length; l++) {
				a = a + (scores[l] - average) * (scores[l] - average);
			}
			b = a / n;
			variance = Math.sqrt(b);
			System.out.printf("%f\n", variance);
		}
	}

}