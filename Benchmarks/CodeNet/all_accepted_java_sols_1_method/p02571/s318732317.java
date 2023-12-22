import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		String t = in.readLine();
		int min = t.length();
		for (int i = 0; i <= s.length()-t.length(); i++) {
			int change = t.length();
			for (int j = 0; j < t.length(); j++) {
				if (t.charAt(j) == s.charAt(i+j))
					change--;
			}
			min = Math.min(change, min);
		}
		System.out.println(min);
	}
}
