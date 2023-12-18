import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) {
		InputStreamReader reader = new InputStreamReader(System.in);
		int c;
		int counter[] = new int[26];
		try {
			while ((c = reader.read()) != -1) {
				c = Character.toLowerCase(c);
				int num = c - 'a';
				if (0 <= num && num < 26) {
					counter[num]++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 26; i++) {
			System.out.println(String.format("%c : %d", i + 'a', counter[i]));
		}
	}
}