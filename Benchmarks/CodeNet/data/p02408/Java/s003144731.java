import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		char[] marks = {'S', 'H', 'C', 'D'};

		for(char mark : marks) {
			for (int i = 1; i <= 13; i++) {
				Card.allCards.add(new Card(mark, i));
			}
		}

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Card hand = new Card(sc.nextLine().charAt(0), Integer.parseInt(sc.nextLine()));
			for (Card card : Card.allCards) {
				if (card.equals(hand)) {
					card.boo = true;
				}
			}
		}

		for (Card card : Card.allCards) {
			if (!card.boo) {
				Card.print();
			}
		}
	}
}

class Card {
	char mark;
	int rank;
	boolean boo = false;
	static List<Card> allCards = new ArrayList<Card>();

	static void print() {
		for (Card card : allCards) {
			System.out.println(card.mark + " " + card.rank);
		}
	}

	Card(char mark, int rank) {
		this.mark = mark;
		this.rank = rank;
	}
}