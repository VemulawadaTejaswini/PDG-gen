

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.StringTokenizer;
public class Main {

	static long expo(long base, long exp) {
		long t = 1L;
		while (exp > 0) {
			if (exp % 2 != 0)
				t = (t * base);

			base = (base * base);
			exp /= 2;
		}
		return t;
	}

	static int calcAngle(double h, double m) {

		int hour_angle = (int) (0.5 * (h * 60 + m));
		int minute_angle = (int) (6 * m);

		int angle = Math.abs(hour_angle - minute_angle);

		angle = Math.min(360 - angle, angle);

		return angle;
	}

	public static void main(String args[]) throws Exception {
		MyScanner sc = new MyScanner();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		double ans = 0.0;
		
		int angle = calcAngle(h, m);
		ans = (double)(a * a + b * b) - (double)((2.0 * a * b) * Math.cos((angle * Math.PI)/ 180.0));
		BigDecimal br = new BigDecimal(Double.toString(ans));
		br = br.sqrt(new MathContext(20));
		System.out.println(br);
	}

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}