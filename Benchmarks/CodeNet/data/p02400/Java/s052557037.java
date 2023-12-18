import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		double a,b;
		a=1.0*r*r*3.141592;
		b=1.0*(2*r)*3.141592;
		System.out.println(a+" "+b);
	}
}
