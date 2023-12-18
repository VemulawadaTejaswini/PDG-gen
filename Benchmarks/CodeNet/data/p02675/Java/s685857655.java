
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		char c;
		
		if(str.length() == 1) {
			c = str.charAt(0);
			read(c);
		}else if(str.length() == 2) {
			c = str.charAt(1);
			read(c);
		}else {
			c = str.charAt(2);
			read(c);
		}
	}
	
	private static void read(char ch) {
		if(ch == '2' || ch == '4' || ch == '5' || ch == '7' || ch == '9') {
			System.out.println("hon");
		}else if(ch == '0' || ch == '1' || ch == '6' || ch == '8'){
			System.out.println("pon");
		}else {
			System.out.println("bon");
		}
	}

}
