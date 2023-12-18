import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		double A = in.nextDouble();
		double B = in.nextDouble();
		double ho = in.nextDouble();
		double mi = in.nextDouble();
		
		double rad = 60/mi;
		double radMi = 360/rad;
		double radiHo = (ho*30) + (30/rad);
		
		double radian = 0;
		if(radiHo > radMi){radian = radiHo - radMi;}
		else{radian = radMi - radiHo;}
		
		double result = (A*A) + (B*B) - 2*A*B* Math.cos(Math.toRadians(radian));
		double ans = Math.sqrt(result);
		System.out.println(ans);
		
		
      
	}
}