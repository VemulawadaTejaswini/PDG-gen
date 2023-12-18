import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, b, c, d;
		char is;
		int aid, bid, cid;
		
		while (true) {
			a = sc.next();
			if (a.equals("-")) {
				break;
			}
			
			b = sc.next();
			c = sc.next();
			d = "";

			aid = bid = cid = 0;
			is = b.charAt(bid++);
			while (true) {
				if (aid == a.length() && bid == b.length()) {
					d += Character.toString(is);
					break;
				}
				if (aid < a.length() && cid < c.length() && is == c.charAt(cid)) {
					is = a.charAt(aid++);
					cid++;
				} else {
					d += Character.toString(is);
					is = b.charAt(bid++);
				}
			}
			
			System.out.println(d);
		}
	}
}