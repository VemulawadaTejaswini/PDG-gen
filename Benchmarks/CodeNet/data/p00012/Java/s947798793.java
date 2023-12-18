import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		while((s=br.readLine())!=null){
			double x1 = Double.parseDouble(s.split(" ")[0]);
			double y1 = Double.parseDouble(s.split(" ")[1]);
			double x2 = Double.parseDouble(s.split(" ")[2]);
			double y2 = Double.parseDouble(s.split(" ")[3]);
			double x3 = Double.parseDouble(s.split(" ")[4]);
			double y3 = Double.parseDouble(s.split(" ")[5]);
			double xp = Double.parseDouble(s.split(" ")[6]);
			double yp = Double.parseDouble(s.split(" ")[7]);
			
			if(inTriangle(x1,y1,x2,y2,x3,y3,xp,yp))
				System.out.println("YES");
			else 	
				System.out.println("NO");
		}
	}
	private static boolean inTriangle(double x1, double y1, double x2, double y2, double x3, double y3, double xp, double yp)
	{
		// equation -> y = [0]x + [1]
		double[] eq12 = new double[2];
		double[] eq13 = new double[2];
		double[] eq23 = new double[2];
		
		eq12[0] = (y2-y1) / (x2-x1);
		eq12[1] = y1 - x1 * eq12[0];
		eq13[0] = (y3-y1) / (x3-x1);
		eq13[1] = y1 - x1 * eq13[0];
		eq23[0] = (y3-y2) / (x3-x2);
		eq23[1] = y2 - x2 * eq23[0];
		
		if(yp > (eq12[0] * xp + eq12[1])) {
			if(y3 < (eq12[0] * x3 + eq12[1])) return false;
		} else
			if(y3 > (eq12[0] * x3 + eq12[1])) return false;
		if(yp > (eq13[0] * xp + eq13[1])) {
			if(y2 < (eq13[0] * x2 + eq13[1])) return false;
		} else
			if(y2 > (eq13[0] * x2 + eq13[1])) return false;
		if(yp > (eq23[0] * xp + eq23[1])) {
			if(y1 < (eq23[0] * x1 + eq23[1])) return false;
		} else
			if(y1 > (eq23[0] * x1 + eq23[1])) return false;
		return true;
	}
}