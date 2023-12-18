import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] scores = new int[n];
			for (i = 0; i < scores.length; i++) {
				scores[i] = sc.nextInt();
			}
			double ave = 0, variance = 0;
			for (i = 0; i < scores.length; i++) {
				ave += scores[i];
			}
			ave /= n;
			for (i = 0; i < scores.length; i++) {
				variance = (scores[i] - ave) * (scores[i] - ave);
			}
			variance /= n;
			System.out.println(Math.sqrt(variance));
		}
	}
}