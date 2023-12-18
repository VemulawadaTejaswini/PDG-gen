import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b = s.nextLine();
		String c = s.nextLine();
		String ans = "";

		String aa = "A";
		String bb = "B";
		String cc = "C";

		int a1 = a.length();
		int b1 = b.length();
		int c1 = c.length();
		int i = 0;
		int j = 0;
		int k = 0;
		String senntou = "a";

		List<String> lista = new ArrayList<String>();
		List<String> listb = new ArrayList<String>();
		List<String> listc = new ArrayList<String>();

		for (i = 0; i < a1; i++) {
			lista.add(a.charAt(i) + "");
		}

		for (j = 0; j < b1; j++) {
			listb.add(b.charAt(j) + "");
		}

		for (k = 0; k < c1; k++) {
			listc.add(c.charAt(k) + "");
		}

		i = 0;
		for (i = 0;; i++) {
			

			if (senntou.equals("a")) {

				if (lista.size() == 0) {

					ans = aa;
					break;

				} else if (lista.get(0).equals("a")) {

					senntou = lista.get(0);

					lista.remove(0);

				} else if (lista.get(0).equals("b")) {

					senntou = lista.get(0);
					lista.remove(0);

				} else if (lista.get(0).equals("c")) {

					senntou = lista.get(0);
					lista.remove(0);

				}

			} else if (senntou.equals("b")) {
				if (listb.size() == 0) {
					ans = bb;
					break;
				} else if (listb.get(0).equals("a")) {

					senntou = listb.get(0);
					listb.remove(0);

				} else if (listb.get(0).equals("b")) {

					senntou = listb.get(0);
					listb.remove(0);

				} else if (listb.get(0).equals("c")) {

					senntou = listb.get(0);
					listb.remove(0);

				}

			} else if (senntou.equals("c")) {
				if (listc.size() == 0) {
					ans = cc;
					break;

				} else if (listc.get(0).equals("a")) {

					senntou = listc.get(0);
					listc.remove(0);

				} else if (listc.get(0).equals("b")) {

					senntou = listc.get(0);
					listc.remove(0);

				} else if (listc.get(0).equals("c")) {

					senntou = listc.get(0);
					listc.remove(0);

				}
			}
		}

		System.out.println(ans);

	}

}