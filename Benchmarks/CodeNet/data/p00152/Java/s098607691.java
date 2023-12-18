import static java.util.Arrays.deepToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			if (n == 0) break;
			sc.nextLine();
			List<S> list = new ArrayList<S>();
			for (int kkk = 0; kkk < n; kkk++) {
				String[] ss = sc.nextLine().split(" ");
				int id = Integer.parseInt(ss[0]);
				int[] as = new int[ss.length - 1];
				for (int i = 1; i < ss.length; i++) {
					as[i-1] = Integer.parseInt(ss[i]);
				}
				S s = new S();
				s.id = id;
				s.score = getScore(as);
				list.add(s);
			}
			Collections.sort(list);
			for (S s : list) {
				System.out.println(s.id + " " + s.score);
			}
		}
	}
	
	int getScore(int[] as) {
		int[] fs = new int[10];
		int i = 0;
		for (int f = 0; f < 10; ) {
			int cur = 0;
			cur += as[i];
			if (cur == 10) { // strike
				cur += as[i + 1] + as[i + 2];
				i += 1;
			} else { 
				cur += as[i + 1];
				if (cur == 10) { // spear
					cur += as[i + 2];
				}
				i += 2;
			}
			fs[f++] = cur;
		}
		int sum = 0;
		for (int x : fs) sum += x;
		return sum;
	}
	
	static class S implements Comparable<S> {
		int id;
		int score;
		@Override
		public int compareTo(S o) {
			if (score != o.score) return -(score - o.score);
			return id - o.id;
		}
	}
}