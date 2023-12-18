import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> p = new ArrayList<Integer>();
		p.add(2);
		Collections.max(p);
		while (s.hasNextInt()) {
			int n = s.nextInt();
			int c = 0;
			int m = n;
			int max = Collections.max(p);
			for (int i = 2; i <= n; ++i) {
				if(i <= max) {
					if (p.contains(i)) c++;
					continue;
				}
				boolean f = true;
				for (int j : p) {
					if (i % j == 0) {
						f = false;
						break;
					}
					if(m <= j) break;
				}
				if (f) {
					c++;
					max = i;
					p.add(i);
				}
			}
			System.out.println(c);
		}
//		System.out.println(p.toString());
	}
}