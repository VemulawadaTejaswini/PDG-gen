import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int n;
		double x, y, r;

		while (!(line = br.readLine()).equals("-1")) {
			n = Integer.parseInt(line);
			x = 1;
			y = 0;
			r = Math.PI;
			for (int i = 1; i < n; i++) {
				r -= Math.PI / 2;
				x += Math.cos(r);
				y += Math.sin(r);
				r = Math.atan2(y, x) - Math.PI;
			}
			System.out.println(x + "\n" + y);
		}
	}
}