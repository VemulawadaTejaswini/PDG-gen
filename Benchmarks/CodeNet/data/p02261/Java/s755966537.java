import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Card[] card1 = new Card[n];

		for (int i = 0; i < n; i++) {
			card1[i] = new Card();
			String str = sc.next();
			card1[i].suit = str.substring(0, 1);
			card1[i].rank = Integer.valueOf(str.substring(1, 2));
		}

		Card[] card2 = card1.clone();

		bubble(card1, n);
		selection(card2, n);

		for (int i = 0; i < n; i++) {
			System.out.print(i==0 ? "" : " ");
			System.out.print(card1[i]);
		}
		System.out.println();
		System.out.println("Stable");

		boolean isStable = true;

		for (int i = 0; i < n; i++) {
			if (!(card1[i].suit.equals(card2[i].suit))) {
				isStable = false;
				break;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(i==0 ? "" : " ");
			System.out.print(card2[i]);
		}
		System.out.println();
		System.out.println(isStable ? "Stable" : "Not stable");

	}

	static void bubble(Card[] card, int n) {
		Card temp = null;
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				if (card[j].rank < card[j - 1].rank) {
					temp = card[j];
					card[j] = card[j - 1];
					card[j - 1] = temp;
				}
			}
		}

	}

	static void selection(Card[] card, int n) {
		Card temp = null;
		for (int i = 0; i < n; i++) {
			int minj = i;
			for (int j = i; j < n; j++) {
				if (card[j].rank < card[minj].rank) {
					minj = j;
				}
			}
			temp = card[i];
			card[i] = card[minj];
			card[minj] = temp;
		}

	}
}

class Card {
	String suit;
	int rank;

	public String toString() {
		return this.suit + this.rank;
	}
}

