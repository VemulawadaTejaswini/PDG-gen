import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static int[] cal = { 0, 31, 60, 91, 121, 152, 182, 213, 244, 274,
			305, 335 };

	private static String[] day = { "Wednesday", "Thursday", "Friday",
			"Saturday", "Sunday", "Monday", "Tuesday" };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			if (line.equals("0 0"))
				break;

			int m = Integer.parseInt((line.split(" ")[0])) - 1;
			int d = Integer.parseInt((line.split(" ")[1]));
			System.out.println(day[(cal[m] + d) % 7]);
		}
	}
}