import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		double a,b;
		a=r*r*(Math.PI);
		b=(2*r)*(Math.PI);
		System.out.print(String.format("%2.6f",a));
		System.out.print(" ");
		System.out.println(String.format("%2.6f",b));
	}
}
