import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int l, a, b, c, d;
			l = parseInt(line);
			a = parseInt(br.readLine());
			b = parseInt(br.readLine());
			c = parseInt(br.readLine());
			d = parseInt(br.readLine());
			int ac, bd;
			ac = (a % c > 0) ? a / c + 1 : a / c;
			bd = (b % d > 0) ? b / d + 1 : b / d;
			System.out.println(ac > bd ? l - ac : l - bd);
		}
	}
}