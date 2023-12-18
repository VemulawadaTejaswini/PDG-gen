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
			// ?????????average??¨?????£variance????¨????
			double average = 0, variance = 0, total = 0;
			for (int i = 0; i < scores.length; i++) {
				total = total + n;
			}
			average = total / scores.length;
			for (int i = 1; i < scores.length; i++) {
				total = Math.pow((n - average), 2) + total;
			}
			variance = total / scores.length;
			System.out.println(Math.sqrt(variance));
		}
	}

}