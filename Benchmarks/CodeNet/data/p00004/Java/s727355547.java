package aoj;
import java.util.Scanner;
public class Renritsuhouteisiki {
	
	static int a,b,c,d,e,f;
	static double x,y;

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner s = new Scanner(System.in);
		while(true){
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		d = s.nextInt();
		e = s.nextInt();
		f = s.nextInt();
		x = (e*c-b*f)/(a+e-b*d);
		y = (a*f-d*c)/(a*e-b*d);
		System.out.printf("%4.3f",x);
		System.out.print(" ");
		System.out.printf("%4.3f",y);
		}
	}

}