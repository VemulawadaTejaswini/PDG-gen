import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int n = stdin.nextInt();
		System.out.println(fact(n));
		
		
	}
	
	public static int fact(int n) {
		
		return n == 0 ? 1 : n * fact(n - 1);
		
	}

}