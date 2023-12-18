import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] count = new int[26];
		while (true) {
			char ch = (char) System.in.read();
			if (ch == (char) -1)
				break;
			else if (ch >= 65 && ch <= 90)
				ch += 32;
			if (ch >= 97 && ch <= 122)
				count[ch - 97]++;
		}
		for (int i = 0; i < 26; i++) {
			System.out.printf("%c:%d\n", i + 97, count[i]);
		}
	}

}