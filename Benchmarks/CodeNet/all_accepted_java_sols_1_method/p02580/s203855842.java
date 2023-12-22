import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int m = Integer.parseInt(sa[2]);

		int[] x = new int[h];
		int[] y = new int[w];
		List<Set<Integer>> list = new ArrayList<>();
		for (int i = 0; i < h; i++) {
			list.add(new HashSet<>());
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			x[a]++;
			y[b]++;
			list.get(a).add(b);
		}
		br.close();

		int xx = 0;
		for (int i = 0; i < x.length; i++) {
			xx = Math.max(xx, x[i]);
		}
		Set<Integer> sx = new HashSet<>();
		for (int i = 0; i < x.length; i++) {
			if (x[i] == xx) {
				sx.add(i);
			}
		}

		int yy = 0;
		for (int i = 0; i < y.length; i++) {
			yy = Math.max(yy, y[i]);
		}
		Set<Integer> sy = new HashSet<>();
		for (int i = 0; i < y.length; i++) {
			if (y[i] == yy) {
				sy.add(i);
			}
		}

		for (int i : sx) {
			for (int j : sy) {
				if (!list.get(i).contains(j)) {
					System.out.println(xx + yy);
					return;
				}
			}
		}
		System.out.println(xx + yy - 1);
	}
}
