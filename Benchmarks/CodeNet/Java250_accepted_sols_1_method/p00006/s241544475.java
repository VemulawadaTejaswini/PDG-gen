import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * AOJ 0006 Reverse Sequence
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder(bufferedReader.readLine());
		System.out.println(builder.reverse());
	}
}