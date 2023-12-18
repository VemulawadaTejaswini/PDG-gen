import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		BITree bit = new BITree(n, false);

		int q = scan.nextInt();
		for (int i = 0; i < q; i++)
			switch (scan.nextInt()) {
			case (0):
				bit.add(scan.nextInt(), scan.nextInt());
				break;
			case (1):
				System.out.println(bit.getSum(scan.nextInt(), scan.nextInt()));
				break;
			}

		scan.close();
		System.exit(0);
	}
}

class BITree {
	boolean debug;
	int[] bit;

	public BITree(int n, boolean d) {
		debug = d;
		bit = new int[n + 10];
	}

	public int getSum(int x1, int x2) {
		return nSum(x2) - nSum(x1 - 1);
	}

	private int nSum(int x) {
		int r = 0;
		for (int i = x; i > 0; i -= i & -i)
			r += bit[i];
		if (debug)
			System.out.println(x + " " + r);
		return r;
	}

	public void add(int x, int y) {
		for (int i = x; i < bit.length; i += i & -i)
			bit[i] += y;
		if (debug) {
			for (int i = 0; i < bit.length; i++)
				System.out.println(i + ":" + bit[i]);
		}
	}
}