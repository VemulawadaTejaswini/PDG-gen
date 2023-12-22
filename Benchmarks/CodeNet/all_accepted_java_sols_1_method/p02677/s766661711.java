import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double h = sc.nextDouble();
			double m = sc.nextDouble();
			
			double ret2 = Math.pow(a, 2)+Math.pow(b, 2)-2.0*a*b*Math.cos(Math.toRadians(Math.abs((60.0*h-11.0*m)/2)));
			double ret = Math.sqrt(ret2);
			System.out.println(ret);
			
		}
		
	}
