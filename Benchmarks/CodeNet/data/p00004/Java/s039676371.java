import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e,f;
		double x=0,y=0;
		while(sc.hasNext()){
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			d=sc.nextInt();
			e=sc.nextInt();
			f=sc.nextInt();
			y=(c*d-f*a)/(b*d-e*a);
			x=(c-b*y)/a;
			BigDecimal xans = new BigDecimal(x);
			BigDecimal yans = new BigDecimal(y);
			xans=xans.setScale(4, BigDecimal.ROUND_HALF_UP);
			yans=yans.setScale(4, BigDecimal.ROUND_HALF_UP);
			System.out.println(xans.doubleValue()+" "+yans.doubleValue());
		}
	}
}