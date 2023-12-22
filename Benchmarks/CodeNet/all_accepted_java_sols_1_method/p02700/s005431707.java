import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();
		double B = sc.nextInt();
		double C = sc.nextInt();
		double D = sc.nextInt();
		
		System.out.println((Math.ceil(C / B) <= Math.ceil(A / D))?"Yes":"No");
		sc.close();
	}
}