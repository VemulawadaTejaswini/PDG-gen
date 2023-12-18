import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	static final Pattern pt = Pattern.compile("0?(\\d|\\d{2}):0?(\\d|\\d{2})");
	static final Matcher mc = pt.matcher("");

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for (int i = 0; i < num; i++) {
			mc.reset(in.next()).matches();
			int min = Integer.parseInt(mc.group(2)) * 10;
			int mdeg = Math.abs(3600-min * 6);
			int hdeg = Math.abs(3600-Integer.parseInt(mc.group(1)) * 300 - min / 2);
			int deg = Math.abs(mdeg - hdeg);
			if (deg < 300) {
				System.out.println("alert");
			} else if (deg < 900) {
				System.out.println("warning");
			} else {
				System.out.println("safe");
			}
		}
	}

}