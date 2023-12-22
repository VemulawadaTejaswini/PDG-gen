import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		String next =a.substring(0, 1);
		a = a.substring(1, a.length());

		for(;;) {
			if (next.equals("a")) {
				if (a.isEmpty()) {
					System.out.println("A");
					return;
				}
				next = a.substring(0, 1);
				a = a.substring(1, a.length());
			}else if (next.equals("b")) {
				if(b.isEmpty()) {
					System.out.println("B");
					return;
				}
				next = b.substring(0, 1);
				b = b.substring(1, b.length());
			} else {
				if(c.isEmpty()) {
					System.out.println("C");
					return;
				}
				next = c.substring(0, 1);
				c = c.substring(1, c.length());
			}
		}
	}
}
