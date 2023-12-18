import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] cnt = new int[26];
		String line;
		while ((line = br.readLine()) != null) {
			char[] chars = line.toCharArray();
			for (char c : chars) {
				if (!isLowerCase(c) && !isUpperCase(c))
					continue;

				cnt[toLowerCase(c) - 'a']++;
			}
		}

		for (int i = 0; i < cnt.length; i++) {
			System.out.print((char) ('a' + i));
			System.out.println(" : " + cnt[i]);
		}
	}
}