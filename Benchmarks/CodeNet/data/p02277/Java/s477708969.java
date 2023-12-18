import java.util.Scanner;

class Card {
	String mark;
	int num, flag;

	public Card(String str, int n, int f) {
		mark = str;
		num = n;
		flag = f;
	}

	public void Show() {
		System.out.println(mark + " " + num);
	}
}

public class Main {
	static Card[] card = new Card[10001];
	static Card swap;

	public static int partation(int p, int r) {
		int x = card[r].num;
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (card[j].num <= x) {
				i = i + 1;
				swap = card[i];
				card[i] = card[j];
				card[j] = swap;
			}
		}
		swap = card[i + 1];
		card[i + 1] = card[r];
		card[r] = swap;
		return i + 1;
	}

	public static void quicksort(int p, int r) {
		int q;
		if (p < r) {
			q = partation(p, r);
			quicksort(p, q - 1);
			quicksort(p + 1, r);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, n, f = 0;
		n = scan.nextInt();
		for (i = 0; i < n; i++) {
			card[i] = new Card(scan.next(), scan.nextInt(), i);
		}
		quicksort(0, n - 1);

		for (i = 0; i < n - 1; i++) {
			if (card[i].num == card[i + 1].num && card[i].flag > card[i + 1].flag) {
				f = 1;
				break;
			}
		}
		if (f == 0) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}

		for (i = 0; i < n; i++) {
			card[i].Show();
		}

		scan.close();
	}
}
