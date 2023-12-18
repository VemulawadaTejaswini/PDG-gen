import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		String word;
		int count = 0;
		List<String> text = new ArrayList<>();
		final String EOT = "END_OF_TEXT";

		Scanner stdIn = new Scanner(System.in);

		word = stdIn.nextLine();

		for(int i = 0;;i++) {
			String s = stdIn.next();
			if(s.equals(EOT)) {
				break;
			}
			text.add(s);
		}

		for(String s : text) {
//			System.out.println(s + " == " + word + " : " + s.compareToIgnoreCase(word));
			if(s.compareToIgnoreCase(word) == 0) {
				count++;
			}
		}

		System.out.println(count);


		stdIn.close();
	}

}