import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		final int D = Integer.parseInt(str);
		
		if (D == 25) {
			System.out.println("Christmas");
		} else if (D == 24) {
			System.out.println("Christmas Eve");
		} else if (D == 23) {
			System.out.println("Christmas Eve Eve");
		} else if (D == 22) {
			System.out.println("Christmas Eve Eve Eve");
		}
	}
}
