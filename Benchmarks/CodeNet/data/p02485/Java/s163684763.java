import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			int sum = 0;
			while (true) {
				String line = reader.readLine();
				if (line.charAt(0) == '0')
					break;

				int i = 0, x;
				while (true) {
					char c = line.charAt(i);
					if (c == '\0')
						break;
					x = c - '0';
					sum += x;
					i++;
				}
				System.out.println(sum);
				sum = 0;
			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}