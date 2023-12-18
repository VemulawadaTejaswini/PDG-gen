import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufReader =
				new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String read = bufReader.readLine();
			if (read == null) {
				break;
			}
			int n = Integer.parseInt(read);
			int match = 0;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					for (int k = 0; k < 10; k++) {
						for (int l = 0; l < 10; l++) {
							if (i + j + k + l == n) {
								++match;
							}
						}
					}
				}
			}
			System.out.println(match);
		}
	}

}