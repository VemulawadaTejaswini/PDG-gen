import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static final int LEN = 6;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split("");
		if (s != null) {
			if (s.length == LEN) {
				System.out.println(s[2].equals(s[3]) && s[4].equals(s[5]) ? "Yes" : "No");
			}
		}
	}
}
