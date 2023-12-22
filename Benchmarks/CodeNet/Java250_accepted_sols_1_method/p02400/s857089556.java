import java.util.Scanner;

public class Main {


	public static void main(String[] args){

		
		Scanner scan = new Scanner(System.in);
		double dbl = Double.parseDouble(scan.next());
		
		
		double p = 3.141592653589;
		double m;
		double c;
		
		m = dbl*dbl*p;
		c = dbl*2*p;
		
		
		
		System.out.printf("%.5f %.5f",m,c);
		}
}