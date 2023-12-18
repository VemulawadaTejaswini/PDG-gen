import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		double a=s.nextDouble();
		double b=s.nextDouble();
		
		double h=s.nextDouble();
		double m=s.nextDouble();
		
		double cosh=Math.cos(Math.toRadians(angleh(h,m)));
		double sinh=Math.sin(Math.toRadians(angleh(h,m)));
		
		double cosm=Math.cos(Math.toRadians(anglem(m)));
		double sinm=Math.sin(Math.toRadians(anglem(m)));
		
		double dist=Math.pow((a*cosh)-(b*cosm),2)+Math.pow((a*sinh)-(b*sinm), 2);
		dist=Math.sqrt(dist);
		
		System.out.println(dist);
		
	}
	
	public static double angleh(double h,double m)
	{
		double degree=0;
		
		degree=degree+(360d/12d)*h;
		degree=degree+((360d/(12*60))*m);
		
		return degree;
	}
	
	public static double anglem(double m)
	{
		double degree=0;
		
		degree=degree+((360d/60d)*m);
		
		return degree;
	}
	
}