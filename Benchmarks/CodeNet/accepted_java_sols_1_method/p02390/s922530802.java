import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = null;
		try {
			input = br.readLine();
			br.close();
		} catch (IOException e) {
		}

		int s = Integer.parseInt(input);

		int h = s / 3600;
		s = s % 3600;

		int m = s / 60;
		s = s % 60;

		System.out.println(h + ":" + m + ":" + s);
	}
}
