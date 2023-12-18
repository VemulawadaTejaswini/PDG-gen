import java.util.*;
public class Main{
	public static void main(String[] args){
	Scanner sc= new Scanner (System.in);
	double a,b,c,d,e,f;
	
	while(sc.hasNextInt()){
		a=sc.nextInt();
		int tmp=(int) a;
		b=sc.nextInt();
		int tmp2=(int) b;
		c=sc.nextInt();
		int tmp3=(int) c;
		d=sc.nextInt();
		e=sc.nextInt();
		f=sc.nextInt();
		a*=d; b*=d; c*=d;
		d*=tmp;e*=tmp; f*=tmp;
		b-=e;c-=f;
		b=c/b;
		double ans=(tmp3-b*tmp2)/tmp;
		System.out.printf("%.3f %.3f\n",ans,b);
	}
	}
}

	