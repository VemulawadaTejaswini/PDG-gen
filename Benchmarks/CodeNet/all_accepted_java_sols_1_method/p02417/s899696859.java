import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int[] counter = new int[26];
		while ((str = br.readLine()) != null) {
			if (str.equals(""))
				break;
			str = str.toLowerCase();
			char[] ch = str.toCharArray();
			for (char c : ch) {
				if ('a' <= c && c <= 'z') {
					counter[c - 'a']++;
				}
			}
		}

		for (int i = 0; i < counter.length; i++) {
			System.out.println((char) ('a' + i) + " : " + counter[i]);
		}

	}
}