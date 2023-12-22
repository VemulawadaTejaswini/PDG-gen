import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		br.close();

		if (s[2] == s[3] && s[4] == s[5]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
