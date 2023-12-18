import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();

		double degh = h*30 + m/2 ;
		double degm = m*6 ;
		double degx = Math.max(degm,degh)-Math.min(degm,degh);
		if ( degx>180d ) degx = 360d-degx;
		double radx = Math.toRadians(degx) ;

		double cc = (double)(a*a) + (double)(b*b) - 2d*(double)a*(double)b*Math.cos(radx) ;
		double c = Math.sqrt(cc);

		System.out.println(c);
	}
}