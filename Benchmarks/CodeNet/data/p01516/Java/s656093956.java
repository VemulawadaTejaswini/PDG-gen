import java.util.*;
import java.awt.geom.*;
import java.awt.geom.Line2D.Double;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int l = sc.nextInt();
			if(n==0 && m==0 && l==0) break;
			
			Line2D.Double[] z = new Line2D.Double[5*n];
			double[] x = new double[5*n];
			double[] y = new double[5*n];
			double[][] cost = new double[n][n];
			for(int i=0;i<n;i++){
				Arrays.fill(cost[i], Integer.MAX_VALUE);
				cost[i][i] = 0;
			}	
			
			for(int i=0;i<n;i++){
				int p = sc.nextInt();
				int q = sc.nextInt();
				double a = sc.nextDouble();
				int r = sc.nextInt();
				for(int j=0;j<5;j++){
					x[5*i+j] = p - Math.sin((a+72*j)*Math.PI/180)*r;
					y[5*i+j] = q + Math.cos((a+72*j)*Math.PI/180)*r;
				}
				z[5*i] = new Line2D.Double(x[5*i], y[5*i], x[5*i+2], y[5*i+2]);
				z[5*i+1] = new Line2D.Double(x[5*i+2], y[5*i+2], x[5*i+4], y[5*i+4]);
				z[5*i+2] = new Line2D.Double(x[5*i+4], y[5*i+4], x[5*i+1], y[5*i+1]);
				z[5*i+3] = new Line2D.Double(x[5*i+1], y[5*i+1], x[5*i+3], y[5*i+3]);
				z[5*i+4] = new Line2D.Double(x[5*i+3], y[5*i+3], x[5*i], y[5*i]);
				
				for(int j=i-1;j>=0;j--){
					double min = Integer.MAX_VALUE;
					for(int c=0;c<5;c++){
						for(int d=0;d<5;d++){
							min = Math.min(min, z[5*j+d].ptSegDist(x[5*i+c], y[5*i+c]));
							min = Math.min(min, z[5*i+c].ptSegDist(x[5*j+d], y[5*j+d]));
							if(z[5*j+d].intersectsLine(z[5*i+c])==true){
								min = 0;
								c = 5;
								d = 5;
							}
						}
					}
					
					cost[i][j] = min;
					cost[j][i] = min;
				}
			}
			
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					for(int k=0;k<n;k++){
						if(cost[j][i]!=Integer.MAX_VALUE && cost[i][k]!=Integer.MAX_VALUE){
							cost[j][k] = Math.min(cost[j][k], cost[j][i]+cost[i][k]);
						}
					}
				}
			}
			
			System.out.println(cost[m-1][l-1]);	
		}	
	}	
}