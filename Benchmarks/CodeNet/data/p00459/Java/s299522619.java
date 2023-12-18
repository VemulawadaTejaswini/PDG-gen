import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\0534-input.txt"));

		while (scan.hasNext()) {

			int n = scan.nextInt();
			if (n == 0)
				break;
			int m = scan.nextInt();
			int p = scan.nextInt();
			int q = scan.nextInt();
			int r = scan.nextInt();

			Card c = new Card(n);
			for (int i = 0; i < m; i++)
				c.shuffle(scan.nextInt(), scan.nextInt());
			System.out.println(c.count(p, q, r));
		}

		scan.close();
		System.exit(0);

	}
}

class Card {
	int[][] card;
	int current = 0;

	public Card(int n) {
		card = new int[n][2];
		for (int i = 0; i < n; i++)
			card[i][current] = i + 1;
	}

	public int count(int p, int q, int r) {
		p = p - 1;
		q = q - 1;
		int pcs = 0;
		for (int i = p; i <= q; i++)
			if (card[i][current] <= r)
				pcs++;
		return pcs;
	}

	public void shuffle(int x, int y) {
		x = x - 1;
		y = y - 1;
		int t = 0;
		int next = current ^ 1;
		for (int i = y + 1; i < card.length; i++, t++)
			card[t][next] = card[i][current];
		for (int i = x + 1; i <= y; i++, t++)
			card[t][next] = card[i][current];
		for (int i = 0; i <= x; i++, t++)
			card[t][next] = card[i][current];
		current = next;
	}
}