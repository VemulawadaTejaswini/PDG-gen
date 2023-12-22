import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String input = "";
		try {
			input = br.readLine();
			// String str2 = br.readLine();
		} catch (IOException e) {
		}

		for (int i = 0; i < input.length(); i++)
			System.out.print(input.charAt(i) == ',' ? ' ' : input.charAt(i));
	}
}
