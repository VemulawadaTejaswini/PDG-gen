import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<Double> listX = new ArrayList<Double>();
		List<Double> listY = new ArrayList<Double>();
		while(scan.hasNext()){
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			double c = scan.nextDouble();
			double d = scan.nextDouble();
			double e = scan.nextDouble();
			double f = scan.nextDouble();
			double y = (f * a - d * c)/(-d * b + e * a);
			double x = (f * b - e * c)/(b * d - e * a);
			if(x == 0)x = 0.;
			if(y == 0)y = 0.;
			System.out.printf("%.3f %.3f\n", x, y);
		}
	}
}