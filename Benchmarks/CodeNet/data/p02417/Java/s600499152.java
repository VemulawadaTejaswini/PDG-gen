import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int table[] = new int[26];
		while(in.hasNext()) {
			String s = in.nextLine();
			for (int i = 0; i < s.length(); i++) {
				char ch = Character.toLowerCase(s.charAt(i));
				if (Character.isAlphabetic(ch))
					table[ch - 'a']++;
			}
		}
		for(int i=0;i<26;i++) {
			char ch = (char) ('a' + i);
			System.out.println(ch + " : " + table[ch - 'a']);
		}
	}
}