public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Card[] c1 = new Card[N];
		for (int i = 0; i < N; i++) {
			c1[i] = new Card();
		}
		for (int i = 0; i < N; i++) {
			String strC = sc.next();
			char[] chrC = strC.toCharArray();
			c1[i].setSuit(chrC[0]);
			c1[i].setValue(chrC[1]);
		}
		Card[] c2 = c1.clone();
		bubbleSort(c1, N);
		selectionSort(c2, N);
		print(c1, N);
		System.out.println("Stable");
		print(c2, N);
		if (isStable(c1, c2, N)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
		sc.close();
	}

	public static void bubbleSort(Card[] A, int N) {
		for (int i = 0; i < N; i++) {
			for (int j = N - 1; j >= i + 1; j--) {
				if (A[j].getValue() < A[j - 1].getValue()) {
					Card t = A[j];
					A[j] = A[j - 1];
					A[j - 1] = t;
				}
			}
		}
	}

	public static void selectionSort(Card[] A, int N) {
		for (int i = 0; i < N; i++) {
			int minj = i;
			for (int j = i; j < N; j++) {
				if (A[j].getValue() < A[minj].getValue()) {
					minj = j;
				}
			}
			Card t = A[i];
			A[i] = A[minj];
			A[minj] = t;
		}
	}

	public static void print(Card A[], int N) {
		for (int i = 0; i < N; i++) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(A[i].getSuit() + "" + A[i].getValue());
		}
		System.out.printf("\n");
	}

	public static boolean isStable(Card[] c1, Card[] c2, int N) {
		for (int i = 0; i < N; i++) {
			if (c1[i].getSuit() != c2[i].getSuit()) {
				return false;
			}
		}
		return true;
	}
}

class Card implements Cloneable {

	private char suit;
	private char value;

	public Card clone() {
		Card card = new Card();
		try {
			card = (Card) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return card;
	}

	public char getSuit() {
		return suit;
	}

	public void setSuit(char suit) {
		this.suit = suit;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}
}

