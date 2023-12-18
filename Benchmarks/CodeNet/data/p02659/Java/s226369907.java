import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long a =scn.nextLong();
		double b =scn.nextDouble();
		 double c = (a*1.0)*b;
		long d = (long)Math.floor(c);
		System.out.println(d);

	}

}