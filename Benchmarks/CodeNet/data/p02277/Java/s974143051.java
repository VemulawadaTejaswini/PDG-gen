import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Card {
	char mark;
	long num;

	public Card(char mark, long num) {
		super();
		this.mark = mark;
		this.num = num;
	}

	@Override
	public String toString() {
		return mark + " " + num;
	}

	public boolean equals(Card o) {
		return this.mark == o.mark && this.num == o.num;
	}

}

class Main {

	public static void main(String[] args) {

		int n = 0;
		Card[] cards = null;

		try(BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));) {

			n = Integer.parseInt(br.readLine());

			cards = new Card[n];
			for (int i = 0; i < n; i++) {
				String line = br.readLine();

				cards[i] = new Card(
						line.charAt(0), Long.parseLong(line.substring(2))
						);
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Card[] copy = Arrays.copyOf(cards, n);
		quickSort(cards, 0, n-1);
		mergeSort(copy, 0, n);

		boolean stable = true;
		for (int i = 0; i < n; i++) {
			if(!cards[i].equals(copy[i])) {
				stable = false;
				break;
			}
		}

		if(stable) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}

		for (int i = 0; i < n; i++) {
			System.out.println(cards[i]);
		}

	}

	private static void mergeSort(Card[] cards, int left, int right) {

		if(left+1 < right) {
			int mid = (left + right)/2;
			mergeSort(cards, left, mid);
			mergeSort(cards, mid, right);

			merge(cards, left, mid, right);
		}

	}

	private static void merge(Card[] cards, int left, int mid, int right) {

		int n1 = mid - left;
		int n2 = right - mid;

		Card[] L = new Card[n1+1];
		Card[] R = new Card[n2+1];
		for (int i = 0; i < n1; i++) {
			L[i] = cards[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = cards[mid + i];
		}
		Card inf = new Card('X', Long.MAX_VALUE);
		L[n1] = inf;
		R[n2] = inf;

		int i = 0;
		int j = 0;

		for (int k = left; k < right; k++) {

			if(L[i].num <= R[j].num) {
				cards[k] = L[i];
				i++;
			} else {
				cards[k] = R[j];
				j++;
			}

		}

	}

	private static void quickSort(Card[] cards, int p, int r) {
		if (p < r) {
			int q = partition(cards, p, r);
			quickSort(cards, p, q-1);
			quickSort(cards, q+1, r);
		}
	}

	private static int partition(Card[] cards, int p, int r) {

		Card x = cards[r];
		int i = p-1;
		for (int j = p; j < r; j++) {
			if (cards[j].num <= x.num) {
				i++;
				Card tmp;
				tmp = cards[j];
				cards[j] = cards[i];
				cards[i] = tmp;
			}
		}

		Card tmp;
		tmp = cards[r];
		cards[r] = cards[i+1];
		cards[i+1] = tmp;

		return i + 1;

	}
}