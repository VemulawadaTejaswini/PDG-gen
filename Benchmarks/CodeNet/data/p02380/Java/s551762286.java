import java.util.*;
import java.lang.Math;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		double a= Double.parseDouble(line[0]);
		double b= Double.parseDouble(line[1]);
		double c= Double.parseDouble(line[2]);
		double s=Math.sin(c/180*Math.PI)*a*b/2;
		double l=a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(c/180*Math.PI));
		double h=Math.sin(c/180*Math.PI)*b;
		System.out.printf("%.5f/n%.5f/n%.5f/n",s,l,h);
		System.out.println();
	}
}