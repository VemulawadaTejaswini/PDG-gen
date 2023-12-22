import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		final long a = sc.nextLong();
		final long b = sc.nextLong();
		
		System.out.printf("%d %d %.7f\n", (a / b), (a % b), (a / (double) b));
		
	}
	
}