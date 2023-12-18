import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		List<Double[]> results = new ArrayList<Double[]>();
		
		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			if (!st.hasMoreTokens()) break;
			
			double a = Integer.parseInt(st.nextToken());
			double b = Integer.parseInt(st.nextToken());
			double c = Integer.parseInt(st.nextToken());
			double d = Integer.parseInt(st.nextToken());
			double e = Integer.parseInt(st.nextToken());
			double f = Integer.parseInt(st.nextToken());
			double i = a;
			double j = d;
			
			a = a * j;
			b = b * j;
			c = c * j;
			d = d * i;
			e = e * i;
			f = f * i;
						
			double y = (c - f) / (b - e);
			double x = (c - b * y) / a;
			
			if (x == -0) x = 0;
			if (y == -0) y = 0;
			
			BigDecimal xb = new BigDecimal(x);
			BigDecimal yb = new BigDecimal(y);
			
			results.add(new Double[] {
				xb.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue(), 
				yb.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue()
			});
		}
		
		for (Double[] ans : results) {
			System.out.printf("%.3f %.3f\n", ans[0], ans[1]);
		}
	}
}