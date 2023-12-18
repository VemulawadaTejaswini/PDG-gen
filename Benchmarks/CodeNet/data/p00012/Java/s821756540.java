import java.io.*;
class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader reader =
			new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] values = line.split(" ");

			double x1 = Double.parseDouble(values[0]);
			double y1 = Double.parseDouble(values[1]);
			double x2 = Double.parseDouble(values[2]);
			double y2 = Double.parseDouble(values[3]);
			double x3 = Double.parseDouble(values[4]);
			double y3 = Double.parseDouble(values[5]);
			double xp = Double.parseDouble(values[6]);
			double yp = Double.parseDouble(values[7]);

			double area12 = area(xp, yp, x1, y1, x2, y2);
			double area23 = area(xp, yp, x2, y2, x3, y3);
			double area31 = area(xp, yp, x3, y3, x1, y1);
			double area123 = area(x1, y1, x2, y2, x3, y3);

			String result = area12 + area23 + area31 - area123 < 0.0001 ? "YES" : "NO";
			System.out.println(result);
		}

	}

	static double area(double x1, double y1, double x2, double y2, double x3, double y3) {
		return 0.5 * Math.abs((x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1));
	}

}