import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int h = Integer.parseInt(str[2]);
		int m = Integer.parseInt(str[3]);

		double mk = (double) (m * 360) / 60;
		double hk = (double) (h * 60 + m) * 360 / (12 * 60);

		double sita = Math.abs(mk - hk);
		double cos = Math.cos((double) sita / 180 * Math.PI);

		double naiseki = a * b * cos;
		double ans = a * a + b * b - 2 * naiseki;

		System.out.println(Math.sqrt(ans));
	}
}
