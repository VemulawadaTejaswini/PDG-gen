import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String input = br.readLine();
		for (int i = input.length() - 1; i > 0; i--) {
			System.out.print(input.charAt(i));
		}
		System.out.println(input.charAt(0));
	}
}