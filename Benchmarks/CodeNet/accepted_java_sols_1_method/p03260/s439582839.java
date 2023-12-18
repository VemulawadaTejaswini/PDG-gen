import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		if (a * b == 1 || a * b == 3 || a * b == 9) {
			System.out.println("Yes");
			return;
		}
		else {
			System.out.println("No");
			return;
		}
	
	}
	
}