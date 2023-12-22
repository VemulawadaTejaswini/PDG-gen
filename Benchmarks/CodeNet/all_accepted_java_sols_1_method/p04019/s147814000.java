import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		if (input.indexOf("N") == -1) {
			if (input.indexOf("S") != -1) {
				System.out.println("No");
				return;
			}

		} else {
			if (input.indexOf("S") == -1) {
				System.out.println("No");
				return;
			}
		}

		if (input.indexOf("E") == -1) {
			if (input.indexOf("W") != -1) {
				System.out.println("No");
				return;
			}
		} else {
			if (input.indexOf("W") == -1) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");

	}
}
