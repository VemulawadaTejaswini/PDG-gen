import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		// ?????????
		int debt = 100000;

		// n??±???
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; ++i) {

			debt *= 1.05;

			if (debt % 1000 != 0) {
				StringBuilder sb = new StringBuilder(String.valueOf(debt));

				int count = sb.length();
				sb.delete(count-3, count);
				sb.append("000");
				debt = Integer.parseInt(sb.toString());
				debt += 1000;
			}

		}
		System.out.println(debt);

	}
}