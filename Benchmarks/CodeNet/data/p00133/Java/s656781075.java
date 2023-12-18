import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		char[][] pattern = new char[8][8];
		for (int i = 0; i < 8; i++) {
			line = br.readLine();
			for (int j = 0; j < 8; j++) {
				pattern[i][j] = line.charAt(j);
			}
		}
		for (int i = 1; i <= 3; i++) {
			pattern = rotate(pattern);
			System.out.println(i * 90);
			for (int j = 0; j < 8; j++) {
				System.out.println(new String(pattern[i]));
			}
		}
	}

	static char[][] rotate(char[][] pattern) {
		char[][] rotate = new char[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				rotate[j][7 - i] = pattern[i][j];
			}
		}
		return rotate;
	}
}