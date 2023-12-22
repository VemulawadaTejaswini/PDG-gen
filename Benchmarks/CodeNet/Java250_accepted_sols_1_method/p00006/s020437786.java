import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufReader =
				new BufferedReader(new InputStreamReader(System.in));
		String str = bufReader.readLine();
		char[] strChars = str.toCharArray();
		for (int i = 0; i < str.length()/2; i++) {
			char left = strChars[i];
			char right = strChars[str.length() - i - 1];
			strChars[i] = right;
			strChars[str.length() - i - 1] = left;
		}
		String result = new String(strChars);
		System.out.println(result);
	}

}