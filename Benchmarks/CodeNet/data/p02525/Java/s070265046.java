import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int i, Sum = 0;
			double Sum2 = 0;
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] scores = new int[n];
			for (i = 0; i < scores.length; i++) {
				scores[i] = sc.nextInt();
			}
			double average = 0, variance = 0;
			for (i = 0; i < scores.length; i++) {
				Sum = Sum + scores[i];
			}
			average = Sum / n;
			for (i = 0; i < scores.length; i++) {
				Sum2 = Sum2 + (scores[i] - average) * (scores[i] - average);
			}
			variance = Sum2 / n;
			System.out.println(Math.sqrt(variance));
		}
	}

}