import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String w = str;
		str = br.readLine();
		Boolean isEnd = str.equals("END_OF_TEXT");
		int count = 0;
		while (!isEnd) {
			String[] words = str.split(" ", 0);
			for (String word : words) {
				if (word.equalsIgnoreCase(w) == true) {
					count = count + 1;
				}
			}
			str = br.readLine();
			isEnd = str.equals("END_OF_TEXT");
		}
		System.out.println(count);
	}
}