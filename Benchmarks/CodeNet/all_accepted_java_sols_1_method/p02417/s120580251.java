import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		String str;
		int[] count = new int[26];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while ((str = br.readLine()) != null) {
			str = str.toLowerCase();
			char[] cArray = str.toCharArray();
			for (char c : cArray) {
				if ((c - 'a') >= 0 && (c - 'a') <= 26 ) {
					count[c - 'a']++;
				}
			}
		}
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.printf("%s : %d%n", c, count[c - 'a']);
		}
	}
}