import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	Scanner in = new Scanner(System.in);
		
		try {
			while(in.hasNextDouble()) {
				// ax + by = c
				double a = in.nextDouble();
				double b = in.nextDouble();
				double c = in.nextDouble();
				// dx + ey = f
				double d = in.nextDouble();
				double e = in.nextDouble();
				double f = in.nextDouble();
				
    			double x = (c * e - b * f) / (a * e - b * d);
				double y = (a * f - c * d) / (a * e - b * d);
			
				if(x == 0.000) {
					x = 0.000;
				}
				if(y == 0.000) {
					y = 0.000;
				}
				
				System.out.printf(String.format("%.3f %.3f\n", x, y));
			}
		} catch(IllegalStateException ie) {
			// 入力失敗
			System.exit(0);
		}
	}
}