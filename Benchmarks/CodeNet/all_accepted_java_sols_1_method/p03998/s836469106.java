import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String sa = scan.nextLine();
		String sb = scan.nextLine();
		String sc = scan.nextLine();

		int i = 0;
		int j = 0;
		int k = 0;

		List<String> a = new ArrayList<String>();
		List<String> b = new ArrayList<String>();
		List<String> c = new ArrayList<String>();

		for (i = 0; i < sa.length(); i++) {
			a.add(sa.charAt(i) + "");
		}

		for (j = 0; j < sb.length(); j++) {
			b.add(sb.charAt(j) + "");
		}

		for (k = 0; k < sc.length(); k++) {
			c.add(sc.charAt(k) + "");
		}

		String ha = "a";

		i = 1;

		for (;;) {

			if (ha.equals("a")) {

				if (a.size() == 0) {
					System.out.println("A");
					break;
				}

				ha = a.get(0);
				a.remove(0);

			} else if (ha.equals("b")) {

				if (b.size() == 0) {
					System.out.println("B");
					break;
				}

				ha = b.get(0);
				b.remove(0);

			} else if (ha.equals("c")) {

				if (c.size() == 0) {
					System.out.println("C");
					break;
				}

				ha = c.get(0);
				c.remove(0);

			}

		}

	}

}