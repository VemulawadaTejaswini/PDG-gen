import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		int a;
		int b;
		String inputString;
		Scanner keyboard = new Scanner(System.in);
		
		inputString = keyboard.nextLine();
		
		Scanner input = new Scanner(inputString);
		
		a = input.nextInt();
		b = input.nextInt();
		
		if(a == b) System.out.println(a);
		else System.out.println(gcd(a, b));
		
	}
	
	public static int gcd(int a, int b) {
		
		int r = 1;
		int big = 0;
		int little = 0;
		
		if(a > b) {
			r = a % b;
			big = a;
			little = b;
		}
		else if(a < b) {
			r = b % a;
			big = a;
			little = b;
		}
		
		while(r != 0) {
			
			big = little;
			little = r;
			r = big % little;
			
		}
		
		return little;
	}

}

