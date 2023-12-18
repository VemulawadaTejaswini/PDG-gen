import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader stdReader = new BufferedReader(new InputStreamReader(
				System.in));
		String line = stdReader.readLine();

		int x = Integer.parseInt(line);
		System.out.println(x * x * x);
	}
}
