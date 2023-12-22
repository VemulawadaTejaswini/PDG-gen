
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String w = s.nextLine();
		int na = w.length();
		int i = 0;
		int j = 0;
		String ans = "";

		List<String> list = new ArrayList<String>();

		for (i = 0; i < na; i++) {
			list.add(w.charAt(i) + "");
		}

		i = 0;
		for (i = 0; list.size() != 0; i++) {
			List<String> set = new ArrayList<>();
			Collections.addAll(set, list.get(0));

			list.removeAll(set);
			int q = na - list.size();

			if (q % 2 == 0) {
				ans = "Yes";
			} else if (q % 2 != 0) {
				ans = "No";
				break;
			}
		}
		System.out.println(ans);

	}
}