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
			int min = Integer.parseInt(mc.group(2));
			int mdeg = min * 6;
			double hdeg = Integer.parseInt(mc.group(1)) * 30 + min / 10.0;
			double deg = Math.abs(hdeg - mdeg);
			if (deg < 30) {
				System.out.println("alert");
			} else if (deg < 90) {
				System.out.println("warning");
			} else {
				System.out.println("safe");
			}
		}
	}

}