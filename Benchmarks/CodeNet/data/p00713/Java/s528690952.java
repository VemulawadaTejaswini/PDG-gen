
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true){
			int n = Integer.parseInt(stdIn.next());
			if(n==0){
				break;
			}
			double[] x = new double[n];
			double[] y = new double[n];
			for(int i=0;i<n;i++){
				x[i] = Double.parseDouble(stdIn.next());
				y[i] = Double.parseDouble(stdIn.next());
			}
			int[] sign = {+1,-1};
			int counter = 1;
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					double l = Math.sqrt(Math.pow(x[i]-x[j],2)+Math.pow(y[i]-y[j],2));
					if(l>4.0+Math.pow(10,-6)){
						continue;
					}
					double mx = (x[i]+x[j])/2.0;
					double my = (y[i]+y[j])/2.0;
					double vx = (x[j]-x[i])/2.0;
					double vy = (y[j]-y[i])/2.0;
					double e = Math.sqrt(1.0-l*l/4.0);
					for(int k=0;k<2;k++){
						double px = mx + sign[k]*e*vy;
						double py = my + sign[k]*e*vx;

						int cnt = 2;
						for(int s=0;s<n;s++){
							if(s==i||s==j){
							continue;
							}
							if((px-x[s])*(px-x[s])+(py-y[s])*(py-y[s])<1.0+Math.pow(10,-6)){
								cnt++;
							}
						}
						if(counter<cnt){
							counter = cnt;
						}				
					}
				}
			}


			out.println(counter);
			out.flush();
		}
	}
}