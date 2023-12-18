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
		// Scanner scan = new Scanner(new File("c:\\0520-input.txt"));

		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;

			Mobile mobile = new Mobile(n);
			for (int i = 0; i < n; i++)
				mobile.add(i + 1, scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
			// mobile.print();
			System.out.println(mobile.getWeight(mobile.getTop()));
		}

		scan.close();
		System.exit(0);
	}

}

class Mobile {
	class Bar {
		public Bar(int _p, int _q, int _r, int _b) {
			p = _p;
			q = _q;
			r = _r;
			b = _b;
		}

		int p, q;
		int r, b;
	}

	Bar[] bar;

	public Mobile(int n) {
		bar = new Bar[n + 1];
	}

	public long getWeight(int me) {
		if (me == 0)
			return 1;
		long m = this.lcm(bar[me].p * this.getWeight(bar[me].r), bar[me].q * this.getWeight(bar[me].b));
		return (m / bar[me].p + m / bar[me].q);
	}

	public int getTop() {
		return (this.top(1));
	}

	private int top(int c) {
		int p = getParent(c);
		if (p == -1)
			return (c);
		else
			return (this.top(p));
	}

	private int getParent(int c) {
		for (int i = 1; i < bar.length; i++)
			if (bar[i].r == c || bar[i].b == c)
				return i;
		return (-1);
	}

	public void print() {
		for (int i = 1; i < bar.length; i++)
			System.out.println(i + ":" + bar[i].p + " " + bar[i].q + " " + bar[i].r + " " + bar[i].b);

	}

	public void add(int i, int p, int q, int r, int b) {
		int g = (int) this.gcd(p, q);
		bar[i] = new Bar((p / g), (q / g), r, b);
	}

	private long gcd(long a, long b) {
		while (true) {
			if (a > b) {
				long tmp = a;
				a = b;
				b = tmp;
			}

			long r = b % a;
			if (r == 0)
				return (a);
			else if (r == 1)
				return 1;
			else
				b = r;
		}
	}

	private long lcm(long a, long b) {
		return (a * b / gcd(a, b));
	}
}