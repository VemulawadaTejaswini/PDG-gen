import java.util.Scanner;	
public class Main{	
   public static void main(String args[]){	
      Scanner sc = new Scanner(System.in);	
      double radius = sc.nextDouble();	
      double area = Math.PI * (radius * radius);	
      System.out.printf("%.6f",area);	
      double circumference= Math.PI * 2*radius;	
      System.out.printf(" %.6f",circumference) ;	
   }	
}	
	
