import java.util.Scanner;

public class Main {

	public static int judge = 0;

	public static int breakcount = 0;

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		Card[] cards = new Card[n];

		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			cards[i] = new Card(line.substring(0, 1), Integer.parseInt(line
					.substring(2)), i);
		}

		quicksort(cards, 0, n - 1);

		for (int i = 0; i < n - 1; i++) {
			if (cards[i].num == cards[i + 1].num
					&& cards[i].ord > cards[i + 1].ord) {
				judge++;
				break;

			}
		}

		if (judge > 0) {
			System.out.println("Not stable");
		} else {
			System.out.println("Stable");
		}

		for (int i = 0; i < n; i++) {
			StringBuilder kari = new StringBuilder();
			kari.append(cards[i].str);
			kari.append(" ");
			kari.append(cards[i].num);
			System.out.println(kari);
		}
	}

	public static int partition(Card[] c, int p, int r) {
		int x = c[r].num;
		int i = p - 1;
		Card kari = new Card(null, 0, 0);
		for (int j = p; j < r; j++) {

			if (c[j].num <= x) {
				i++;
				kari = c[i];
				c[i] = c[j];
				c[j] = kari;

			}

		}

		kari = c[i + 1];
		c[i + 1] = c[r];
		c[r] = kari;

		return i + 1;
	}

	public static void quicksort(Card[] c, int p, int r) {
		if (p < r) {
			int q = partition(c, p, r);
			quicksort(c, p, q - 1);
			quicksort(c, q + 1, r);
		}
	}
}

class Card {

	String str;
	int num;
	int ord;

	public Card(String str, int num, int ord) {
		super();
		this.str = str;
		this.num = num;
		this.ord = ord;
	}
}