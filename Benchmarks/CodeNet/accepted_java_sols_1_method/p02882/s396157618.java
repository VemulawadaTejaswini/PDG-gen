import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double x = sc.nextInt();
		if(x == a*a*b)
			System.out.println(0);
		else if(x > a*a*b/2)
			System.out.println(Math.atan((2*b-2*x/a/a)/a)/Math.PI*180);
		else
			System.out.println(Math.atan(b*b*a/x/2)/Math.PI*180);

	}

}
