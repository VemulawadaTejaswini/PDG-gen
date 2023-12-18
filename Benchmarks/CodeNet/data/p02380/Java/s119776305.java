import java.util.Scanner;
 
public class Main {
Scanner sc = new Scanner(System.in);
    	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	double S, L, h;
	S = 0.5 * a * b * Math.sin(Math.PI * c / 180);
	double d = Math.sqrt( a * a + b * b - 2 * a * b * Math.cos(Math.PI * c / 180));
	System.out.printf("%.10f\n", S);
	System.out.printf("%.10f\n", a + b + d);
	System.out.printf("%.10f\n", 2 * S / a);
    }
}
