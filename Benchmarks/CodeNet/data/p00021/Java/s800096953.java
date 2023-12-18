import java.math.*;
import java.text.*;
import java.lang.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++){
			double x1 = in.nextDouble(), y1 = in.nextDouble(),
					x2 = in.nextDouble(), y2 = in.nextDouble(),
					x3 = in.nextDouble(), y3 = in.nextDouble(),
					x4 = in.nextDouble(), y4 = in.nextDouble();
			x1 -= x2; y1 -= y2;
			x3 -= x4; y3 -= y4;
			if(Math.abs(Math.hypot(x1, y1)*Math.hypot(x3, y3)-Math.abs(x1*x3+y1*y3))<1e-6){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}

}