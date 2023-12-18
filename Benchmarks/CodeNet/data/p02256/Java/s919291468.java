
import java.util.Scanner;

/*
 * if  0 then return 0
 * if x bigger than y return gcd of (y,x%y) 
 */

// how do you even submit this
public class Main {
	public static int gcd (int x, int y)
	{
		if (y==0) {
			return x;
		}
		else {
			return gcd(y,x%y);
		}
			
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
//		
//	
//		for (int i = 0; i < 16; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
//			System.out.println(gcd(a,b));
//		}
		System.out.println(gcd(a,b));
	}

}

