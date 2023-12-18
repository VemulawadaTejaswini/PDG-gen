
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String W = scn.nextLine();
		int count = 0;
		final String LAST_DATA = "END_OF_TEXT";
		while (scn.hasNextLine()) {
			String T = scn.next();
			if (T.equals(LAST_DATA)) {
				break;
			}
			W = W.toLowerCase();
			T = T.toLowerCase();
			if (T.equals(W)) {
				count++;
			}
		}
		System.out.println(count);
	}
}

