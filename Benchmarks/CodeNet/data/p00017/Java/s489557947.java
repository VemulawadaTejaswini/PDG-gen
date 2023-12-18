import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null) {
			String[] wordstr = str.split(" ", 0);
			int shift = Search(wordstr);
			if (shift==-0) break;
			Print(shift, wordstr);
			str = br.readLine();
		}
	}

	private static int Search(String[] words) {
		for (int i = 0; i < words.length; i++) {
			char[] ch = words[i].toCharArray();
			char[] ch2;
			if (ch[ch.length - 1] == 46) {
				ch2 = new char[ch.length - 1];
				System.arraycopy(ch, 0, ch2, 0, ch.length - 1);
			} else {
				ch2 = new char[ch.length];
				ch2 = ch;
			}
			if (ch2.length == 3) {

				for (int k = 0; k < 26; k++) {
					int a = 97 + ((ch2[0] - 97 + k) % 26);
					int b = 97 + ((ch2[1] - 97 + k) % 26);
					int c = 97 + ((ch2[2] - 97 + k) % 26);
					if (a == 116 && b == 104 && c == 101) {
						return k;
					}
				}
			} else if (ch2.length == 4) {
				for (int k = 0; k < 26; k++) {
					int a = 97 + ((ch2[0] - 97 + k) % 26);
					int b = 97 + ((ch2[1] - 97 + k) % 26);
					int c = 97 + ((ch2[2] - 97 + k) % 26);
					int d = 97 + ((ch2[3] - 97 + k) % 26);
					if ((a == 116 && b == 104 && c == 105 && d == 115)
							|| (a == 116 && b == 104 && c == 97 && d == 116)) {
						return k;
					}
				}
			}
		}
		return -0;
	}

	private static void Print(int n, String[] words) {
		for (int i = 0; i < words.length; i++) {
			char[] ch = words[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (i == words.length - 1 && j == words[i].length() - 1
						&& ch[j] == 46) {
					System.out.print(".");
				} else {
					System.out.print((char) (97 + ((ch[j] - 97 + n) % 26)));
				}
			}
			if (i != words.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}