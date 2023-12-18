import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int q = 0;
		while ((str = bin.readLine()) != null) {
			q++;
			String[] strs = str.split(" ");
			final int n = Integer.parseInt(strs[0]);
			final int s = Integer.parseInt(strs[1]);

			throw new IOException("num =" + n + ":" + s);
			// int num = 9, val = 0;
			// for (int i = n; i > 0; i--) {
			// val += (num * (n * i));
			// }
			// int count = 0;
			// if (val > s) {
			// count = count(n, s, new boolean[10], 0);
			// }
			// System.out.println(count);
		}
	}}