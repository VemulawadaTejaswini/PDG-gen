import java.util.Scanner;

public class Main {
	public static final int MAX = 256;

	public static void main(String[] args) {
		int i = 0, k = 0;
		char ch = 0, ch1 = 0;
		Scanner sc = new Scanner(System.in);
		int[] chars = new int[MAX];
		while (sc.hasNextInt()) {
			String line = sc.nextLine();
			for (i = 0; i < line.length(); i++) {
				ch = Character.toLowerCase(line.charAt(i));
				k = 0;
				for (ch1 = 'a'; ch1 <= 'z'; ch1++) {
					if (ch == ch1) {
						chars[k]++;
					}
					k++;
				}
			}
		}
		for (ch = 'a'; ch <= 'z'; ch++)
			System.out.printf("%c : %d\n", ch, chars[ch]);
	}
}