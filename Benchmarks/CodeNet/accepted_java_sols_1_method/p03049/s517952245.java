import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			int r = 0;
			int trail = 0;
			int lead = 0;
			int dbl = 0;
			for (int i = 0; i < n; i++) {
				String s = in.next();
				int p = -1;
				while (true) {
					p = s.indexOf("AB", p + 1);
					if (p == -1) {
						break;
					}
					r++;
				}
				boolean st = s.startsWith("B");
				boolean ed = s.endsWith("A");
				if (st && ed) {
					dbl++;
				} else {
					if (st) {
						lead++;
					}
					if (ed) {
						trail++;
					}
				}
			}
			
			//System.out.println("r" + r + " d" + dbl + " l" + lead + " t" + trail);
			
			// double 同士を1つに連結。
			if (dbl > 1) {
				r += dbl - 1;
				dbl = 1;
			}
			if (dbl == 1) {
				if (lead > 0) {
					lead--;
					r++;
				}
				if (trail > 0) {
					trail--;
					r++;
				}
			}
			r += Math.min(lead, trail);
			
			System.out.println(r);
		}
	}
	
}
