    import java.util.Scanner;
    public class Main{
    public static void main(String[] args){
    	Scanner scan  = new Scanner(System.in);
      	double a = scan.nextInt();
      	double b = scan.nextInt();
      	double h = scan.nextInt();
      	double m = scan.nextInt();
      
      	double rad = (h/12 + (60/m)/12) - (m/60.0);
      
      	double rpe = (a*a + b*b) - (2*a*b)*cosl(rad);
      	 
      	System.out.println(rpe);
      
    }
    }