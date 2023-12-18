import java.util.*;
 
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);          
	
	double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double x = c - a;
        double y = d - b;
        double f = (x * x) + (y * y);
        double g = Math.sqrt(f);
        
	System.out.printf("%.6f\n", g);
 
	}
}
