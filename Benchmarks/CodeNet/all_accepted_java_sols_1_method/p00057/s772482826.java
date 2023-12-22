import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			int n = Integer.parseInt(line);
			System.out.println(n * (n + 1) / 2 + 1);
			line = null;
		}

	}

}