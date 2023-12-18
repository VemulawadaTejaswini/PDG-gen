import java.util.*;
public class Main{
	private static Scanner sc=new Scanner(System.in);
	public static void  main(String[]agrs){
		double x1,x2,x3,y1,y2,y3,x4,y4;
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		x3=sc.nextDouble();
		y3=sc.nextDouble();
		x4=sc.nextDouble();
		y4=sc.nextDouble();
		double a1,a2,b1,b2;
		a1=x2-x1;a2=y2-y1;
		b1=x4-x3;b2=y4-y3;
		double ans1 =a1*b2-a2*b1;
		double ans2 = a2 * b1 - a1 * b2;
		if(ans1==0 || ans2 == 0)System.out.println("YES");
		else System.out.println("NO");  
		}
		
	}
}