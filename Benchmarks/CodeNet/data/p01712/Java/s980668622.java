import java.util.BitSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int W = in.nextInt();
		BitSet wbit = new BitSet(W);
		int h = in.nextInt();
		BitSet hbit = new BitSet(h);
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int w = in.nextInt();
			wbit.set(Math.max(0, x - w), Math.min(W, x + w));
			hbit.set(Math.max(0, y - w), Math.min(h, y + w));
			// System.out.println(wbit);
			// System.out.println(hbit);
		}
		if (wbit.cardinality() == W || hbit.cardinality() == h) {
			System.out.println("Yes");
			System.exit(0);
		}
		System.out.println("No");

	}

}