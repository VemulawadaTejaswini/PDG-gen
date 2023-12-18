//import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args)
			throws java.io.IOException{
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();
		for(int i=0;i<n;i++){

			//scan.nextLine();
			BigDecimal x1,y1,x2,y2,x3,y3,x4,y4;
			x1= scan.nextBigDecimal();
			y1= scan.nextBigDecimal();
			x2= scan.nextBigDecimal();
			y2= scan.nextBigDecimal();
			x3=scan.nextBigDecimal();
			y3= scan.nextBigDecimal();
			x4= scan.nextBigDecimal();
			y4= scan.nextBigDecimal();
		
			try{
			if((((y2.subtract(y1)).multiply(x4.subtract(x3))).compareTo((y4.subtract(y3)).multiply(x2.subtract(x1))))==0){ System.out.println("YES");}
			else { System.out.println("NO");}
		}
			catch(ArithmeticException e){

	            System.out.println("No");

	        }
			
			}
	}
	
}