import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int h, m, s;
			s = Integer.parseInt(line);

			h = s / 3600;
			s %= 3600;
			m = s / 60;
			s %= 60;
			System.out.format("%d:%d:%d\n", h, m, s);
		}
	}
}