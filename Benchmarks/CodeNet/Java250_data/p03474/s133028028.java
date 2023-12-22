import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		sb.append("^");
		for(int i = 0 ; i < a ; i++) {
			sb.append("[0-9]");
		}
		sb.append("-");
		for(int i = 0 ; i < b ; i++) {
			sb.append("[0-9]");
		}
		sb.append("$");
		Pattern p = Pattern.compile(sb.toString());
		Matcher m = p.matcher(s);
		System.out.println(m.matches() ? "Yes" : "No");
		sc.close();

	}

}
