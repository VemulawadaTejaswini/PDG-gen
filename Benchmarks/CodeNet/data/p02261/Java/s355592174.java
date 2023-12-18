import java.util.Scanner;

public class Main {
	private static int n;

	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Card[] inputCards = new Card[n];
		for (int i = 0; i < n; i++) {
			inputCards[i] = new Card(sc.next());
		}
		sc.close();

		Card[] bubbleSortedCards = bubbleSort(inputCards);
		StringBuilder bubbleSb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			bubbleSb.append(bubbleSortedCards[i].toString());
			if (i != n - 1) {
				bubbleSb.append(" ");
			}
		}

		Card[] selectionSortedCards = selectionSort(inputCards);
		StringBuilder selectionSb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			selectionSb.append(selectionSortedCards[i].toString());
			if (i != n - 1) {
				selectionSb.append(" ");
			}
		}


		System.out.println(bubbleSb.toString());
		System.out.println("Stable");
		System.out.println(selectionSb.toString());
		System.out.println(isStable(bubbleSortedCards, selectionSortedCards));
	}

	private static Card[] bubbleSort(Card[] in) {
		Card[] out = new Card[n];
		System.arraycopy(in, 0, out, 0, n);

		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = n - 1; i > 0; i--) {
				if (out[i].getNumber() < out[i - 1].getNumber()) {
					Card tmp = out[i - 1];
					out[i - 1] = out[i];
					out[i] = tmp;
					flag = true;
				}
			}
		}
		return out;
	}

	private static Card[] selectionSort(Card[] in) {
		Card[] out = new Card[n];
		System.arraycopy(in, 0, out, 0, n);

		for (int i = 0; i < n; i++) {
			int minIdx = i;
			for (int j = i; j < n; j++) {
				if (out[minIdx].getNumber() > out[j].getNumber()) {
					minIdx = j;
				}
			}
			if (i != minIdx) {
				Card tmp = out[i];
				out[i] = out[minIdx];
				out[minIdx] = tmp;
			}
		}
		return out;
	}

	private static String isStable(Card[] in1, Card[] in2) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int x = 0; x < n - 1; x++) {
					for (int y = x + 1; y < n; y++) {
						if (in1[i].getNumber() == in1[j].getNumber() && in2[x].getNumber() == in2[y].getNumber()) {
							if (in1[i].getSuit() == in2[y].getSuit()) {
								return "Not stable";
							}
						}
					}
				}
			}
		}
		return "Stable";
	}
}

class Card {
	private String suit;
	private int number;
	public Card(String input) {
		this.suit   = input.substring(0, 1);
		this.number = Integer.parseInt(input.substring(1));
	}
	public String getSuit() {
		return suit;
	}
	public int getNumber() {
		return number;
	}
	public String toString() {
		return this.suit + this.number;
	}
}