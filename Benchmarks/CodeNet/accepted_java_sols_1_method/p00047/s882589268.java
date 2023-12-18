import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		char current = 'A';
		while ((line = br.readLine()) != null) {
			if (line.charAt(0) == current || line.charAt(2) == current)
				current = line.charAt(0) == current ? line.charAt(2) : line
						.charAt(0);
		}
		System.out.println(current);
	}
}