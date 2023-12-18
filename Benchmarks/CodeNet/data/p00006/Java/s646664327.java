import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] arg) throws NumberFormatException,
			IOException {
		InputStreamReader file = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = br.readLine();
		br.close();
		printReverseString(line);
	}

	private static void printReverseString(String line) {
		for(int i = line.length() - 1; i > -1; i--) {
			System.out.print(line.charAt(i));
		}
	}
}