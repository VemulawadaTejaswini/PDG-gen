import java.util.Scanner;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double x = sc.nextDouble();
			
			if((a*a*b)/2.0<x) {
				double tan = (2.0*(a*a*b-x))/(a*a*a);
				
				double ret = Math.atan(tan);
				ret = ret*(180.0/Math.PI);
				
				System.out.println(ret);
				return;
			}else {
				double tan = (a*b*b)/(2.0*x);
				double ret = Math.atan(tan);
				ret = ret*(180.0/Math.PI);
				
				System.out.println(ret);
				return;
				
			}
			
			
			
	    }
		
	}
	
