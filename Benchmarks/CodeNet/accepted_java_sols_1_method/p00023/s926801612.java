import java.util.*;
public class Main{
	private static Scanner sc=new Scanner(System.in);
	public static void  main(String[]agrs){
		double xa,ya,ra,xb,yb,rb,xab,yab,xly,rab;
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		xa=sc.nextDouble();
		ya=sc.nextDouble();
		ra=sc.nextDouble();
		xb=sc.nextDouble();
		yb=sc.nextDouble();
		rb=sc.nextDouble();
		xab=Math.abs(xa-xb);
		yab=Math.abs(ya-yb);
		rab=Math.abs(ra-rb);
		xly=Math.sqrt(Math.pow(xab,2)+Math.pow(yab,2));
			if(ra>xly+rb)System.out.println(2);
			else if(rb>xly+ra)System.out.println(-2);
			else if(ra+rb>=xly)System.out.println(1);
			else if(ra+rb<xly)System.out.println(0);
		}
		
	}
}