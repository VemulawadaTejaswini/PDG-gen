import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a,b,C;
		double S,L,h;
		
		a = (double)sc.nextInt();
		b = (double)sc.nextInt();
		C = (double)sc.nextInt();
		
		S = calcS(a,b,C);
		L = calcL(a,b,C);
		h = calch(a,C);
		
		System.out.printf("%.6f\n%.6f\n%.6f\n",S,L,h);
	}
	
	private static double calcS(double a,double b,double C){
		return (a * ( b * Math.sin(C))) / 2;
	}
	
	private static double calcL(double a,double b,double C){
		return Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2 * a * b * Math.sin(C));
	}
	
	private static double calch(double a,double C){
		return a * Math.sin(C);
	}
}