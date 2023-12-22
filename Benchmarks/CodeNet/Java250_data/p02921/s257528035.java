import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;;

public class Main {
	public static void main(String srgs[]) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = reader.readLine();
			String t = reader.readLine();

			int count = 0;

			for (int i = 0; i < 3; i++) {
				if (s.charAt(i) == t.charAt(i)) {
					count += 1;
				}
			}

			System.out.println(count);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
