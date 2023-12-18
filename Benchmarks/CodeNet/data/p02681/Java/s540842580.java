import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
	
		String in = scr.next();
		String out = scr.next();
		
		String a = out.substring(0,out.length()-1);
	
		if(in.equals(a)&&in.length() != out.length()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");	
		}
	
	}
}
