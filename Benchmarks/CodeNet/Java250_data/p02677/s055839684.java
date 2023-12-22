import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		int h=sc.nextInt();
		int m=sc.nextInt();
		double ang=Math.abs(30*h-5.5*m);
		ang=ang*(Math.PI/180);
		System.out.println(Math.sqrt(a*a+b*b-2*a*b*Math.cos(ang)));
	}
}
