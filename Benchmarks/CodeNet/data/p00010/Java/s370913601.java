import java.util.*;
public class Main {
	final double EPS =1.0e-8;

	private double [] getInterSectP(double a, double b, double c, double d, double e, double f) {
		double [] result = new double[2];
		double temp1 = a * e - d * b;
		double temp2 = c * e - f * b;
		double x = temp2 / temp1;
		double y = ((double)c - x * a) / b;
		if(x == -0.0){
			x = 0.0;
		}
		result[0] = x;
		result[1] = y;
		return result;
	}

	private double [] getLine(double x1, double y1, double x2, double y2){
		double [] result = new double[3];
		double xDiff = x2 - x1;
		if(Math.abs(xDiff) < EPS){
			result[0] = 1.0;
			result[1] = 0.0;
			result[2] = x1;
		}
		else{
			result[0] = (y2-y1) / xDiff;
			result[1] = 1.0;
			result[2] = y1 - result[0] * x1;
		}
		return result;
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			double [] x = new double[3];
			double [] y = new double[3];
			for(int i=0; i < 3; i++){
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			double [] midx = new double[2];
			double [] midy = new double[2];
			double [][] oldline = new double[2][3];
			for(int i=0; i < 2; i++){
				midx[i] = (x[i+1] + x[(i+2) % 3]) / 2;
				midy[i] = (y[i+1] + y[(i+2) % 3]) / 2;
				oldline[i] = getLine(x[i+1], y[i+1], x[(i+2)%3], y[(i+2)%3]);
			}
			double [][] line = new double[2][3];
			for(int i=0; i < 2; i++){
				if(oldline[i][1] == 0){
					line[i][0] = 0.0;
					line[i][1] = 1.0;
					line[i][2] = midy[i];
				}
				else if(oldline[i][0] == 0){
					line[i][0] = 1.0;
					line[i][1] = 0.0;
					line[i][2] = midx[i];
				}
				else{
					line[i][0] = 1.0 / oldline[i][0];
					line[i][1] = 1.0;
					line[i][2] = midy[i] + line[i][0] * midx[i];
				}
			}
			double [] result = getInterSectP(line[0][0], line[0][1], line[0][2], line[1][0], line[1][1], line[1][2]);
			double dis = Math.sqrt((result[0] - x[0]) * (result[0] - x[0]) + (result[1] - y[0]) * (result[1] - y[0]));
			System.out.printf("%1.3f %1.3f %1.3f\n",result[0],result[1],dis);

		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}