import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		for ( int i = 0; i < a.length() ; i++) {
			if((char)a.charAt(i)=='7') {
				System.out.println("Yes");
				break;
			}
			if(i == a.length() - 1) {
				System.out.println("No");
			}
		}
		
	}
	
}
