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

				int count = 0;
				for (int a = 1; a <= n - 2; a++) {
					for (int b = a + 1; b <= n - 1; b++) {
						for (int c = b + 1; c <= n; c++) {
							if (a + b + c == x) count++;
						}
					}
				}
				System.out.println(count);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

