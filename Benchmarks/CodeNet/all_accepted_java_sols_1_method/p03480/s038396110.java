import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String S = in.readLine();
		int k = S.length();
		for (int i = 1; i < S.length(); ++i) {
			if (S.charAt(i - 1) != S.charAt(i)) {
				k = Math.min(k, Math.max(i, S.length() - i));
			}
		}
		System.out.println(k);
	}
}