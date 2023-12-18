import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		// ax + by = c
		// dx + ey = f

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		double a, b, c, d, e, f, x, y;

		try {
			while ((line = br.readLine()) != null) {
				a = Double.parseDouble(line.split(" ")[0]);
				b = Double.parseDouble(line.split(" ")[1]);
				c = Double.parseDouble(line.split(" ")[2]);
				d = Double.parseDouble(line.split(" ")[3]);
				e = Double.parseDouble(line.split(" ")[4]);
				f = Double.parseDouble(line.split(" ")[5]);

				x = (c * e - f * b) / (a * e - d * b);
				y = (c * d - f * a) / (b * d - e * a);

				x = Math.round(x * 1000) / 1000;
				y = Math.round(y * 1000) / 1000;

				System.out.println(String.format("%.3f %.3f", x, y));
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}