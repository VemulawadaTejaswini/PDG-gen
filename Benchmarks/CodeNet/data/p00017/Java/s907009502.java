import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		try {
			while ((line = br.readLine()) != null) {
				line.trim();

				char[] decode = line.toCharArray();

				for (int j = 0; j < 26; j++) {
					int i = 0;
					for (char c : decode) {
						if (c >= 'a' && c <= 'z') {
							if(c == 'z')  decode[i] = 'a';
							else decode[i]++;
						}
						i++;
					}
					String str = new String(decode);
					 if (str.contains("this") || str.contains("the")
		                        || str.contains("that"))  break;
				}
				System.out.println(decode);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}