import java.text.DecimalFormat;
import java.util.Scanner;


public class Main{


	public static void main(String[] args){

		int a,b,c;

		double w,l,h,s;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		s = (a * b* Math.sin(Math.toRadians(c)))/2;
		w = Math.sqrt(a*a + b*b);
		l = a + b + w;
		h = b * Math.sin(Math.toRadians(c));

		System.out.printf("%1.8f\n",s);
		System.out.printf("%1.8f\n",l);
		System.out.printf("%1.8f\n",h);
	}

}