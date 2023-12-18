

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String ans = "NO";

		if ("KIHBR".equals(s))
			ans = "YES";

		if ("AKIHBR".equals(s))
			ans = "YES";
		if ("KIHABR".equals(s))
			ans = "YES";
		if ("KIHBAR".equals(s))
			ans = "YES";
		if ("KIHBRA".equals(s))
			ans = "YES";

		if ("AKIHABR".equals(s))
			ans = "YES";
		if ("AKIHBAR".equals(s))
			ans = "YES";
		if ("AKIHBRA".equals(s))
			ans = "YES";
		if ("KIHABAR".equals(s))
			ans = "YES";
		if ("KIHABRA".equals(s))
			ans = "YES";
		if ("KIHBARA".equals(s))
			ans = "YES";

		if ("AKIHABAR".equals(s))
			ans = "YES";
		if ("AKIHABRA".equals(s))
			ans = "YES";
		if ("AKIHBARA".equals(s))
			ans = "YES";
		if ("KIHABARA".equals(s))
			ans = "YES";

		if ("AKIHABARA".equals(s))
			ans = "YES";

		System.out.println(ans);
	}

}
