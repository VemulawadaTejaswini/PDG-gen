import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c,d,e,f;
		double x,y;
		
		while(sc.hasNext()){
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			d = sc.nextDouble();
			e = sc.nextDouble();
			f = sc.nextDouble();
			
			y = (f*a-c*d)/(a*e-b*d);
			x = (c-b*y)/a;
			if(x==(-0.0)) Math.abs(x);
			if(y==(-0.0)) Math.abs(y);
			System.out.printf("%.3f %.3f\n", x,y);
		}
	}

}