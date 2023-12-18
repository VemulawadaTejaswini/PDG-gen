import java.util.BitSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BitSet bs = new BitSet(1300000);
		bs.set(2);
		for (int i = 3; i < bs.size(); i += 2) {
			boolean ok = true;
			for (int j = 3; j > 0 && (long) j * j <= i; j = bs.nextSetBit(j + 1)) {
				if (i % j == 0) {
					ok = false;
					break;
				}
			}
			if (ok) bs.set(i);
		}
		while (true) {
			int k = sc.nextInt();
			if (k == 0) break;
			int p = k;
			while (!bs.get(p)) --p;
			int n = bs.nextSetBit(k);
			System.out.println(n - p);
		}
	}

}