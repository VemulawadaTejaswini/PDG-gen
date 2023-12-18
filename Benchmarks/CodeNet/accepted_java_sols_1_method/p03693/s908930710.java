import java.util.Map;
import java.util.Scanner;

public class Main {
	final static String aa = "aa";
	final static String a = "a";
	final static String bb = "bb";
	final static String b = "b";
	static Map<String, String> my;
	static Map<String, String> mn;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int rgb = r * 100 + g * 10 + b;

		System.out.println((rgb % 4 == 0) ? "YES" : "NO");

		return;
	}

}
