import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, String> m = new HashMap<String, String>();
		String preString = sc.next();
		char lastChar = preString.charAt(preString.length() - 1);
		m.put(preString, preString);

		for (int i = 1; i < N; i++) {
			String string = sc.next();
			if (string.charAt(0) != lastChar || m.containsKey(string)) {
				System.out.println("No");
				return;
			}
			lastChar = string.charAt(string.length() - 1);
			m.put(string, string);
		}

		System.out.println("Yes");

		return;
	}
}
