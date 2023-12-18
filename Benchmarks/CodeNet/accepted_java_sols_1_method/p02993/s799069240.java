
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String S = in.readLine();
		char c = S.charAt(0);
		boolean result = true;
		for (int i = 1; i < S.length(); ++i) {
			if (c == S.charAt(i)) {
				result = false;
				break;
			}
			c = S.charAt(i);
		}
		String str = result ? "Good" : "Bad";
		System.out.println(str);
		in.close();
	}

}
