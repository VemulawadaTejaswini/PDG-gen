import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int n2;
		int divisor = 0;
		int div8 = 0;
		
		if (n % 2 == 0) {
			n = n - 1;
		}
		
		do {
		
			n2 = n;
			
			do {
			
				if (n % n2 == 0) {
					divisor = divisor + 1;
				}
				
				n2 = n2 - 1;
						
			} while (n2 >= 1);
				
				if (divisor == 8) {
					div8 = div8 + 1;
				}
		
				divisor = 0;
				n = n - 2;
							
		} while (n >= 1);
		
	System.out.println(div8);
		
	}

}