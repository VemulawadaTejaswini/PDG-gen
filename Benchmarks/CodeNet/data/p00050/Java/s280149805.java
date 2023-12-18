
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String line = reader.readLine();
		String newline = line.replace("apple", "aaaaa")
				.replace("peach", "apple").replace("aaaaa", "peach");
		System.out.println(newline);

	}
}