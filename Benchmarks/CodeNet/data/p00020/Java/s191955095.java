import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		char[] inputArray = input.readLine().toCharArray();

		for (char c : inputArray) {
			if (c == ' ' | c == '.' | c == Character.toLowerCase(c)) {
				System.out.print(c);
			} else {
				System.out.print(Character.toLowerCase(c));
			}
		}
	}
}