import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static class Card {
		String mark;
		int num;
		int order;
		public Card(String mark, int num, int order) {
			this.mark = mark;
			this.num = num;
			this.order = order;
		}
		public String toString() {
			return String.format("%s %d", mark, num);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Card[] cards = new Card[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			String mark = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			cards[i] = new Card(mark, num, i);
		}
		reader.close();
		
		quickSort(cards, 0, n - 1);
		boolean stable = checkStability(cards);
		if (stable) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}		
		for (Card card : cards) {
			System.out.println(card);
		}
	}

	private static boolean checkStability(Card[] cards) {		
		for (int i = 1; i < cards.length; i++) {
			Card c1 = cards[i - 1];
			Card c2 = cards[i];
			if (c1.num == c2.num && c1.order > c2.order) {
				return false;
			}
		}		
		return true;
	}

	private static void quickSort(Card[] cards, int p, int r) {
		if (p < r) {
			int q = partition(cards, p, r);
			quickSort(cards, p, q - 1);
			quickSort(cards, q + 1, r);
		}
	}

	private static int partition(Card[] cards, int p, int r) {
		int x = cards[r].num;
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (cards[j].num <= x) {
				i ++;
				swap(cards, i, j);
			}
		}
		swap(cards, i + 1, r);
		return i + 1;
	}

	private static void swap(Card[] cards, int i, int j) {
		Card tmp = cards[i];
		cards[i] = cards[j];
		cards[j] = tmp;
	}	
}
