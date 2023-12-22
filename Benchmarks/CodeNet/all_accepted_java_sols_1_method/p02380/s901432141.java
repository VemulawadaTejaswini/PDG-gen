import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double C=Math.toRadians(c);
		double S=0.5*a*b*Math.sin(C);
		double L=a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(C));
		double h=b*Math.sin(C);
		System.out.printf("%.8f\n", S);
		System.out.printf("%.8f\n", L);
		System.out.printf("%.8f\n", h);
	}
}