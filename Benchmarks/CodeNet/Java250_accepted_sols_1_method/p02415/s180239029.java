import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;

		try {
			while ((buffer = reader.readLine())  != null) {
				//String[] input = buffer.split(" ");
				char[] chars = buffer.toCharArray();
				for (int i = 0; i < chars.length; i++) {
					char ch = chars[i];
					if (Character.isLowerCase(ch)) {
						chars[i] = Character.toUpperCase(ch);
					}
					else {
						chars[i] = Character.toLowerCase(ch);
					}
				}
				System.out.println(String.valueOf(chars));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

