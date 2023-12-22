import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		final int AB = Integer.parseInt(str.split(" ")[0]);
		final int BC = Integer.parseInt(str.split(" ")[1]);

		System.out.println(AB * BC / 2);
	}
}
