import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = (new BufferedReader(new InputStreamReader(System.in)));
		StringBuilder sb = new StringBuilder();
		String line;
		br.readLine();
		while ((line = br.readLine()) != null) {
			String[] xyz = line.split(" ");
			int a = Integer.parseInt(xyz[0]);
			int b = Integer.parseInt(xyz[1]);
			int c = Integer.parseInt(xyz[2]);

			if (a > b && a > c) {
				sb.append(printIsRightTriangle(a, b, c));
			} else if (b > a && b > c) {
				sb.append(printIsRightTriangle(b, a, c));
			} else if (c > a && c > b) {
				sb.append(printIsRightTriangle(c, b, a));
			} else {
				sb.append(printIsRightTriangle(a, b, c));
			}
		}
		System.out.print(sb.toString());
	}

	public static String printIsRightTriangle(int long_value, int short_value1, int short_value2) {
		if ((long_value * long_value) == (short_value1 * short_value1 + short_value2 * short_value2)) {
			return "YES\n";
		} else {
			return "NO\n";
		}

	}
}