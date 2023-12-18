import java.util.Scanner;

class Main {
	static int Fibonacci (int n) {
		
		return ( n == 0 || n == 1)?n:Fibonacci(n - 2) + Fibonacci(n - 1);
	}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = Fibonacci (scan.nextInt());
		scan.close();
		System.out.println(n);
	}
}

