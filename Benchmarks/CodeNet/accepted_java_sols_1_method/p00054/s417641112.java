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
				BigDecimal a = new BigDecimal(st.nextToken());
				BigDecimal b = new BigDecimal(st.nextToken());
				int n = Integer.parseInt(st.nextToken());

				BigDecimal d = a.divide(b,n+1,BigDecimal.ROUND_FLOOR);
				
				String s = d.toString();
				int c = 0;
				int sum = 0;
				while (s.charAt(c)!='.') c++;
				for (int i=c+1;i<=n+c;i++) {
					sum += Character.getNumericValue(s.charAt(i));
				}
				System.out.println(sum);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}