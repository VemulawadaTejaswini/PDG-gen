import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

//?????????
class Main {

	public static void main(String[] args)
			throws IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		String s = br.readLine();
		StringTokenizer st;
		double[] line = new double[9];
		while ((s = br.readLine()) != null) {
			st = new StringTokenizer(s, " ");
			line[0] = Double.parseDouble(st
					.nextToken());
			line[1] = Double.parseDouble(st
					.nextToken());
			line[2] = Double.parseDouble(st
					.nextToken());
			line[3] = Double.parseDouble(st
					.nextToken());
			line[4] = Double.parseDouble(st
					.nextToken());
			line[5] = Double.parseDouble(st
					.nextToken());
			returnCenter(line);

			line[8] = Math.sqrt((line[0]
					- line[6]) * (line[0]
							- line[6]) + (line[1]
									- line[7])
									* (line[1]
											- line[7]));

			for (int i = 6; i < 9; i++) {
				BigDecimal bds = new BigDecimal(
						line[i]);

				System.out
						.print(bds.setScale(3,
								BigDecimal.ROUND_HALF_UP));

				System.out
						.print(" ");
			}
			System.out
					.println("");

		}
	}

	private static void returnCenter(
			double[] line) {
		line[6] = ((line[1] - line[5]) * (line[1]
				* line[1] - line[3] * line[3]
				+ line[0] * line[0] - line[2]
						* line[2]) - (line[1]
								- line[3])
								* (line[1]
										* line[1]
										- line[5]
												* line[5]
										+ line[0]
												* line[0]
										- line[4]
												* line[4]))
				/ (2 * (line[1] - line[5])
						* (line[0] - line[2]) - 2
								* (line[1]
										- line[3])
								* (line[0]
										- line[4]));

		line[7] = ((line[0] - line[4]) * (line[0]
				* line[0] - line[2] * line[2]
				+ line[1] * line[1] - line[3]
						* line[3]) - (line[0]
								- line[2])
								* (line[0]
										* line[0]
										- line[4]
												* line[4]
										+ line[1]
												* line[1]
										- line[5]
												* line[5]))
				/ (2 * (line[0] - line[4])
						* (line[1] - line[3]) - 2
								* (line[0]
										- line[2])
								* (line[1]
										- line[5]));
	}

}