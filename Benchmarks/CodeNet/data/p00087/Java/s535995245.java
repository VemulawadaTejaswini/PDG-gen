import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				double a[] = new double[80];
				int p = 0;
				StringTokenizer st = new StringTokenizer(buf);
				while (st.hasMoreTokens()) {
					String s = st.nextToken();
					switch (s.charAt(0)) {
						case '+': a[p-2] += a[p-1]; p--; break;
						case '-': a[p-2] -= a[p-1]; p--; break;
						case '*': a[p-2] *= a[p-1]; p--; break;
						case '/': a[p-2] /= a[p-1]; p--; break;
						default : a[p++] = Double.parseDouble(s); break;
					}
				}
				System.out.println(a[0]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}