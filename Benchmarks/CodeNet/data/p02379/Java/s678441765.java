import java.util.*;
import java.lang.Math;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x1=(double)sc.nextInt();
		double y1=(double)sc.nextInt();
		double x2=(double)sc.nextInt();
		double y2=(double)sc.nextInt();
		double n=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		double answer = Math.sprt(n);
		System.out.printf("%.5f",answer);
		System.out.pritnln("");
	}
}