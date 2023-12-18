import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		char[][] keys = { ".,!? ".toCharArray(),
		                "abc".toCharArray(),
		                "def".toCharArray(),
		                "ghi".toCharArray(),
		                "jkl".toCharArray(),
		                "mno".toCharArray(),
		                "pqrs".toCharArray(),
		                "tuv".toCharArray(),
		                "wxyz".toCharArray() };

		Scanner in = new Scanner(System.in);
		Pattern pt = Pattern.compile("([1-9]+)0");
		Matcher mc = pt.matcher("");
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String nums = in.next();
			mc.reset(nums);
			while (mc.find()) {
				char[] charArray = mc.group().toCharArray();
				char num = charArray[0];
				char[] usekey = keys[Character.digit(num, 10) - 1];
				int size = (charArray.length - 2) % usekey.length;
				System.out.print(usekey[size]);
			}
			System.out.println();
		}
	}
}