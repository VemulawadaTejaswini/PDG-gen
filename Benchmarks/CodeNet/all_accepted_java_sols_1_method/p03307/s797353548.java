import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		if (n % 2 == 1) {
			System.out.println(n * 2);
			return;
		}
		
		System.out.println(n);
		
	}

}