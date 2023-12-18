import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[256];

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			for (int i = 0; i < line.length(); i++) {
				char ch = Character.toLowerCase(line.charAt(i));
				if (ch >= 'a' && ch <= 'z') {
					array[ch]++;
				}
			}

			for (char ch = 'a'; ch <= 'z'; ch++) {
				System.out.println(ch + " : " + array[ch]);
			}
		}

		/**
		 * x = 0; while (array[x] != '.') { count[array[x] - 97]++; x++; }
		 * 
		 * for (int i = 97; i < 97 + 26; i++) { System.out.printf("%c : %d\n",
		 * i, count[i - 97]); }
		 **/
	}
}