import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Card {
	String character;
	int num;

	public Card(String character, int num) {
		this.character = character;
		this.num = num;
	}

	@Override
	protected Card clone() {
		return new Card(this.character, this.num);
	}
}

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Card[] bCards = new Card[Integer.parseInt(br.readLine())];
		Card[] sCards = new Card[bCards.length];
		String[] strs = br.readLine().split(" ");
		for (int i = 0; i < bCards.length; i++) {
			bCards[i] = new Card(strs[i].substring(0, 1), Integer.parseInt(strs[i].substring(1, 2)));
			sCards[i] = bCards[i].clone();
		}

		bubbleSort(bCards);
		selectionSort(sCards);
		StringBuilder bSb = new StringBuilder();
		StringBuilder sSb = new StringBuilder();
		for (int i = 0 ; i < bCards.length; i++) {
			if (i > 0) {
				bSb.append(" ");
				sSb.append(" ");
			}
			bSb.append(bCards[i].character + bCards[i].num);
			sSb.append(sCards[i].character + sCards[i].num);
		}
		System.out.println(bSb.toString() + "\n" + "Stable");
		if (bSb.equals(sSb)) {
			System.out.println(sSb.toString() + "\n" + "Stable");
		} else {
			System.out.println(sSb.toString() + "\n" + "Not stable");
		}
	}

	public static void bubbleSort(Card[] cards) {
		for (int i = 0; i < cards.length; i++) {
			for (int j = cards.length - 1; j > 0; j--) {
				if (cards[j].num < cards[j - 1].num) {
					swapCard(cards[j], cards[j - 1]);
				}
			}
		}
	}

	public static void selectionSort(Card[] cards) {
		for (int i = 0; i < cards.length; i++) {
			int minIdx = i;
			for (int j = i + 1; j < cards.length; j++) {
				if (cards[minIdx].num > cards[j].num) {
					minIdx = j;
				}
			}
			if (i == minIdx) continue;
			swapCard(cards[i], cards[minIdx]);
		}
	}

	public static void swapCard(Card card1, Card card2) {
		int num = card1.num;
		String character = card1.character;
		card1.num = card2.num;
		card1.character = card2.character;
		card2.num = num;
		card2.character = character;
	}
}