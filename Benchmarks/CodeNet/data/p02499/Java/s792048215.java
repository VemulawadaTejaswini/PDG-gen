import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] srgs) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			int[] count = new int[26];
			for(int i=0; i<26; i++) {
				count[i] = 0;
			}
			for(int i=0; i<line.length(); i++) {
				char s = line.charAt(i);
				if(s>='A' && s<='Z') {
					count[s-'A']++;
				} else if(s>='a' && s<='z') {
					count[s-'a']++;
				}
			}
			for(int i=0; i<26; i++) {
				char x = 'a';
				x += i;
				System.out.println(x + " : " + count[i]);
			}
		} catch(IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e) {
			System.out.println("??\????????£????????????????????????");
		}
	}
}