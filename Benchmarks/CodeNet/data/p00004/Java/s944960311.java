import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			double a = sc.nextInt();
			double b = sc.nextInt();
			double c = sc.nextInt();
			double d = sc.nextInt();
			double e = sc.nextInt();
			double f = sc.nextInt();
			double r, x, y, z ;
			r = d*c/a;
			z = -1*d*b/a;
			y = (f + (-1)*r) / (z+e);
			x = (c + (-1)*b*y) / a;

			x = (int)(x*1000 + 0.5) / (double)1000;
			y = (int)(y*1000 + 0.5) / (double)1000;
			System.out.printf("\f \f",x ,y);
		}
	}
}