import java.util.*;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		double a,b,c,d,e,f;
		double x=0.0,y=0.0;
		while(sc.hasNext()){
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			d=sc.nextInt();
			e=sc.nextInt();
			f=sc.nextInt();
			x=(c*e-f*b)/(a*e-d*b);
			y=(c*d-f*a)/(b*d-e*a);
			if(x==0)x=0;
			if(y==0)y=0;
			System.out.printf("%.3f %.3f\n", x, y);
		}
	}
}