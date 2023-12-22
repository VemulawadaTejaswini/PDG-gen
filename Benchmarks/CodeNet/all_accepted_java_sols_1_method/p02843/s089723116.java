import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stringX = sc.next();
		
		if (stringX.length() <= 2) { 
			System.out.println(0);
			System.exit(0);
		}
		
		int a = Integer.parseInt(stringX.substring(stringX.length() -2));
		int b = Integer.parseInt(stringX.substring(0,stringX.length() -2));
		
		if (a <= b*5) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	
	}



}
