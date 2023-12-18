import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		char[] inputArray = input.readLine().toCharArray();

		for (char c : inputArray) {
			System.out.print(Character.toUpperCase(c));
		}
		System.out.println();
	}
}