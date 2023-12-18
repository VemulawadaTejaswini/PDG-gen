import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] scores = new int[n];
			int i;
			for (i = 0; i < scores.length; i++) {
				scores[i] = sc.nextInt();
			}
			double av = 0, va = 0;
			int sum = 0;
			for (i = 0; i < scores.length; i++) {
				sum = sum + scores[i];
			}
			av = sum / scores.length;
			double wa = 0;
			for (i = 0; i < scores.length; i++) {
				wa = wa + (scores[i] - av) * (scores[i] - av);
			}
			va = wa / scores.length;
			System.out.println(va);
		}
	}
}