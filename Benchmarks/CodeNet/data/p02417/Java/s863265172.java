import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		String str = input.readLine();
		str = str.toLowerCase();
		int a[] = new int[26];
		while((str=input.readLine())!=null){
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch <= 'z' && ch >= 'a') {
					a[ch - 97]++;
				}

			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.println((char) ('a' + i) + " : " + a[i]);
		}

	}

}