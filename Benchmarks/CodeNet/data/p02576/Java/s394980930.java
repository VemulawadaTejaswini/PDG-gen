import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double n  = sc.nextDouble();
		double x  = sc.nextDouble();
		double t  = sc.nextDouble();

		System.out.println((Math.ceil(n / x)) * t);
		sc.close();
	}
}


