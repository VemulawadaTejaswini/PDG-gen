import java.util.Scanner;
public class Main{
public static void main(String[] args){
	Scanner scan  = new Scanner(System.in);
  	int a = scan.nextInt();
  	int b = scan.nextInt();
  	int h = scan.nextInt();
  	int m = scan.nextInt();
  
  	long double rad = (h/12 + (60/m)/12) - (m/60.0);
  
  	long double rpe = (a*a + b*b) - (2*a*b)*cosl(rad);
  	 
  	System.out.println(rpe);
  
}
}