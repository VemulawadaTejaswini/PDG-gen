import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		char[] array = new char[1200];
		int[] count = new int[26];
		int x = 0;

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		line = line.toLowerCase();
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) != ' ') {
				array[x] = line.charAt(i);
				x++;
			}
		}

		x = 0;
		while (array[x] != '.') {
			count[array[x] - 97]++;
			x++;
		}

		for (int i = 97; i < 97 + 26; i++) {
			System.out.printf("%c : %d\n", i, count[i - 97]);
		}
	}
}