import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double a = scn.nextInt(), b = scn.nextInt(), x = scn.nextInt();
		if(x <= a*a*b/2) {
			double h = x/(a*b)*2;
			System.out.println(90.0-Math.atan2(h, b)/Math.PI*180);
		}else {
			double h =(a*b*a-x)/(a*a)*2;
			System.out.println(Math.atan2(h,a)/Math.PI*180);
		}
	}

}
