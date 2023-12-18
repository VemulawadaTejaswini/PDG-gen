import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		int[] alphabet = new int[26];
		int check;
		while(true) {
			str = scan.nextLine();
			str = str.toLowerCase();
			if (str.equals("")) break;
			for (int i = 0; i < str.length(); i++) {
				check = Character.getNumericValue(str.charAt(i));
				if (check - 10 >= 0 && check - 10 <= 25) {
					alphabet[check - 10] += 1;
				}
			}
		}
		char[] ch;
		String str2;
		for (int i = 0; i < 26; i++) {
			ch = Character.toChars(i + 0x61);
			str2 = new String(ch);
			System.out.println(str2 + " : " + alphabet[i]);
		}
	}

}