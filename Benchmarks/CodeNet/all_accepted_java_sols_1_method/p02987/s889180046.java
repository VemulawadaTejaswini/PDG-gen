import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String S = in.readLine();
		Map<Character, Integer> counts = new HashMap<>();
		for (int i = 0; i < S.length(); ++i) {
			Character c = S.charAt(i);
			if (counts.containsKey(c)) {
				counts.put(c, counts.get(c) + 1);
			} else {
				counts.put(c, 1);
			}
		}
		boolean result = true;
		for (Integer num : counts.values()) {
			if (num != 2) {
				result = false;
				break;
			}
		}
		String r = result ? "Yes" : "No";
		System.out.println(r);

		in.close();
	}

}