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
		// File("D:\\UserArea\\J0124567\\Downloads\\0536-input.txt"));

		while (scan.hasNext()) {

			int n = scan.nextInt();
			if (n == 0)
				break;
			int m = scan.nextInt();
			int p = scan.nextInt();
			int q = scan.nextInt();
			int r = scan.nextInt();

			Card c = new Card(n);
			for (int i = 0; i < m; i++) {
				c.shuffle(scan.nextInt(), scan.nextInt());
				// c.print();
			}

			System.out.println(c.count(p, q, r));
		}

		scan.close();
		System.exit(0);

	}
}

class Card {
	class Bulk {
		public Bulk(int _st, int _pcs) {
			st = _st;
			pcs = _pcs;
		}

		int st;
		int pcs;
	}

	List<Bulk> bulk = new ArrayList<Bulk>();

	public Card(int n) {
		bulk.add(new Bulk(1, n));
	}

	public void print() {
		for (int i = 0; i < bulk.size(); i++) {
			for (int c = 0; c < bulk.get(i).pcs; c++)
				System.out.print(" " + (bulk.get(i).st + c));
		}
		System.out.println();
	}

	public int count(int p, int q, int r) {
		int pcs = 0;
		int cto = 0;
		int cfr;
		for (int i = 0; i < bulk.size(); i++) {
			cfr = cto + 1;
			cto += bulk.get(i).pcs;
			if (cfr > q)
				break;
			if (cto < p)
				continue;
			int a, b;
			if (cfr < p)
				a = p - cfr;
			else
				a = 0;
			if (cto > q)
				b = bulk.get(i).pcs - (cto - q) - 1;
			else
				b = bulk.get(i).pcs - 1;
			if (bulk.get(i).st + a <= r)
				if (bulk.get(i).st + b <= r)
					pcs += (b - a + 1);
				else
					pcs += (r - (bulk.get(i).st + a) + 1);

		}
		return pcs;
	}

	public void shuffle(int x, int y) {
		this.moveLast(x + 1, y);
		this.moveLast(1, x);
	}

	private void moveLast(int fr, int to) {
		int i = 0;
		int cfr;
		int cto = 0;
		while (i < bulk.size()) {
			cfr = cto + 1;
			cto += bulk.get(i).pcs;
			if (cto < fr) {
				i++;
				continue;
			}
			if (cto <= to) {
				if (cfr < fr) {
					bulk.add(new Bulk(bulk.get(i).st + (fr - cfr), cto - fr + 1));
					bulk.get(i).pcs -= (cto - fr + 1);
					i++;
					continue;
				} else {
					bulk.add(new Bulk(bulk.get(i).st, bulk.get(i).pcs));
					bulk.remove(i);
					continue;
				}
			} else {
				if (cfr < fr) {
					bulk.add(new Bulk(bulk.get(i).st + (fr - cfr), to - fr + 1));
					bulk.add(i, new Bulk(bulk.get(i).st, fr - cfr));
					bulk.get(i + 1).st += (to - cfr + 1);
					bulk.get(i + 1).pcs -= (to - cfr + 1);
					break;
				} else {
					bulk.add(new Bulk(bulk.get(i).st, to - cfr + 1));
					bulk.get(i).st += (to - cfr + 1);
					bulk.get(i).pcs -= (to - cfr + 1);
					break;
				}
			}

		}
	}
}