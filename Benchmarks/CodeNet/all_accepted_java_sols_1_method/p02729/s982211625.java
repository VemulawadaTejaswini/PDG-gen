import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner can = new Scanner(System.in);
		int n = can.nextInt();
		int m = can.nextInt();
		
		System.out.println((n * (n-1))/2 + (m * (m-1))/2);
		
		
	}
	
}
