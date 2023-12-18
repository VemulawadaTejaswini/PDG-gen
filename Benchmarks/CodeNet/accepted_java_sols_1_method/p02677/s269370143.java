import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();
		double B = sc.nextInt();
		double H = sc.nextInt();
		double M = sc.nextInt();
		double X = (M*11/360 - H/6) * Math.PI;
		System.out.println(Math.pow(A*A+B*B-2*A*B*Math.cos(X), 0.5));
	}

}