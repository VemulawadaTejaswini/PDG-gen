import java.util.Scanner;
import java.util.Date;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int X,Y;
	double  a,b,c,d,e,f,x,y;
	while(sc.hasNext()){
	    a=sc.nextInt();	   
	    b=sc.nextInt();
	    c=sc.nextInt();
	    d=sc.nextInt();
	    e=sc.nextInt();
	    f=sc.nextInt();
	    x=(c*e-b*f)/(a*e-d*b);
	    if(b!=0) y= (c-a*x)/b;
	    else y=(f-d*x)/e;
	    X=(int)(x*100);
	    Y=(int)(y*100);
	    x=(double)X/100;
	    y=(double)Y/100;
	    System.out.printf("%.3f %.3f",x,y);
	}
    }
}