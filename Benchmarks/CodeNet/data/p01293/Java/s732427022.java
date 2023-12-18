import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			char T = sc.next().charAt(0);
			if (T == '#') {
				sc.close();
				break;
			}

			int[] points = new int[4];
			int[][] cards = new int[4][13];
			char[][] suits = new char[4][13];

			for (int i = 0; i < cards.length; i++) {
				for (int j = 0; j < cards[i].length; j++) {
					String card = sc.next();
					if (card.charAt(0) == 'T') {
						cards[i][j] = 10;
					} else if (card.charAt(0) == 'J') {
						cards[i][j] = 11;
					} else if (card.charAt(0) == 'Q') {
						cards[i][j] = 12;
					} else if (card.charAt(0) == 'K') {
						cards[i][j] = 13;
					} else if (card.charAt(0) == 'A') {
						cards[i][j] = 14;
					} else {
						cards[i][j] = Character.getNumericValue(card.charAt(0));
					}
					suits[i][j] = card.charAt(1);
				}
			}

			int winner = 0;
			for (int i = 0; i < cards[0].length; i++) {
				char field = suits[winner][i];
				for (int j = 0; j < cards.length; j++) {
					if (suits[j][i] == T) {
						cards[j][i] += 26;
					} else if (suits[j][i] == field) {
						cards[j][i] += 13;
					}
				}

				int max = 0;
				for (int j = 0; j < cards.length; j++) {
					if (cards[j][i] > max) {
						max = cards[j][i];
						winner = j;
					}
				}
				points[winner]++;
			}

			if (points[0] + points[2] > points[1] + points[3]) {
				System.out.println("NS " + (points[0] + points[2] - 6));
			} else {
				System.out.println("EW " + (points[1] + points[3] - 6));
			}
		}

	}
}