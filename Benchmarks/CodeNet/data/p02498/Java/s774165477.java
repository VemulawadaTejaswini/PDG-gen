import static java.lang.Character.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println(solve(new BufferedReader(new InputStreamReader(System.in)).readLine()));
	}
	
	public static String solve(String s) {
		StringBuilder sb = new StringBuilder(s.length());
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (isUpperCase(c)) sb.append(toLowerCase(c));
			else if (isLowerCase(c)) sb.append(toUpperCase(c));
			else sb.append(c);
		}
		return sb.toString();
	}
}