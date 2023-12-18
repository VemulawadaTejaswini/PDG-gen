import java.util.*;
public class Main{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int h = Integer.parseInt(scan.next());
		int m = Integer.parseInt(scan.next());

		double theta_short = h*30 + m*0.5;
		double theta_long = m*6;

		double theta = Math.min(Math.abs(theta_long - theta_short), 360 - Math.abs(theta_long - theta_short));

		System.out.print(Math.pow(a*a + b*b -2*a*b*Math.cos(Math.toRadians(theta)),0.5));

	}
}

