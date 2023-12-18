import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		List<String> klist = new ArrayList<String>();

		while (true) {
			String line = sc.nextLine();
			klist.add(line);
			if (line.equals("-")) {
				break;
			}
		}
		List<String> mozilist = new ArrayList<String>();
		List<Integer> kazulist = new ArrayList<Integer>();

		for (String string : klist) {
			if (string.matches("^[0-9]*$")) {
				kazulist.add(Integer.parseInt(string));
			} else {
				mozilist.add(string);
			}
		}

		int i = 0;
		int count = i;
		int nannkai = 0;
		for (String string : mozilist) {

			if (string.equals("-")) {
				break;
			}
			;
			for (int j = 1; j <= kazulist.get(i); j++) {

				StringBuilder r = new StringBuilder();
				r.append(string.substring( kazulist.get(j+i)));
				r.append(string.substring(0,kazulist.get(j+i)));
				string = r.toString();
				count++;
			}
			nannkai++;
			i = count+nannkai;
			System.out.println(string);
		}
	}
}