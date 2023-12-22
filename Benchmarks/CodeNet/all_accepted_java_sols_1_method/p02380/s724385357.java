import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static double a=sc.nextDouble();
	private static double b=sc.nextDouble();
	private static int c=sc.nextInt();
	private static double s,l,h;
	public static void main(String[] args){
		s=(a*b*Math.sin(c*Math.PI/180))/2;
		h=b*Math.sin(c*Math.PI/180);
		l=a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(c*Math.PI/180));
		System.out.println(s);
		System.out.println(l);
		System.out.println(h);
	}
}