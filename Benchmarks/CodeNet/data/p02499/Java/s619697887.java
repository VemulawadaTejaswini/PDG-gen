

import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String input = scan.nextLine();
			if (input.isEmpty()) {
				break;
			}
			int[] array = new int[26];
			for (int i = 0; i < input.length(); i++) {
				String tmp = input.toLowerCase();
				Character temp = tmp.charAt(i);
				int num = temp - 'a';
				if (num < 0 || num > 25) {
					continue;
				}
				array[num] = array[num] + 1;
			}

			for (int i = 0; i < 26; i++) {
				int n = i + 'a';
				System.out.println((char) n + " : " + array[i]);
			}
		}

	}
}