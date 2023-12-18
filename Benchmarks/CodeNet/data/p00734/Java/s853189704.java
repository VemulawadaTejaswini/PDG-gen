import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;
		while ((n = in.nextInt()) != 0 && (m = in.nextInt()) != 0) {
			SortedSet<Integer> tset = new TreeSet<Integer>();
			int taroSum = 0;
			for (int i = 0; i < n; i++) {
				int s = in.nextInt();
				tset.add(s);
				taroSum += s;
			}
			SortedSet<Integer> hset = new TreeSet<Integer>();
			int hanakoSum = 0;
			for (int i = 0; i < m; i++) {
				int s = in.nextInt();
				hset.add(s);
				hanakoSum += s;
			}
			int span = taroSum - hanakoSum;
			boolean isNotFind = true;
			if (Math.abs(span) % 2 != 1) {
				span /= 2;
				for (int tc : tset) {
					if (hset.contains(tc - span)) {
						int hc = tc - span;
						System.out.println(tc + " " + hc);
						isNotFind = false;
						break;
					}
					isNotFind = true;
				}
			} else {
				isNotFind = true;
			}
			if (isNotFind) {
				System.out.println(-1);
			}
		}

	}
}