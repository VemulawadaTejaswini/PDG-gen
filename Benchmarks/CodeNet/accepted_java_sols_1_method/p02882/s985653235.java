/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,x;
		a = sc.nextDouble();
		b = sc.nextDouble();
		x = sc.nextDouble();
		
		double ans = Math.atan( (b- (x/ (a*a)))* (2.0/a));
		if(a*(Math.sin(ans)) > (b*(Math.cos(ans))))
		{
			ans = Math.atan(a*b*b/ (2.0*x)) ;

		}
		ans = Math.toDegrees(ans);
// 		ans *= 18000;
// 		ans /= 314.15926535;
	    System.out.println(ans);
	}
}
