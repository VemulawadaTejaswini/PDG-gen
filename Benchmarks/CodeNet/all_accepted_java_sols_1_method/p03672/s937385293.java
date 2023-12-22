import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String input = s.nextLine();

		Pattern pattern = Pattern.compile("(.+)\\1");
		Matcher matcher;

		StringBuilder sb = new StringBuilder(input);

		while(true) {
			sb.deleteCharAt(sb.length()-1);
			String test = sb.toString();
			matcher = pattern.matcher(test);
			if(matcher.matches()) {
				System.out.println(test.length());
				break;
			}
		}

	}

}
