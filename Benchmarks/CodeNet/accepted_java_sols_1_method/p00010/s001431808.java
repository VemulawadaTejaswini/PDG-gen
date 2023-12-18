import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		double x1,x2,x3,y1,y2,y3,xp,yp,r,a1,a2,b1,b2,c1,c2,a,b;
		n=s.nextInt();
		for(int i=0;i<n;i++){
			x1=s.nextDouble();
			y1=s.nextDouble();
			x2=s.nextDouble();
			y2=s.nextDouble();
			x3=s.nextDouble();
			y3=s.nextDouble();
			
			a1=2*(x1-x2);//a
			b1=2*(y1-y2);//b
			//c
			c1=(x1*x1)-(x2*x2)+(y1*y1)-(y2*y2);
			a2=2*(x2-x3);//d
			b2=2*(y2-y3);//e
			c2=(x2*x2)-(x3*x3)+(y2*y2)-(y3*y3);
			
			if(c1*b2-b1*c2==0 ||a1*b2-a2*b1==0)xp=0;
			else
			xp=(c1*b2-b1*c2)/(a1*b2-a2*b1);
			if(c1*a2-c2*a1==0 ||a2*b1-a1*b2==0)yp=0;
			else
			yp=(c1*a2-c2*a1)/(a2*b1-a1*b2);
			
			a=xp-x1;
			a=a*a;
			b=yp-y1;
			b=b*b;
			r=Math.sqrt(a+b);
			if(r==0)
				r=0;
			System.out.printf("%.3f %.3f %.3f\n",xp,yp,r);
		}//for
	}
}