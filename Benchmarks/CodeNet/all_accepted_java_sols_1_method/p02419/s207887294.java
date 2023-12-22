import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String word;
		int count = 0;
		word = in.readLine();
		while (true) {
			String[] text;
			text = in.readLine().split(" ");
			if (text[0].equals("END_OF_TEXT")) {
				break;
			}
			for (String str : text) {
				str = str.toLowerCase();
				if (str.matches(word)) {
					count++;
				} else {
					continue;
				}
			}
		}
		System.out.println(count);
	}
}