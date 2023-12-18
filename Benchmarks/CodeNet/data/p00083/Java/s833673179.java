import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	final static int[][] serials = { { 18680908, 1868, 9, 8 },
			{ 19120730, 1912, 7, 30 }, { 19261225, 1926, 12, 25 },
			{ 19890108, 1989, 1, 8 } };

	final static String[] eras = { "pre-meiji", "meiji", "taisho", "showa",
			"heisei" };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int[] serial = toSerial(line.split(" "));
			String era = "";

			for (int i = 0; i < 5; ++i) {
				if (i < 4) {
					if (serial[0] < serials[i][0]) {
						era = eras[i];
					}
				} else {
					era = eras[i];
				}
				if (!era.isEmpty()) {
					if (i > 0) {
						serial[1] -= serials[i - 1][1] - 1;
						era += " " + serial[1] + " " + serial[2] + " "
								+ serial[3];
					}
					break;
				}
			}
			System.out.println(era);
		}

	}

	static int[] toSerial(String[] units) {
		int y, m, d;
		y = Integer.parseInt(units[0]);
		m = Integer.parseInt(units[1]);
		d = Integer.parseInt(units[2]);
		return new int[] { y * 10000 + m * 100 + d, y, m, d };
	}
}