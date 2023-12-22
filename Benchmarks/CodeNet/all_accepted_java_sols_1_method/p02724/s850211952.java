import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		
		System.out.println(((int)(money / 500) * 1000) + ((int)money % 500 / 5) * 5);
		
		
		
	}
	
}