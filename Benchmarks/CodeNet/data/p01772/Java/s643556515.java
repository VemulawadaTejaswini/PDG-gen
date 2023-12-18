import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * A-Z Cat
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();
		Deque<Character> az = new ArrayDeque<>();

		boolean a = true;
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (c == 'A' && a) {
				az.add(c);
				a = false;
			}
			if (c == 'Z' && !a) {
				az.add(c);
				a = true;
			}
		}
		if (!az.isEmpty() && az.peekLast() == 'A') {
			az.pollLast();
		}

		if (!az.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			for (char c : az) sb.append(c);
			System.out.println(sb.toString());
		} else {
			System.out.println(-1);
		}
	}
}