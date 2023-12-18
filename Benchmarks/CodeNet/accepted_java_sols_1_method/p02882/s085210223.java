import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			double x = scan.nextDouble();
			
			if(x<=a*a*b/2.0) {
			
				double radi = Math.atan(a*b*b/(2*x));
				double kakudo = Math.toDegrees(radi);
				System.out.println(kakudo);
				
			}else {
				
				double ans = 2*(a*a*b-x)/(a*a*a);
				
				double radi = Math.atan(ans);
				double kakudo = Math.toDegrees(radi);
				System.out.println(kakudo);
				
			}
			
			
			
			
		}
	}
}
