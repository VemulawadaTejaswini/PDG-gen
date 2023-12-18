import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String S = sc.next();

		String regex = "A|T|C|G";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(S);

		S = m.replaceAll("1");

		String regex2 = "[^1]";
		Pattern p2 = Pattern.compile(regex2);
		Matcher m2 = p2.matcher(S);

		S = m2.replaceAll("0");

		String[] ss = S.split("0");

		int res = 0;
		for (String sss : ss) {
			res = Math.max(sss.length(), res);
		}

		System.out.println(res);

	}
}
