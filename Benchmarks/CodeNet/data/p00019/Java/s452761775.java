import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(factorial(n));
	}
	
	static int factorial(int n) {
		int fact = 1;
		
		for(int i = n; i > 0; i--) {
			fact*=i;
		}
		
		return fact;
	}
}