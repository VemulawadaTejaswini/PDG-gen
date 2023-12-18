
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n, q;
		n = scanner.nextInt();
		q = scanner.nextInt();
		int[] s0 = new int[n];
		List<Integer> s = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			s0[i] = scanner.nextInt();
			s.add(s0[i]);
		}
		Collections.sort(s);
		List<Integer> sym = new ArrayList<Integer>();
		while (q-- > 0) {
			char qtype = scanner.next().charAt(0);
			int x = scanner.nextInt();
			if (qtype == 'A') {
				sym.add(s0[x - 1]);
			} else if (qtype == 'R') {
				sym.remove(sym.indexOf(s0[x - 1]));
			} else {
				Collections.sort(sym);
				int left = 0;
				int right = INF;
				while (left != right) {
					int center = (left + right) / 2;
					int pre = 0;
					int BAN = 0;
					for (int i = 0; i < sym.size(); i++) {
						int c = sym.get(i) - center;
						int p = 0;
						for (ListIterator<Integer> it = s.listIterator(); it
								.hasNext();) {
							int a = it.next();
							if (a >= c) {
								p = it.nextIndex() - 1;
								break;
							}
						}

						BAN += Math.max(p - pre, 0);
						pre = s.lastIndexOf(sym.get(i)) + 1;
					}
					BAN += Math.max(n - pre, 0);
					if (BAN <= x)
						right = center;
					else
						left = center + 1;
				}
				if (left != INF)
					System.out.println(left);
				else
					System.out.println("NA");
			}
		}

	}

	 int INF = 1000000001; 
}