import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(factorial(num));
	}
	
	public static int factorial(int n) {
		int fact = 1;
		if(n == 0)
			return fact;
		else{
			for(int i = n; i > 0; i--)
				fact = fact * i;
			return fact;
		}
	}
}