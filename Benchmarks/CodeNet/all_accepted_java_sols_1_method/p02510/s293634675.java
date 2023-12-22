import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				String s = reader.readLine();
				String c;
				if (s.equals("-"))
					break;
				String x = reader.readLine();
				int m = Integer.parseInt(x);
				for (int i = 0; i < m; i++) {
					String H = reader.readLine();
					int h = Integer.parseInt(H);
					c = s.substring(h) + s.substring(0, h);
					s = c;
				}
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}