import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String s = scanner.next();

		Pattern p = Pattern.compile("[0-9]+-[0-9]+");
		Matcher m = p.matcher(s);

		if (m.find() && s.charAt(a) == '-' && s.length() == a + b + 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
