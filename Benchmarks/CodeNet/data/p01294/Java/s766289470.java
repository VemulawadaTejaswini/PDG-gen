import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solver();
	}

	static void solver() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			if (n == 0 && d == 0) {
				sc.close();
				return;
			}
			ArrayList<Country> cs = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int m = sc.nextInt();
				int[] c = new int[m];
				for (int j = 0; j < m; j++) {
					c[m - j - 1] = sc.nextInt();
				}
				cs.add(new Country(i, c, m));
			}
			cs.sort(null);
			int max = cs.get(cs.size() - 1).sum;
			int min = cs.get(0).sum;
			int max2 = min;
			if (cs.size() >= 2) {
				max2 = cs.get(cs.size() - 2).num;
			}
			while (max - min <= d) {
				for (int i = 0; i < cs.size(); i++) {
					int ns = cs.get(i).sum - cs.get(i).c.get(0);
					if (((i != cs.size() - 1 && Math.abs(ns - max) <= d)
							|| (i == cs.size() - 1 && Math.abs(ns - max2) <= d)) && Math.abs(ns - min) <= d) {
						cs.get(i).sum = ns;
						cs.get(i).c.remove(0);
						if (cs.get(i).c.size() == 0) {
							cs.remove(i);
							if (cs.size() == 0)
								break;
						}
						cs.sort(null);
						max = cs.get(cs.size() - 1).sum;
						max2 = min;
						if (cs.size() >= 2) {
							max2 = cs.get(cs.size() - 2).num;
						}
						min = Math.min(cs.get(0).sum, min);
					}
				}
				if (cs.size() == 0)
					break;
			}
			if (cs.size() == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	static class Country implements Comparable<Country> {
		int num;
		int sum = 0;
		ArrayList<Integer> c = new ArrayList<>();

		Country(int num, int[] c, int m) {
			this.num = num;
			for (int i = 0; i < m; i++) {
				this.c.add(c[i]);
				this.sum += c[i];
			}
		}

		@Override
		public int compareTo(Country o) {
			return Integer.compare(this.sum, o.sum);
		}
	}
}