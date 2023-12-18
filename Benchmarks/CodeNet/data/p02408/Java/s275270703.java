import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int v = Integer.parseInt(line);
		String[] ka = new String[v];
		List<String> k = new ArrayList<String>();

		for (int i = 1; i < 14; i++) {
			k.add("S " + i);
		}
		for (int i = 1; i < 14; i++) {
			k.add("H " + i);
		}
		for (int i = 1; i < 14; i++) {
			k.add("C " + i);
		}
		for (int i = 1; i < 14; i++) {
			k.add("D " + i);
		}
		for (int i = 0; i < v; i++) {
			ka[i] = sc.nextLine();
		}
		List<String> klist = new ArrayList<String>();

		for (String string : k) {
			int ok = 0;
			for (int i = 0; i < ka.length; i++) {

				if (string.equals(ka[i])) {
					ok += 1;
				} else {

				}

			}
			if (ok == 0) {
				klist.add(string);
			}
		}
		Collections.sort(klist);
		for (String string : klist) {
			if (string.startsWith("S")) {
				System.out.println(string);
			}

		}
		for (String string : klist) {
			if (string.startsWith("H")) {
				System.out.println(string);
			}

		}
		for (String string : klist) {
			if (string.startsWith("C")) {
				System.out.println(string);
			}

		}
		for (String string : klist) {
			if (string.startsWith("D")) {
				System.out.println(string);
			}

		}
	}
}