import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String s = sc.next();

			char searchChar = 'a';
			char endChar = 'z';

			while (searchChar <= endChar) {
				String searchStr = Character.toString(searchChar);
				if (s.indexOf(searchChar) == -1) {
					System.out.println(searchStr);
					return;
				} else {
					s = s.replaceAll(searchStr, "");
				}
				searchChar++;
			}
			System.out.println("None");
		} finally {
			sc.close();
		}
	}
}