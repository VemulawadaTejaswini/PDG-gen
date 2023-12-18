import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			int s = 0;
			while (true) {
				String line = reader.readLine();
				if (line.charAt(0) == '0')
					break;

				int i = 0, x;
				while (i < args.length) {
					char c = line.charAt(i);
					x = c - '0';
					s += x;
				}
				System.out.println(s);
				s = 0;
				i++;
			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}