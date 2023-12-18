import static java.util.Arrays.deepToString;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	void run() {
 		for (int testcase = sc.nextInt(); testcase-->0;) {
 			String s = sc.next();
 			if (isA(s)) System.out.println("A");
 			else if (isB(s)) System.out.println("B");
 			else System.out.println("NA");
		}
	}
	
	boolean isA(String s) {
		Pattern p = Pattern.compile(">'(=+)#(=+)~");
		Matcher matcher = p.matcher(s);
		if (matcher.matches()) {
			if (matcher.group(1).equals(matcher.group(2))) return true;
		}
		return false;
	}
	boolean isB(String s) {
		return s.matches(">\\^(Q=)+~~");
	}
}