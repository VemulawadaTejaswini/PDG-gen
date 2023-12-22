import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		double r1 = sc.nextDouble(); //hour
		double r2 = sc.nextDouble();
		double h = sc.nextDouble();
		double m = sc.nextDouble();
		
		double deg1 = ((h-3)*-30) + (m/-2);
		double deg2 = ((m-15)*-6);
		while(deg1<0)deg1+=360d;
		while(deg2<0)deg2+=360d;
		
//		System.out.println(deg1 + " " + deg2 + " degrees");
		//current unit: 360 degs
		//convert to rad
		deg1 = (deg1*Math.PI)/180;
		deg2 = (deg2*Math.PI)/180;
		
//		System.out.println(deg1 + " " + deg2 + " in rad");
		
		double x1 = Math.cos(deg1) * r1;
		double y1 = Math.sin(deg1) * r1;
		
		double x2 = Math.cos(deg2) * r2;
		double y2 = Math.sin(deg2) * r2;
		
//		System.out.printf("pos " + x1 + " " + y1 + ", " + x2 + " " + y2);
		
		double xx = (x1-x2)*(x1-x2);
		double yy = (y1-y2)*(y1-y2);
//		System.out.println("\n xxyy: " + xx + " " + yy);
		
		double dis = Math.sqrt(xx+yy);
		System.out.printf("%.16f\n", dis);
//		System.out.println("test "+ dis);
		
//		double dis2 = (r1*r1) + (r2*r2) - (2*r1*r2*Math.cos(deg1-deg2));
//		dis2 = Math.sqrt(dis2);
//		System.out.println(dis2);
	}

}
