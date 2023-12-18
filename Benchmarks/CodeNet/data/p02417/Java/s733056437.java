import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int[] alphabet = new int[26];

		for(int i = 0; i < s.length(); i++){
			int n = Character.getNumericValue(s.charAt(i));

			if(n-10 >= 0 && n-10 < 26)
			alphabet[n-10] += 1;
		}

		char[] ch;

		for(int i = 0; i < 26; i++){
			ch = Character.toChars(i + 0x61);
			s = new String(ch);
			System.out.println(s + " : " + alphabet[i]);
		}
	}
}