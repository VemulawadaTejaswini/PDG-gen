import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			double W = scan.nextDouble();
			double H = scan.nextDouble();
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			
			
			if(x==W/2.0&&y==H/2.0) {
				System.out.println(H*W/2);
				System.out.println(1);
			}else{
				System.out.println(H*W/2);
				System.out.println(0);
			}
				
			/*
				double cx =W/2.0; 
				double cy =H/2.0; 
				
				if(x==cx||y==cy||y==(H/W)*x||y==(-H/W)*x+H) {
					
				}else {
					double a = (y-cy)/(x-cx);
					
					
					
				}
				
				
				
				double jyou = cy-a*cx;
				double kate = a*(double)W+cy-a*cx;
				System.out.println((jyou+kate)*(double)W/2.0);
				System.out.println(0);*/
				
			
			
			
			
			
			
			
		}
		
		
	}
		

}
