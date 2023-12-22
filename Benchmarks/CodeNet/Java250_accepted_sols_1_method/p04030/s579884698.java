
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String s, out = "";
		Scanner input = new Scanner(System.in);
		s = input.next();
		for (int j = 0; j <= s.length() - 1; j++) {
			if (Character.valueOf(s.charAt(j)).toString().equals("0")) {
				out += "0";
			} else if (Character.valueOf(s.charAt(j)).toString().equals("1")) {
				out += "1";
			} else if (Character.valueOf(s.charAt(j)).toString().equals("B")) {
				if (!out.equals("")) {
					out = out.substring(0, out.length() - 1);
				}
			}
		}
		System.out.println(out);

	}

}