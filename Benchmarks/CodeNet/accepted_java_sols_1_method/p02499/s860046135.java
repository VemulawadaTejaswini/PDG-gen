import java.util.Scanner;
class Main {
	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		String str;
		int[] alpha = new int[26];
		
		 while (scr.hasNext()){
			str = scr.next();
			char c;
			
			for (int i = 0; i < str.length(); i++){
				c = str.charAt(i);
				if (c >= 'a' && c <= 'z'){
					alpha[c - 'a'] += 1;
				}
				else if (c >= 'A' && c <= 'Z'){
					alpha[c - 'A'] += 1;
				}
			}
			
		}
		
		for (int i = 0; i < 26; i++){
			System.out.printf("%c : %d\n", (char)('a' + i), alpha[i]);
		}
		
		scr.close();
	}
}