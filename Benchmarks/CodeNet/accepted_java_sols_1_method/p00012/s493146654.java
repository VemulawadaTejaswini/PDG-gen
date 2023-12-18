import java.math.BigDecimal;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			double x1=in.nextDouble(),y1=in.nextDouble();
			double x2=in.nextDouble(),y2=in.nextDouble();
			double x3=in.nextDouble(),y3=in.nextDouble();
			double px=in.nextDouble(),py=in.nextDouble();
			
			double a=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
			double b=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
			double c=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
			
			double ap=Math.sqrt((x1-px)*(x1-px)+(y1-py)*(y1-py));
			double bp=Math.sqrt((x2-px)*(x2-px)+(y2-py)*(y2-py));
			double cp=Math.sqrt((x3-px)*(x3-px)+(y3-py)*(y3-py));
			
			double s=(a+b+c)/2;
			double S=Math.sqrt(s*(s-a)*(s-b)*(s-c));
			double as=(a+ap+bp)/2;
			double aS=Math.sqrt(as*(as-a)*(as-ap)*(as-bp));
			double bs=(b+bp+cp)/2;
			double bS=Math.sqrt(bs*(bs-b)*(bs-bp)*(bs-cp));
			double cs=(c+cp+ap)/2;
			double cS=Math.sqrt(cs*(cs-c)*(cs-cp)*(cs-ap));
			double pS=aS+bS+cS;
			
			BigDecimal bi1 = new BigDecimal(String.valueOf(S));
			BigDecimal bi2 = new BigDecimal(String.valueOf(pS));
			double k1= bi1.setScale(9, BigDecimal.ROUND_HALF_UP).doubleValue();
			double k2= bi2.setScale(9, BigDecimal.ROUND_HALF_UP).doubleValue();
			if(k1==k2)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}