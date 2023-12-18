import java.util.Scanner;
import java.lang.Math;

public class Main{
	
	public static void main(String[] args){
		
		double[] x = new double[3];
		double[] y = new double[3];
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < x.length; i++){
			
			x[i] = s.nextDouble();
			y[i] = s.nextDouble();
		}
		
		double px, py, r;
		
		px = ((y[0]-y[2])*(y[0]*y[0] - y[1]*y[1] + x[0]*x[0] - x[1]*x[1]) - (y[0]-y[1])*(y[0]*y[0] - y[2]*y[2] + x[0]*x[0] - x[2]*x[2])) / (2*(y[0]-y[2])*(x[0]-x[1]) - 2*(y[0]-y[1])*(x[0]-x[2]));
		py = ((x[0]-x[2])*(x[0]*x[0] - x[1]*x[1] + y[0]*y[0] - y[1]*y[1]) - (x[0]-x[1])*(x[0]*x[0] - x[2]*x[2] + y[0]*y[0] - y[2]*y[2])) / (2*(x[0]-x[2])*(y[0]-y[1]) - 2*(x[0]-x[1])*(y[0]-y[2]));

		r = Math.sqrt(Math.pow(px-x[0], 2)+Math.pow(py-y[0], 2));
		
		System.out.printf("%.3f %.3f %.3f\n", px, py, r);
		
	}
	
}
