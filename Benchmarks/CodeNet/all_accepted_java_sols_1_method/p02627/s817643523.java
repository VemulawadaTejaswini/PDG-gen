import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String pattern1 = "[a-z]";
		Pattern p = Pattern.compile(pattern1);
		Matcher m = p.matcher(a);
		if (m.find()) {
			System.out.println("a");
		} else {
			System.out.println("A");
		}
		sc.close();
	}
}
