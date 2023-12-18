import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int r = sc.nextInt();

			if (n == 0 && r == 0) {
				break;
			}

			int[] cards = new int[n];

			for (int i = 0; i < cards.length; i++) {
				cards[i] = cards.length - i;
			}

			for (int i = 0; i < r; i++) {
				int p = sc.nextInt();
				int c = sc.nextInt();

				int[] change1 = new int[p - 1];
				int[] change2 = new int[c];

				for (int j = 0; j < change1.length; j++) {
					change1[j] = cards[j];
				}

				for (int j = 0; j < change2.length; j++) {
					change2[j] = cards[change1.length + j];
				}

				for (int j = 0; j < change2.length; j++) {
					cards[j] = change2[j];
				}

				for (int j = 0; j < change1.length; j++) {
					cards[change2.length + j] = change1[j];
				}
			}
			System.out.printf("%d\n", cards[0]);

		}
		sc.close();
	}
}