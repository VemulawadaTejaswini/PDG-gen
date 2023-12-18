import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long one = a / b;
		long two = a % b;

double x = a;
double y = b;

		double three = x / y;
		
		System.out.println(one + " " + two + " " + three);

		
				
	}
}

