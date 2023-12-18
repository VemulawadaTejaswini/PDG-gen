import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = new char[20];
		br.read(input);

		for (int i = input.length; i > 0; i--) {
			System.out.print(input[i - 1]);
		}
		System.out.println();

	}
}