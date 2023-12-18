import static java.lang.System.*;

import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char c[] = new char[26];
		int count[] = new int[26];
		for(int ab = 0; ab < 26; ab++) {
			c[ab] = (char)('a' + ab);
		}
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			for(int a = 0; a < str.length(); a++) { // 文字数
				for(int b = 0; b < 26; b++) {       // アルファベット
					if(String.valueOf(str.charAt(a)).equalsIgnoreCase(String.valueOf(c[b]))) {       
						count[b] += 1;
					}
				}
			}
		}
		for(int a = 0; a < 26; a++) {
			out.println(c[a] + " : " + count[a]);
		}
	}
}
