import java.util.*;

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
			x = (c*e - b*f)/(a*e - b*d);
			y = (c*d - a*f)/(b*d - a*e);
			System.out.printf("%3f %3f",x,y);
		}
	}
}