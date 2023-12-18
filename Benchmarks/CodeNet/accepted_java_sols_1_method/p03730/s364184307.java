
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		String ans = "NO";
		for (int i = a; i <= a * b; i += a) {
			if (i % b == c) {
				ans = "YES";
				break;
			}
		}
		System.out.println(ans);
	}
}