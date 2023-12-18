import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	Card[] cards = new Card[n];
	String[] input;
	for (int i = 0; i < n; i++) {
	    input = br.readLine().split(" ");
	    cards[i] = new Card(input[0], Integer.parseInt(input[1]), i);
	}

	quicksort(cards, 0, n-1);

	String message = "Stable";
	for (int i = 0; i < n - 1; i++) {
	    if (cards[i].num == cards[i+1].num && cards[i].index > cards[i+1].index ) {
		message = "Not stable";
	    }
	}
	StringBuilder sb = new StringBuilder();
	sb.append(message + "\n");
	for (int i = 0; i < n; i++) {
	    sb.append(cards[i].suit + " " + cards[i].num + "\n");
	}
	System.out.print(sb);
    }
    static void quicksort (Card[]a, int p, int r) {
	if (p < r) {
	    int q = partition(a, p, r);
	    quicksort(a, p, q - 1);
	    quicksort(a, q + 1, r);
	}
    }
    static int partition (Card[] a, int p, int r) {
	int x = a[r].num;
	int i = p - 1;
	Card tmp;
	for (int j = p; j < r; j++) {
	    if (a[j].num <= x) {
		i = i + 1;
		tmp = a[j];
		a[j] = a[i];
		a[i] = tmp;
	    }
	}
	tmp = a[i+1];
	a[i+1] = a[r];
	a[r] = tmp;
	return i+1;
    }
}
class Card {
    String suit;
    int num;
    int index;
    Card (String suit, int num, int index) {
	this.suit = suit;
	this.num = num;
	this.index = index;
    }
}