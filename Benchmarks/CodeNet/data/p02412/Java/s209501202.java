import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;

		try {
			while ((buffer = reader.readLine())  != null) {
				String[] strings = buffer.split(" ");

				int n = Integer.valueOf(strings[0]);
				int x = Integer.valueOf(strings[1]);

				if (n == 0 && x == 0) return;

				//int sa = n * 3 - 3 - 6;
				System.out.println(x - 3 * n + 8);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

