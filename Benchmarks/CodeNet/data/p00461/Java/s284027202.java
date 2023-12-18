
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		while ((n = in.nextInt()) > 0) {
			int m = in.nextInt();
			String s = in.next();
			Pattern pt = Pattern.compile("I(OI){" + n + "}");
			Matcher mc = pt.matcher(s);
			int count = 0;
			int start = 0;
			while (mc.find(start)) {
				start = mc.start() + 1;
				count++;
			}
			System.out.println(count);
		}
	}
}