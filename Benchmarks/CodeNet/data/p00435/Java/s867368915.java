import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			char c;
			char[] decrypt = new char[line.length()];
			for (int i = 0; i < line.length(); i++) {
				c = line.charAt(i);
				c -= 3;
				if (c < 'A')
					c += 26;
				decrypt[i] = c;
			}
			System.out.println(new String(decrypt));
		}
	}
}