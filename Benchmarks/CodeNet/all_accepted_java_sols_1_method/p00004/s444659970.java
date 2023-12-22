import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double e = sc.nextDouble();
			double f = sc.nextDouble();
			double x;
			double y;
			/*
			ax + by = c
			dx + ey = f
			*/
			y = (c*d - f*a) / (b*d - e*a);
			x = (c - b*y)/a;
			System.out.printf("%.3f %.3f\n",x,y);
		}
	}
}