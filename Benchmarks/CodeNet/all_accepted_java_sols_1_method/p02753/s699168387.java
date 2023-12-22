import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		if (str.equals("AAA") || str.equals("BBB")) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}