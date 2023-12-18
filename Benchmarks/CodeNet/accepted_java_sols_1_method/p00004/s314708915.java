import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		while(scan.hasNext()){
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			double c = scan.nextDouble();
			double d = scan.nextDouble();
			double e = scan.nextDouble();
			double f = scan.nextDouble();
			double x, y;
			y = (f * a - d * c)/(-d * b + e * a);
			x = (f * b - e * c)/(b * d - e * a);
			if(x == 0)x = 0.;
			if(y == 0)y = 0.;
			System.out.printf("%.3f %.3f\n", x, y);
		}
	}
}