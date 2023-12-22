import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String str[] = s.split("");

		if (kaibun(str)) {
			String s1[] = s.substring(0, (str.length - 1) / 2).split("");
			String s2[] = s.substring((str.length + 3) / 2 - 1, str.length).split("");
			if (kaibun(s1) && kaibun(s2)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("No");
		}
	}

	static boolean kaibun(String str[]) {
		for (int i = 0; i < str.length; i++) {
			if (!str[i].equals(str[str.length - i - 1])) {
				return false;
			}
		}
		return true;
	}
}