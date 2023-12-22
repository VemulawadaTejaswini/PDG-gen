import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n  = sc.nextInt();
		
		double r = 2. * Math.PI * (double)n ;
		System.out.println(r);
	}
	
	
}