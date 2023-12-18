import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> al = new ArrayList<String>();

		int cnt = Integer.parseInt(br.readLine());
		int j = 0;
		while (j < cnt) {
			al.add(br.readLine());
			j++;
		}

		for (int i = 0; i < al.size(); i++) {
			double px;
			double py;
			double r;
			String[] buf = al.get(i).split(" ");

			double x1 = Double.parseDouble(buf[0]);
			double y1 = Double.parseDouble(buf[1]);
			double x2 = Double.parseDouble(buf[2]);
			double y2 = Double.parseDouble(buf[3]);
			double x3 = Double.parseDouble(buf[4]);
			double y3 = Double.parseDouble(buf[5]);

			double a = 2 * (x2 - x1);
			double b = 2 * (y2 - y1);
			double c = x1 * x1 - x2 * x2 + y1 * y1 - y2 * y2;
			double d = 2 * (x3 - x1);
			double e = 2 * (y3 - y1);
			double f = x1 * x1 - x3 * x3 + y1 * y1 - y3 * y3;

			BigDecimal bdr;
			BigDecimal bdpx;
			BigDecimal bdpy;
			
			bdpx = new BigDecimal(px=(b * f - e * c) / (a * e - d * b));
			bdpy = new BigDecimal(py=(c * d - f * a) / (a * e - d * b));
			bdr = new BigDecimal(Math.sqrt((x1 - px) * (x1 - px)
					+ (y1 - py) * (y1 - py)));
			
			//px = (b * f - e * c) / (a * e - d * b);
			//py = (c * d - f * a) / (a * e - d * b);
			// r = Math.sqrt((x1 - px) * (x1 - px) + (y1 - py) * (y1 - py));
			
			
			px=bdpx.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
			py=bdpy.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
			r = bdr.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
			System.out.printf("%4.3f %4.3f %4.3f", px, py, r);
		}
	}
}