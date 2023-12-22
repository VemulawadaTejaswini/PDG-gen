import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();

		int deg2h = h*60 + m ;
		int deg2m = m*12 ;
		int deg2x = Math.max(deg2m,deg2h)-Math.min(deg2m,deg2h);
		if ( deg2x>360 ) deg2x = 720-deg2x;
		double radx = Math.toRadians((double)(deg2x/2d)) ;

		double cc = (double)(a*a) + (double)(b*b) - 2d*(double)a*(double)b*Math.cos(radx) ;
		double c = Math.sqrt(cc);

		System.out.println(c);
	}
}