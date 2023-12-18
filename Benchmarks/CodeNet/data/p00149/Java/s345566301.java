import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int[] leyes = new int[4];
		int[] reyes = new int[4];
		int l, r;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			l = (int) (Double.parseDouble(line.substring(0, line.indexOf(' '))) * 10.0);
			r = (int) (Double
					.parseDouble(line.substring(line.indexOf(' ') + 1)) * 10.0);
			leyes[eyesight(l)]++;
			reyes[eyesight(r)]++;
		}
		for (int i = 3; i >= 0; i--) {
			System.out.println(leyes[i] + " " + reyes[i]);
		}
	}

	static int eyesight(int n) {
		if (n < 9) {
			return n / 3;
		} else {
			return n / 11 + 2;
		}
	}
}