import java.util.Scanner;
import java.util.regex.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;

		sc.next();
		String s = sc.next();
		Pattern p = Pattern.compile("ABC");
		Matcher m = p.matcher(s);

		while(m.find()) count++;

		System.out.println(count);
	}
}