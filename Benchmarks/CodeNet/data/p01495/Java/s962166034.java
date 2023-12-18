import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	static final Pattern pt = Pattern.compile("m(.?)e(.?)w");
	static final Matcher mt = pt.matcher("");

	public static void main(String[] args) {
		String call = new Scanner(System.in).nextLine();
		System.out.println(check(call) ? "Cat" : "Rabbit");
	}

	public static boolean check(String s) {
		if (s.isEmpty()) { return true; }
		mt.reset(s);
		if (!mt.matches()) { return false; }
		s = s.replaceFirst("mew", "");
		return check(s);
	}
}