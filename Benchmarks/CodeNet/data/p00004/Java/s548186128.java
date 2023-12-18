import java.util.Scanner;
import java.util.Date;
import java.math.BigDecimal;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double  a,b,c,d,e,f,x,y;
	while(sc.hasNext()){
	    a=sc.nextDouble();	   
	    b=sc.nextDouble();
	    c=sc.nextDouble();
	    d=sc.nextDouble();
	    e=sc.nextDouble();
	    f=sc.nextDouble();
	    x=(c*e-b*f)/(a*e-d*b);
	    if(b!=0) y= (c-a*x)/b;
	    else y=(f-d*x)/e;
 BigDecimal bi = new BigDecimal(String.valueOf(x));
 BigDecimal bi2 = new BigDecimal(String.valueOf(y));
 double x3= bi.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
 double y3= bi2.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
	    System.out.printf("%.3f %.3f\n",x3+0,y3+0);
	}
    }
}