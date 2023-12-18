import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XCubic {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s;
		try {
			s = reader.readLine();
			int x = Integer.parseInt(s);
			System.out.println(x * x * x);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}