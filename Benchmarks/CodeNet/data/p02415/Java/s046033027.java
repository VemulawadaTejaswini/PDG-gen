
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			String s=str.substring(i,(i+1));
			if(s.matches("[A-Z]")) {
				String ss=s.toLowerCase();
				System.out.print(ss);
			}else if(s.matches("[a-z]")) {
				String ss=s.toUpperCase();
				System.out.print(ss);
			}else {
				System.out.print(s);
			}
			if(i==str.length()-1) {
				System.out.println();
			}
		}
	}
}

