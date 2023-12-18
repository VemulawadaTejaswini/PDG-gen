import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		// Scanner???.nextLine()??§???????°????null???????´?????????????
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		int[] alphabet = new int[26];
		int check;
		while(str != null) {
			str = str.toLowerCase();
			for (int i = 0; i < str.length(); i++) {
				check = Character.getNumericValue(str.charAt(i));
				if (check - 10 >= 0 && check - 10 <= 25) {
					alphabet[check - 10] += 1;
				}
			}
			str = input.readLine();
		}
		char[] ch;
		String str2;
		for (int i = 0; i < 26; i++) {
			ch = Character.toChars(i + 0x61);
			str2 = new String(ch);
			System.out.println(str2 + " : " + alphabet[i]);
		}
	}

}