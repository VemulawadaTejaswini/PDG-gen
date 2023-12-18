import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double e = sc.nextDouble();
			double f = sc.nextDouble();
			
			double x = (e*c - b*f)/(a*e - d*b);
			double y = (d*c - a*f)/(b*d - a*e);
			
			if(x==0.0) {
				x=0;
			}
			if(y==0.0) {
				y=0;
			}
			System.out.printf("%.3f %.3f\n", x, y);
		}
	}
}

