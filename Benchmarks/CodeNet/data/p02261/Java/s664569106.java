import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] c = br.readLine().split(" ");

		Card cb[];
		cb = new Card[n];
		for (int i = 0; i < n; i++) {
			cb[i] = new Card(c[i].charAt(0), Character.getNumericValue(c[i].charAt(1)));
		}

		Card cs[];
		cs = cb.clone();

		cb = bubble(cb, n);
		cs = selection(cs, n);

		for (int i = 0; i < n; i++) {
			System.out.print(cb[i].suit + String.valueOf(cb[i].value) + " ");
		}
		System.out.println("\nStable");
		for (int i = 0; i < n; i++) {
			System.out.print(cs[i].suit + String.valueOf(cs[i].value) + " ");
		}
		if (isStable(cb, cs)) {
			System.out.println("\nStable");
		} else {
			System.out.println("\nNot stable");
		}
	}

	private static Card[] bubble(Card[] c, int n) {
		Card t;
		int i = 0;
		boolean flag = true;

		while(flag) {
			flag = false;

			for (int j = i + 1; j < n; j++) {
				if (c[j].value < c[i].value) {
					t = c[j];
					c[j] = c[i];
					c[i] = t;
					flag = true;
				}
			}

			i++;
		}

		return c;
	}

	private static Card[] selection(Card[] c, int n) {
		Card t;

		for (int i = 0; i < n; i++) {
			int minj = i;

			for (int j = i + 1; j < n; j++) {
				if (c[j].value < c[minj].value) {
					minj = j;
				}
			}

			if (minj != i) {
				t = c[i];
				c[i] = c[minj];
				c[minj] = t;
			}
		}

		return c;
	}

	private static boolean isStable(Card[] c1, Card[] c2) {
		for (int i = 0; i < c1.length; i++) {
			if (c1[i].suit != c2[i].suit) {
				return false;
			}
		}

		return true;
	}
}

final class Card {
	public char suit;
	public int value;

	public Card(char suit, int value) {
		this.suit = suit;
		this.value = value;
	}
}
