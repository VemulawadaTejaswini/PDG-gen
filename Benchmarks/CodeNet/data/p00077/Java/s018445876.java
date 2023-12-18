import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Pattern pt = Pattern.compile("@(\\d)(.)");
		Matcher mt = null;
		String str;
		for (Scanner in = new Scanner(System.in); in.hasNextLine();) {
			str = in.next();
			if (mt == null) {
				mt = pt.matcher(str);
			} else {
				mt.reset(str);
			}
			String s = str;
			while (mt.find()) {
				int n = Integer.parseInt(mt.group(1));
				char[] to = new char[n];
				Arrays.fill(to, mt.group(2).charAt(0));
				s = s.replace(mt.group(0), new String(to));
			}
			System.out.println(s);
		}
	}
}