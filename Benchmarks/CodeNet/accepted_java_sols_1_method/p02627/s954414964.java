import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		char c = str.charAt(0);

		if (Character.isUpperCase(c)) {
			System.out.println("A");
		} else {
			System.out.println("a");
		}
	}
}