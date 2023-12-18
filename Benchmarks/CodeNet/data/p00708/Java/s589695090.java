import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			double[][] cost = new double[n][n];
			for(int i=0;i<n;i++) Arrays.fill(cost[i], Integer.MAX_VALUE);
			
			double[] x = new double[n];
			double[] y = new double[n];
			double[] z = new double[n];
			double[] r = new double[n];
			for(int i=0;i<n;i++){
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
				z[i] = sc.nextDouble();
				r[i] = sc.nextDouble();
				for(int j=i-1;j>=0;j--){
					double a = Math.sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j])+(z[i]-z[j])*(z[i]-z[j]));
					cost[i][j] = Math.max(0, a-r[i]-r[j]);
					cost[j][i] = cost[i][j];
				}
			}
				
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(0);
			double sum = 0;
			double q;
			int s = 0;
			int p;
			for(int i=1;i<n;i++){
				q = Integer.MAX_VALUE;
				for(int j=0;j<i;j++){
					p = list.get(j);
					for(int k=0;k<n;k++){
						if(list.contains(k)==false && q>cost[p][k]){
			  				q = cost[p][k];
							s = k;
						}
					}
				}
				list.add(s);
			 	sum += q;
			}
			
			System.out.printf("%.3f\n", sum);
		}	
	}	
}