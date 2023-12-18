import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TreeSet<Integer> p = new TreeSet<Integer>();
		p.add(2);
		Collections.max(p);
		while (s.hasNextInt()) {
			int n = s.nextInt();
			int c = 0;
			int m = n / 2;
			if(m < Collections.max(p)) c = p.size();
			int max = Collections.max(p);
			for (int i = (m < Collections.max(p))?p.last():2; i <= m; ++i) {
				if(i < max) {
					if (p.contains(i)) c++;
					continue;
				}
				boolean f = true;
				for (int j : p) {
					if (i % j == 0) {
						f = false;
						break;
					}
				}
				if (f) {
					c++;
					max = i;
					p.add(i);
				}
			}
			System.out.println(c);
		}
	}
}