
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count[] = new int[26];
		while (scanner.hasNext()) {
			String sen = scanner.nextLine();
			String sen2 = sen.toLowerCase();
			for (int i = 0; i < sen2.length(); i++) {
				char key = sen2.charAt(i);
				int num = key - 'a';
				if (num >= 0) {
					count[num]++;
				}
			}
			if(!scanner.hasNext()) {
				break;}

		}
		for (int i = 0; i < 26; i++) {
			System.out.println((char) (i + 'a') + " : " + count[i]);
		}

	}
}

