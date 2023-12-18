import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] cnt = new int[26];
		
		while ((line = br.readLine()) != null) {
			line = line.toLowerCase();
			for (char c : line.toCharArray()) {
				if ('a' <= c && c <= 'z') {
					cnt[c - 'a']++;
				}
			}
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.println((char)('a' + i) + " : " + cnt[i]);
		}
	}

}