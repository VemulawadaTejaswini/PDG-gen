import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String t = br.readLine();

		boolean flag = false;

		for (int i = 0; i < t.length(); i++) {
			if (t.equals(s)) {
				flag = true;
				break;
			}
			s = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
		}

		System.out.println(flag ? "Yes" : "No");

	}

}
