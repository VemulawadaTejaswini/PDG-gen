import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		B(sc);
	}
	
	public static void A(Scanner sc) {
		int m = sc.nextInt();
		out.println(24-m+24);
	}
	
	public static void B(Scanner sc) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		Pattern p = Pattern.compile("[0-9]{"+ a + "}-[0-9]{" + b + "}");
		Matcher m = p.matcher(s);
		if(m.find()) out.println("Yes");
		else out.println("No");
	}
}