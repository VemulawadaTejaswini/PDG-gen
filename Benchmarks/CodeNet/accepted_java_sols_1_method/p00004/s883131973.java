import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		String s = br.readLine();
		StringTokenizer st;
		ArrayList<BigDecimal[]> list = new ArrayList<>();

		while (!(s == null || "".equals(s))) {
			st = new StringTokenizer(s);
			double a = Double.parseDouble(st
					.nextToken());
			double b = Double.parseDouble(st
					.nextToken());
			double c = Double.parseDouble(st
					.nextToken());
			double d = Double.parseDouble(st
					.nextToken());
			double e = Double.parseDouble(st
					.nextToken());
			double f = Double.parseDouble(st
					.nextToken());

			double x = (e * c - f * b) / (a * e
					- d * b);
			double y = (c * d - f * a) / (b * d
					- a * e);
			BigDecimal[] bd = new BigDecimal[2];
			bd[0] = new BigDecimal(x);
			bd[1] = new BigDecimal(y);
			list.add(bd);

			s = br.readLine();
		}

		for (BigDecimal bd[] : list) {
			DecimalFormat df = new DecimalFormat(
					"#.#");
			df.setMinimumFractionDigits(3);

			System.out.print(df.format(bd[0]));
			System.out.print(" ");
			System.out.println(df.format(bd[1]));

		}

	}

}