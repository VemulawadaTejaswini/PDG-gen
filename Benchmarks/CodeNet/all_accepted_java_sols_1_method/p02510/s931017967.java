import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String input = sc.next();

			if (input.equals("-")) {
				break;
			}

			int len = input.length();
			char[] cards = new char[len];

			for (int i = 0; i < len; i++) {
				cards[i] = input.charAt(i);
			}

			int m = sc.nextInt();
			int[] h = new int[m];

			for (int i = 0; i < m; i++) {
				h[i] = sc.nextInt();

				char[] tmp = new char[h[i]];

				for (int j = 0; j < h[i]; j++) {
					tmp[j] = cards[j];
				}

				for (int k = 0; k < len - h[i]; k++) {
					cards[k] = cards[h[i] + k];
				}

				for (int l = 0; l < h[i]; l++) {
					cards[len - h[i] + l] = tmp[l];
				}
			}

			for (int i = 0; i < len; i++) {
				System.out.printf("%c", cards[i]);
			}

			System.out.print("\n");
		}
	}
}