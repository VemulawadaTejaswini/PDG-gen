import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		String w = scan.next();
		w = w.toLowerCase();
		String ti;
		while (true) {
			ti = scan.next();
			if ( ti.equals("END_OF_TEXT") ) break;
			sb.append(ti + " ");
		}
		String[] stary = sb.toString().split(" ");
		int count = 0;
		for (int i = 0; i < stary.length; i++) {
			if (stary[i].toLowerCase().equals(w)) {
				count++;
			}
		}
		System.out.println(count);
	}
}