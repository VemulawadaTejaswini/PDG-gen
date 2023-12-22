import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String srgs[]) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] s = reader.readLine().split(" ");
			int A = Integer.parseInt(s[0]);
			int B = Integer.parseInt(s[1]);

			int c = (B - 1) / (A - 1);
			if ((B - 1) % (A - 1) != 0) {
				c += 1;
			}

			System.out.println(c);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
