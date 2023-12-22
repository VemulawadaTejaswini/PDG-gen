import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(sc.next());
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			String order = sc.next();
			if (order.equals("replace")) {
				int a = sc.nextInt();
				int b = sc.nextInt() + 1;
				String rep = sc.next();
				sb.replace(a,b,rep);
			}
			else if (order.equals("reverse")) {
				int a = sc.nextInt();
				int b = sc.nextInt() + 1;
				String rev = sb.substring(a,b);
				StringBuilder sb2 = new StringBuilder(rev);
				sb2.reverse();
				sb.replace(a,b,sb2.toString());
			}
			else if (order.equals("print")) {
				int a = sc.nextInt();
				int b = sc.nextInt() + 1;
				String print = sb.toString().substring(a,b);
				System.out.println(print);
			}
		}
	}
}
