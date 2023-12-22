import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
	Scanner stdIn = new Scanner(System.in);
	
	int n = stdIn.nextShort();
	int n1 = 1;
	int n2;
	
	do {
	
		n2 = 100*n1 + 10*n1 + n1;
		
		if (n <= n2) {
			System.out.println(n2);
			return;
		}
		
		n1 = n1 + 1;
		
	} while (n1 <= 9);
	
	}
	
}