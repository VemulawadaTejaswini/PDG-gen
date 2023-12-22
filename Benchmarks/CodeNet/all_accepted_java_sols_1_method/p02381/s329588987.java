import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				int n = sc.nextInt();
				if (n == 0)
					break;
				int[] scores = new int[n];
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					scores[i] = sc.nextInt();
					sum += scores[i];
				}
				double average = 0, vanance = 0;
				average = (double) sum / scores.length;
				for (int i = 0; i < scores.length; i++) {
					vanance += (scores[i] - average) * (scores[i] - average) / scores.length;
				}
				System.out.println(Math.sqrt(vanance));

			}
		}
	}

}
