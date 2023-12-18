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
				BigDecimal a = new BigDecimal(buf);
				BigDecimal two = new BigDecimal("2.0");
				BigDecimal three = new BigDecimal("3.0");

				BigDecimal sum = new BigDecimal(buf);
				for (int i=2;i<=10;i++) {
					if (i%2==0) a = two.multiply(a);
					else a = a.divide(three,10,BigDecimal.ROUND_FLOOR);
					sum = sum.add(a);
				}
				System.out.println(sum.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}