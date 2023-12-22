import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		String r = solve(s);
		System.out.println(r);
	}

	private static String solve(String s) {
		if (s.equals("ABC"))
			return "ARC";
		else
			return "ABC";
	}
}