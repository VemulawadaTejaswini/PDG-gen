
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static long MOD = 1000000007L;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String s1 = in.readLine();
		String s2 = in.readLine();
		for (int i = 0; i < s1.length(); ++i) {
			if (s1.charAt(i) != s2.charAt(2 - i)) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

	}
}
