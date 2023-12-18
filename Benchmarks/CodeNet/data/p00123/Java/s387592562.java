import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Speed Skating Badge Test
 */
public class Main {

	static final double TIME_NA = 361.0;

	static final String[] RANK = {
			"AAA",
			"AA",
			"A",
			"B",
			"C",
			"D",
			"E",
			"NA",
	};

	static final double[] TIME1 = {
			35.5,
			37.5,
			40.0,
			43.0,
			50.0,
			55.0,
			70.0,
			TIME_NA,
	};

	static final double[] TIME2 = {
			71.0,
			77.0,
			83.0,
			89.0,
			95.0,
			116.0,
			148.0,
			TIME_NA,
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			double t1, t2;
			t1 = Double.parseDouble(line.substring(0, line.indexOf(' ')));
			t2 = Double.parseDouble(line.substring(line.indexOf(' ') + 1));

			int r1 = 0, r2 = 0;
			for (; r1 < RANK.length; r1++) if (t1 < TIME1[r1]) break;
			for (; r2 < RANK.length; r2++) if (t2 < TIME2[r2]) break;

			System.out.println(RANK[Math.max(r1, r2)]);

		}
	}
}