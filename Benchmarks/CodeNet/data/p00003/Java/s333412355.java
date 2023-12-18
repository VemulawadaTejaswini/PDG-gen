import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = (new BufferedReader(new InputStreamReader(System.in)));
		String line;
		br.readLine();
		while ((line = br.readLine()) != null) {
			String[] xyz = line.split(" ");
			int a = Integer.parseInt(xyz[0]);
			int b = Integer.parseInt(xyz[1]);
			int c = Integer.parseInt(xyz[2]);

			if (a > b && a > c) {
				printIsRightTriangle(a, b, c);
			} else if (b > a && b > c) {
				printIsRightTriangle(b, a, c);
			} else if (c > a && c > b) {
				printIsRightTriangle(c, b, a);
			} else {
				printIsRightTriangle(a, b, c);
			}
		}
	}

	public static void printIsRightTriangle(int long_value, int short_value1, int short_value2) {
		if ((long_value * long_value) == (short_value1 * short_value1 + short_value2 * short_value2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}