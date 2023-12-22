import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] scores = new int[10000];
		int maxscore, max = 0, minscore, min = 0, sum;

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			maxscore = 0;
			minscore = 1000;
			sum = 0;

			for (int i = 0; i < n; i++) {
				scores[i] = sc.nextInt();

				if (scores[i] <= minscore) {
					min = i;
					minscore = scores[i];
				}
				if (maxscore <= scores[i]) {
					max = i;
					maxscore = scores[i];
				}
			}
			for (int i = 0; i < n; i++) {
				if (i != min && i != max) {
					sum += scores[i];
				}
			}
			System.out.println(sum / (n - 2));
		}
	}
}