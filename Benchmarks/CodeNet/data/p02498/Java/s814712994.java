import java.util.Scanner;
class Main {
	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		String str;
		
		do {
			str = scr.next();
			StringBuffer stb = new StringBuffer(str);
			char c;
		
			for (int i = 0; i < str.length(); i++){
				c = str.charAt(i);
				if (c >= 'a' && c <= 'z'){
					stb.setCharAt(i, (char) (c - 'a' + 'A'));
				}
				if (c >= 'A' && c <= 'Z'){
					stb.setCharAt(i, (char) (c - 'A' + 'a'));
				}
			} 
			System.out.print(stb.toString());
			if (scr.hasNext())System.out.print(" ");
			
		} while (scr.hasNext());
		scr.close();
	}

}