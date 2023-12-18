import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	private static final Integer Z = Integer.valueOf(0);

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;
		TreeSet<Integer> _1 = new TreeSet<Integer>();
		TreeSet<Integer> _2 = new TreeSet<Integer>();
		_1.add(Integer.valueOf(0));
		while ((n = in.nextInt()) > 0 && (m = in.nextInt()) > 0) {
			_1.clear();
			_1.add(Integer.valueOf(0));
			_2.clear();
			_2.add(Integer.valueOf(0));
			int floor = 0;
			for (int i = 0; i < n && floor < m; i++) {
				final int sc = in.nextInt();
				_1.add(Integer.valueOf(sc));
				for (Integer pt : _1) {
					int pti = pt.intValue();
					pti += sc;
					if (pti <= m)
						_2.add(Integer.valueOf(pti));
				}
			}
			for (Integer pt : _2) {
				int pti = pt.intValue();
				final int i = m - pti;
				int _2floor = _2.floor(Integer.valueOf(i)).intValue();
				floor = Math.max(floor, _2floor + pti);
				if (floor == m) {
					break;
				}
			}
			System.out.println(floor);

		}
	}
}