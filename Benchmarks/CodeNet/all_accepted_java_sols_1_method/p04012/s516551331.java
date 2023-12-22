import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		try (Scanner s = new Scanner(System.in)) {
			String str = s.next();
			int array[] = new int[26];
			int len = str.length();
			for (int i = 0; i < len; i++) {
				int x = str.charAt(i) - 'a';
				array[x]++;
			}
			boolean isGood = true;
			len = array.length;
			for (int i = 0; i < len; i++) {
				if (array[i] % 2 != 0) {
					isGood = false;
					break;
				}
			}
			System.out.println(isGood ? "Yes" : "No");
		}
	}
}
