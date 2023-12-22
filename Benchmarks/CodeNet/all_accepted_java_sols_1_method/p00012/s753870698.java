import java.util.Scanner;
import java.math.*;
import java.text.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextDouble()){
			double x1 = in.nextDouble(), y1 = in.nextDouble(),
				x2 = in.nextDouble(), y2 = in.nextDouble(),
				x3 = in.nextDouble(), y3 = in.nextDouble(),
				xp = in.nextDouble(), yp = in.nextDouble();
			double a1 = x2-x1, a2 = y2-y1,
				b1 = x3-x1, b2 = y3-y1,
				c1 = xp-x1, c2 = yp-y1;
			double det = a1*b2-a2*b1;
			if(det==0){
				System.out.println("NO");
				continue;
			}
			double s = (c1*b2-c2*b1)/det,
					t = (a1*c2-a2*c1)/det;
			if(s>=0 && t>=0 && s+t<=1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}