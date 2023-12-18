import java.util.*;
import java.math.*;

public class Main {
    public static void main (String [] args) {
	Scanner in = new Scanner(System.in);

	double a = in.nextDouble(), b = in.nextDouble(), C = in.nextDouble();
	C = Math.toRadians(C);

	double c = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(C));
	double S = 0.5*a*b*Math.sin(C);
	double L = a + b + c;
	double h = b*Math.sin(C);

	System.out.printf("%.8f\n" ,S);
	System.out.printf("%.8f\n" ,L);
	System.out.printf("%.8f\n" ,h);

    }
}