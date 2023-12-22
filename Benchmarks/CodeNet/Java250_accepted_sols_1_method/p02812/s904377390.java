import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String n = r.readLine();
		String s = r.readLine();

		int count = 0;
		while (s.contains("ABC")) {
			int index = s.indexOf("ABC");
			s = s.substring(index + 3, s.length());
			++count;
		}

		System.out.println(count);

		r.close();
	}
}