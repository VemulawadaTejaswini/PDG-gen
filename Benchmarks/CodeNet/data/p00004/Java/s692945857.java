import java.text.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		DecimalFormat fm = new DecimalFormat("0.000");
		while(in.hasNext()){
			double a = in.nextDouble();
			double b = in.nextDouble();
			double c = in.nextDouble();
			double d = in.nextDouble();
			double e = in.nextDouble();
			double f = in.nextDouble();
			b = b*d;
			c = c*d;
			e = e*a;
			f = f*a;
			a = a*d;
			d = a;
			double y = (c-f)/(b-e);
			double x = (c-b*y)/a;
			System.out.println(fm.format(x)+" "+fm.format(y));
		}
	}
}