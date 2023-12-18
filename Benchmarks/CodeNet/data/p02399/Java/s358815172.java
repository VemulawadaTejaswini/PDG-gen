import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Long a = sc.nextLong();
		Long b = sc.nextLong();
		
		Long one = a / b;
		Long two = a % b;

Double x = a;
Double y = b;

		Double three = (Double)(x / y);
		
		System.out.println(one + " " + two + " " + three);

		
				
	}
}

