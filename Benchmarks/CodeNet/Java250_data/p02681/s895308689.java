

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str = sr.next();
		String str2 = sr.next();
		boolean flag =  true; 
		for(int i = 0; i < str.length(); i++) {
			char  ch = str.charAt(i);
			char ch2 = str2.charAt(i);
			if(ch != ch2) {
				flag  = false;
				break;
			}
		}
		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
