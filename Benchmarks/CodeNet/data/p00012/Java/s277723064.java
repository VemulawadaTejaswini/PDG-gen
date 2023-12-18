import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;

import java.lang.Math;

public class Main{
	
		static double[] x = new double[4];
		static double[] y = new double[4];
		static double[] a = new double[3];
		static double[] b = new double[3];
		
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		roop:while(s.hasNextDouble()){
			for(int i = 0; i < 4; i++){
				x[i] = s.nextDouble();
				y[i] = s.nextDouble();
			}
			
			double xmax_ = x[0];
			double xmin_ = x[0];
			double ymax_ = y[0];
			double ymin_ = y[0];
			int xmax = 0;
			int xmin = 0;
			int ymax = 0;
			int ymin = 0;
			int xno = 0, yno = 0;
			
			for (int i = 1; i < 3; i++) {
			    double v = x[i];
			    double w = y[i];
			    if (v > xmax_) {
			        xmax_ = v;
					xmax = i;
			    }
			    if (v < xmin_) {
			        xmin_ = v;
					xmin = i;
			    }
			    if (w > ymax_) {
			        ymax_ = w;
					ymax = i;
			    }
			    if (w < ymin_) {
			        ymin_ = w;
					ymin = i;
			    }
			}
	
			for(int i = 0; i < 3; i++){
				if(i != ymax && i != ymin) yno = i;
				if(i != xmax && i != xmin) xno = i;
			}
			
			double[] a = {a(ymax, ymin), a(yno, ymax), a(ymin, yno)};
			double[] b = {b(ymax, ymin), b(yno, ymax), b(ymin, yno)};
			
			boolean flag = false;
			
			if(x[ymax] == xmax_ || x[ymax] == xmin_)
					flag = true;
				boolean f = false;
				if(xmin_ <= x[3] && xmax_ >= x[3] && ymin_ <= y[3] && ymax_ >= y[3]){
					int abc = 0;
					for(int j = 0; j < 3; j++){
						double l = liner(x[3], a[j], b[j]);
						if(l > y[3] && !Double.isNaN(l)) abc++;
						else if(l < y[3] && !Double.isNaN(l)) abc--;
						else if(l == y[3] || (Double.isNaN(l) && x[j] == x[3])){
							System.out.println("NO");
							continue roop;
						}
						//System.out.println(l + " " + y[3] + " " + abc);
					}
					//System.out.println(" " + abc + " " + flag);
					if((flag && abc<=0) || (!flag && abc>=0)){
						f = true;
					}
				}
				if(f)
				System.out.println("YES");
				else
				System.out.println("NO");
				
		}
	}
	
	static double liner(double n, double a, double b){
		return a*n+b;
		
	}
	
	static double a(int i, int j){
		return ((y[i]-y[j])/(x[i]-x[j]));
	}
	
	static double b(int i, int j){
		return (y[i]-x[i]*((y[i]-y[j])/(x[i]-x[j])));
	}
	
}
