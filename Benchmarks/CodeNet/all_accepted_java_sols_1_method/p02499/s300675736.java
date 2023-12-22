import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner (System.in);
		
		String str;
	
		int buf[] = new int[30];
		char c;
		
		while (scan.hasNext()){
			str = scan.nextLine();
			
			for (int i = 0; i < str.length(); i++){
				c = str.charAt(i);
				if ('a' <= c && c <= 'z'){
					buf[c - 'a']++;
				}
				if ('A' <= c && c <= 'Z'){
					buf[c - 'A']++;
				}
			}
		}
		
		for (int i = 0; i < 26; i++){
			System.out.printf("%c : %d\n", 'a' + i, buf[i]);
		}
	}
}