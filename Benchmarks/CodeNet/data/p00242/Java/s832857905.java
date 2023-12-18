import static java.util.Arrays.deepToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int n = sc.nextInt(); sc.nextLine();
			if (n == 0) break;
			
			Map<String, Integer> count = new HashMap<String, Integer>();
			
			for (int i = 0; i < n; i++) {
				String[] words = sc.nextLine().split(" ");
				for (String w : words) {
					Integer k = count.get(w);
					if (k == null) { k = 0; }
					k++;
					count.put(w, k);
				}
			}
			char c = sc.next().charAt(0);
			
			ArrayList<P> ps = new ArrayList<P>();
			for (String w : count.keySet()) {
				if (w.charAt(0) == c) {
					P p = new P();
					p.w = w;
					p.count = count.get(w);
					ps.add(p);
				}
			}
			Collections.sort(ps);
			
			if (ps.size() == 0) {
				System.out.println("NA");
			} else {
				System.out.print(ps.get(0).w);
				for (int i = 1; i < Math.min(ps.size(), 5); i++) {
					System.out.print(" " + ps.get(i).w);
				}
				System.out.println();
			}
		}
	}
	
	class P implements Comparable<P> {
		int count;
		String w;
		@Override
		public int compareTo(P o) {
			if (count != o.count) return -count + o.count;
			return w.compareTo(o.w);
		}
	}
}