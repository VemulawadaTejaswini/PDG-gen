import java.util.Scanner;

public class Main{

	static final Scanner s=new Scanner(System.in);

	public static void main(String args[]){
		int a=s.nextInt(),b=s.nextInt();
		double d = Math.toRadians(s.nextInt());
		System.out.println(a*b*Math.sin(d)/2);
		System.out.println(
				a+b+
				Math.sqrt(
						a*a+b*b-2*a*b*Math.cos(d)
						)
				);
		System.out.println(b*Math.sin(d));
	}
}