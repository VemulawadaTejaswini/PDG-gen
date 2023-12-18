import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder output = new StringBuilder();
		int c;
		try {
			while ((c = buf.read()) != (int)'\n') {
				if (Character.isUpperCase((char) c)) {
					output.append(Character.toLowerCase((char) c));
				} else if (Character.isLowerCase((char) c)) {
					output.append(Character.toUpperCase((char) c));
				} else {
					output.append((char) c);
				}
			}
			System.out.println(output);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}