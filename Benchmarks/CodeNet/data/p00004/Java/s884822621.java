import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double e = sc.nextDouble();
			double f = sc.nextDouble();
					   b = b*d;
					   c = c*d;
					   e = e*a;
					   f = f*a;
					double y = (c-f)/(b-e);
					double x = (c-(b*y))/(a*d);
					if(x==0)x=0;
					if(y==0)y=0;
				System.out.printf("%.3f %.3f\n", x, y);
		}
	}
}