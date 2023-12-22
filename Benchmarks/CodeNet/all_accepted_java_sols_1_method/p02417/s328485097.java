import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) {
		String str1 = "", str2;
		int c = 0, count[], num1, num2, i = 0;
		char ch;
		count = new int[26];
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			while (true) {
				c = isr.read();
				if (c == -1) {
					break;
				}
				ch = (char) c;
				if (ch <= 'z' && ch >= 'a') {
					num1 = ch - 'a';
					++count[num1];
				} else if (ch <= 'Z' && ch >= 'A') {
					num2 = ch - 'A';
					++count[num2];
				}
				str2 = String.valueOf(ch);
				str1 = str1 + str2;
			}
			for (i = 0; i < 26; ++i) {
				num1 = i + 'a';
				ch = (char) num1;
				System.out.println(ch + " : " + count[i]);
			}
			isr.close();

		} catch (IOException e) {

		}
	}

}

