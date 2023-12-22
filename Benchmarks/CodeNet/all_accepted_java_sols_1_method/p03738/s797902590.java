
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b;
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		sc.close();
		
		if(a < b)System.out.println("LESS");
		else if(a > b)System.out.println("GREATER");
		else System.out.println("EQUAL");
		
		
	}

}
