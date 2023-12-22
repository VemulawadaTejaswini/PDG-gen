import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);		
		int b = a.nextInt();
		int c  = b / 10;
		if(b % 10 == 7) {
		    System.out.println("Yes");
		}else if(b / 10 == 7) {
			System.out.println("Yes");
		}else if(b % 100 == 70) {
			System.out.println("Yes");	
		}else if(c % 10 == 7) {
			System.out.println("Yes");
		}else if(b / 100 == 7) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}	
	}
}