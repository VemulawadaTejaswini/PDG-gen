import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		int count = 0;

		for (int i = 0; i < 4; i++) {
			if (s.charAt(i) == '+') {
				count++;
			} else {
				count--;
			}
		}

		System.out.println(count);

	}

}
