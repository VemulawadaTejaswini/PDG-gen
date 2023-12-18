import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		final double r = sc.nextDouble();
		
		System.out.printf("%.7f %.7f\n", Math.PI * r * r, 2 * Math.PI * r);
		
	}
	
}