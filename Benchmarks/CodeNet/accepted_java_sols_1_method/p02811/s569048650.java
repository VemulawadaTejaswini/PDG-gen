import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		String[] str = s.split(" ");
		int k = Integer.parseInt(str[0]);
		int x = Integer.parseInt(str[1]);

		if (500 * k >= x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		r.close();
	}
}