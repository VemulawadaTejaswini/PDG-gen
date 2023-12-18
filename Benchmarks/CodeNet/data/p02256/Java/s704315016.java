import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		
		a = input.nextInt();
		b = input.nextInt();
		input.close();
		if(GreatestCommonDivisor(a,b) != -1) {
			System.out.println(GreatestCommonDivisor(a,b));
			
		}
		

	}
	
	public static int GreatestCommonDivisor(int a, int b) {
		if((a >= 1) && (a <= 1000000000) && (b >= 1) && (b <= 1000000000)) {
			
			if(a > b) {
				if((a % b) == 0) {
					return b;
				}
				else {
					return GreatestCommonDivisor(b, a % b);
				}
			}
			else if(b > a) {
				if((b % a) == 0) {
					return a;
				}
				else {
					return GreatestCommonDivisor(a, b % a);
				}
			}
			else {
				return a;
			}
		}
		else {
			System.out.println("Enter a number between 1 and 1000000000 for both numbers.");
			return -1;
		}
		
	}
	

}

