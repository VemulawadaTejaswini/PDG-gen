import java.util.*;
 
class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	double a = sc.nextDouble(), b = sc.nextDouble();
    	int C = sc.nextInt();
    	
    	double S = 0.5 * a * b * Math.sin(Math.toRadians(C));
    	double L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(C)));
    	double h = b * Math.sin(Math.toRadians(C));

    	System.out.println(S);
    	System.out.println(L);
    	System.out.println(h);
    }
}