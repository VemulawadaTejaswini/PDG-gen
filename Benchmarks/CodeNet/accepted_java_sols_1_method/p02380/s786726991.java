import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    	int i, j, k;
    	
    	double a = sc.nextDouble();
    	double b = sc.nextDouble();
    	double c = sc.nextDouble();
    	
    	double S = a * b * Math.sin(Math.toRadians(c)) / 2;
    	double L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(c)));
    	double h = 2 * S / a;
    	
    	System.out.printf("%f\n%f\n%f", S, L, h);
    }
}
