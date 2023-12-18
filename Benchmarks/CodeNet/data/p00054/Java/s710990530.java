import java.io.*;
import java.util.StringTokenizer;
import java.math.BigDecimal;

class Main {
	public static void main (String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(buf);
				BigDecimal a = new BigDecimal(Double.parseDouble(st.nextToken()));
				BigDecimal b = new BigDecimal(Double.parseDouble(st.nextToken()));
				int n = Integer.parseInt(st.nextToken());

				double d = a.divide(b,n+1,BigDecimal.ROUND_HALF_UP).doubleValue();
				int sum = 0;
				for (int i=0;i<n;i++) {
					d *= 10;
					sum += Math.floor(d)%10;
				}
				System.out.println(sum);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}