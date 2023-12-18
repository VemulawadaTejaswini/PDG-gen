import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			int n = s.nextInt();
			if (n == 0) {
				break;
			}
			int[] scores = new int[n];
			for (int i = 0; i < scores.length; i++) {
				scores[i] = s.nextInt();
			}
			double a = 0, v = 0;
			for (int k = 0; k < scores.length; k++) {
				a = a + (scores[k] / scores.length);
			}
			for (int l = 0; l < scores.length; l++) {
				v = v + Math.pow(scores[l] - a, 2) / scores.length;
			}

			System.out.println(Math.sqrt(v));
		}
	}
}