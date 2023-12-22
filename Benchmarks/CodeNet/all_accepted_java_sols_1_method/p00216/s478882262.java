import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		final int l = 4280;

		while (!(line = br.readLine()).equals("-1")) {
			int w = Integer.parseInt(line);
			int t = 1150;

			if (w > 10)
				t += (w - 10) * 125;
			if (w > 20)
				t += (w - 20) * 15;
			if (w > 30)
				t += (w - 30) * 20;
			System.out.println(l - t);
		}
	}
}